package org.example.codingpractice;

import java.io.File;

public class FileRenamer {

    public static void main(String[] args) {
        // Provide the folder path where files need to be renamed
        String folderPath = "E:\\Series\\Dragon Ball\\Dragon Ball Z Hindi";

        // Create a File object representing the folder
        File folder = new File(folderPath);

        // Get all the files in the folder
        File[] files = folder.listFiles();

        // Ensure that files were found
        if (files != null) {
            // Define a counter for renaming files in ascending order
            int counter = 1;

            // Iterate through each file in the folder
            for (File file : files) {
                // Check if the file is a regular file (not a directory)
                if (file.isFile()) {
                    // Get the file extension
                    String extension = getFileExtension(file.getName());

                    // Construct the new file name
                    String newFileName = counter + "." + extension;

                    // Create a File object representing the new file name
                    File newFile = new File(folderPath, newFileName);

                    // Rename the file
                    if (file.renameTo(newFile)) {
                        System.out.println("File renamed successfully: " + file.getName() + " -> " + newFileName);
                    } else {
                        System.out.println("Failed to rename file: " + file.getName());
                    }

                    // Increment the counter
                    counter++;
                }
            }
        } else {
            System.out.println("No files found in the specified folder.");
        }
    }

    // Method to get file extension
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return fileName.substring(lastDotIndex + 1);
        }
        return ""; // No extension found
    }
}
