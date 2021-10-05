package com.alphabank;

import com.alphabank.controller.ControllerBooks;
import com.alphabank.model.SourceBooks;
import com.alphabank.model.entity.StaxX;

public class Task35 {
    public static void main(String[] args) throws Exception {
	    new ControllerBooks().execute();
//	    Generation new File XML
//        new StaxX().saveXML(".\\resource\\books.xml", new SourceBooks().getBooksOld() );
    }
}
