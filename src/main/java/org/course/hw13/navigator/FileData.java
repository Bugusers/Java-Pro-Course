package org.course.hw13.navigator;

public class FileData {
    private String name;
    private String filePath;
    private int size;

    public FileData(String name, String filePath, int size) {
        this.name = name;
        this.filePath = filePath;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", path='" + filePath + '\'' +
                '}';
    }
}
