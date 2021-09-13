package com.alphabank.work4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccountingUser {
    private RandomAccessFile file;
    private String user;
    private int count;

    public AccountingUser() throws FileNotFoundException {
        file = new RandomAccessFile(".\\resource\\users.txt","rw");
    }

    public void addUsers(String nameUser) throws IOException {
        String user = "";
        String[] arrText;
        long l=0;
        while (l < file.length()) {
            file.seek(l);
            arrText = file.readLine().split(":");
            user = arrText[0];
            if( user.trim().equals(nameUser.trim()) ) {
                count = ( Integer.parseInt(arrText[1].trim()) ) + 1;
                file.seek(l);
                file.writeBytes(""+nameUser + ":" + count );
                return;
            }
            l = file.getFilePointer();
        }
            file.writeBytes(""+nameUser + ":" + count );
    }

    public void printFile() throws IOException {
        String line="";
        long l=0;
        while ( l < this.file.length() ) {
            file.seek(l);
            line = file.readLine();
            l = file.getFilePointer();
        }
    }

    public void finalize() throws IOException {
        file.close();
    }


}
