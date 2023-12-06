package org.course.hw13.navigator;

import org.course.hw13.exceptions.FileAlreadyExist;
import org.course.hw13.exceptions.InconsistentPathException;

import java.io.File;
import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> filesMap = new HashMap<>();

    public void add(FileData fileData, String path) throws FileAlreadyExist, InconsistentPathException {
        checkConsistency(fileData, path);

        if (filesMap.containsKey(path)) {
            List<FileData> files = filesMap.get(path);
            if (files.stream().anyMatch(existingFile -> existingFile.getName().equals(fileData.getName()))) {
                throw new FileAlreadyExist("File with the same name already exists in the path.");
            }
        } else {
            filesMap.put(path, new ArrayList<>());
        }

        filesMap.get(path).add(fileData);
    }

    public void add(String path) throws FileAlreadyExist, InconsistentPathException {
//        File file = new File(path).getAbsoluteFile();
//
//        if (!file.isFile()) {
//            throw new IllegalArgumentException("Provided path is not a file.");
//        }
//
//        checkConsistency(new FileData(file.getName(), file.length(), file.getAbsolutePath()), file.getParent());
//
//        String directory = file.getParent();
//        if (!filesMap.containsKey(directory)) {
//            filesMap.put(directory, new ArrayList<>());
//        }
//
//        FileData fileData = new FileData(file.getName(), file.length(), file.getAbsolutePath());
//        if (filesMap.get(directory).stream().anyMatch(existingFile -> existingFile.getName().equals(fileData.getName()))) {
//            throw new FileAlreadyExist("File with the same name already exists in the directory.");
//        }
//
//        filesMap.get(directory).add(fileData);
    }

    public List<FileData> find(String path) {
        return filesMap.getOrDefault(path, Collections.emptyList());
    }

    public void remove(String path) {
        filesMap.remove(path);
        System.out.println("Folder was cleaned");
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        filesMap.values().forEach(allFiles::addAll);

        allFiles.sort(Comparator.comparingLong(FileData::getSize));

        return allFiles;
    }

    public List<FileData> filterBySize(long maxSize) {
        return filesMap.values()
                .stream()
                .flatMap(List::stream)
                .filter(fileData -> fileData.getSize() <= maxSize)
                .toList();
    }

    private void checkConsistency(FileData fileData, String path) throws InconsistentPathException {
        if (!fileData.getFilePath().equals(path)) {
            throw new InconsistentPathException("Inconsistent path: The path of the file data does not match the specified path.");
        }
    }
}