package org.course.hw13;


import org.course.hw13.exceptions.FileAlreadyExist;
import org.course.hw13.exceptions.InconsistentPathException;
import org.course.hw13.navigator.FileData;
import org.course.hw13.navigator.FileNavigator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileNavigator fileNavigator = new FileNavigator();


            fileNavigator.add(new FileData("file1.txt", "/path1", 100), "/path1");
            fileNavigator.add(new FileData("file2.txt", "/path2", 150), "/path2");
            fileNavigator.add(new FileData("file3.txt", "/path1", 120), "/path1");


            List<FileData> filesInPath1 = fileNavigator.find("/path1");
            System.out.println("Files in path /path1: " + filesInPath1);


            //fileNavigator.remove("/path2");


            List<FileData> sortedFiles = fileNavigator.sortBySize();
            System.out.println("Sorted files by size: " + sortedFiles);


            List<FileData> filteredFiles = fileNavigator.filterBySize(130);
            System.out.println("Filtered files by size <= 130: " + filteredFiles);

        } catch (FileAlreadyExist | InconsistentPathException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}