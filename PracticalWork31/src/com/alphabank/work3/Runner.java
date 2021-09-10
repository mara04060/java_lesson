package com.alphabank.work3;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Runner {
    public void run(String[] parameters) throws IOException {
//        String name_old = "read.txt";
//        String name_new = "read_2.txt";
//        System.out.println("---Start copy File");
//        copyFile(name_old, name_new);
//        System.out.println("---End Copy File");

        replacementInFile(parameters[0]);

    }

    private void copyFile(String name_old, String name_new) throws IOException {
        String patch = "D:\\Work\\Java CodeSpace 2 AlphaBank\\Lesson 16\\";
        Path oldFile = Paths.get(patch + name_old);
        Path newFile = Paths.get(patch + name_new);
        Files.copy(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);
    }


    private void replacementInFile(String file) throws IOException {
        if(!file.endsWith("java")) {
            System.out.println("It`s a not Java programm");
            return;
        }

        Path path = Paths.get(file);
        System.out.println("Start replace");
        List<String> lines = Files.readAllLines(path);
        String tmpFile = file.substring(0, file.lastIndexOf("\\")+1) + "tmp.java";
        Path pathTmp = Paths.get(tmpFile);

        try(BufferedWriter buffer = Files.newBufferedWriter(pathTmp)) {
            for (String lin : lines) {
                buffer.write(lin.replace("public", "protected") + "\n");
            }
        }

//        Files.delete(path);
        Files.move(pathTmp, path, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("End replace");
    }

}
