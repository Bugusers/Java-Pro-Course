package org.course.hw22;

import org.course.hw22.anotations.AfterSuite;
import org.course.hw22.anotations.BeforeSuite;
import org.course.hw22.anotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class TestRunner {
    public static void start(Class<?> testClass) {
        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();

            validateAnnotations(testClass);

            executeBeforeSuiteMethod(testClass, testInstance);

            executeTestMethods(testClass, testInstance);

            executeAfterSuiteMethod(testClass, testInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void validateAnnotations(Class<?> testClass) throws Exception {
        int beforeSuiteCount = 0;
        int afterSuiteCount = 0;

        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteCount++;

                if(beforeSuiteCount > 1) {
                    throw new Exception("Multiple @BeforeSuite methods found in the test class.");
                }
            }

            if (method.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteCount++;

                if(afterSuiteCount > 1) {
                    throw new Exception("Multiple @AfterSuite  methods found in the test class.");
                }
            }
        }
    }


    private static void executeBeforeSuiteMethod(Class<?> testClass, Object testInstance) throws Exception {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                method.invoke(testInstance);
                break;
            }
        }
    }

    private static void executeTestMethods(Class<?> testClass, Object testInstance) throws Exception {
        var testMethods = Arrays.stream(testClass.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(Test.class))
                .sorted(Comparator.comparingInt(m -> m.getAnnotation(Test.class).priority()))
                .toArray(java.lang.reflect.Method[]::new);

        for (var method : testMethods) {
            method.invoke(testInstance);
        }
    }

    private static void executeAfterSuiteMethod(Class<?> testClass, Object testInstance) throws Exception {
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                method.invoke(testInstance);
                break;
            }
        }
    }
}
