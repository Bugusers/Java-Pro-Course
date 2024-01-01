package org.course.hw22;

import org.course.hw22.anotations.AfterSuite;
import org.course.hw22.anotations.BeforeSuite;
import org.course.hw22.anotations.Test;

public class ExampleTestClass {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite method");
    }

    @Test(priority = 10)
    public void testMethod1() {
        System.out.println("TestMethod1");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("TestMethod2");
    }

    @Test(priority = 5)
    public void testMethod3() {
        System.out.println("TestMethod3");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite method");
    }
}
