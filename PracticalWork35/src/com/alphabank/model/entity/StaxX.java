package com.alphabank.model.entity;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class StaxX {

    public ArrayList<Book> readXML(String configFile) {
        ArrayList<Book> items = new ArrayList<Book>();
        try {
            // Первый проход создание новой фабрики XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Установка eventReader
            InputStream in = new FileInputStream(configFile);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            Book book = null;

            // Чтение XML документа
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();

                    // Если находим нужный нам элемент то создаем новый обьект
                    if (startElement.getName().getLocalPart().equals("BOOK")) {
                        book = new Book();
                    }

                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart()
                                .equals(Declar.Book.AUTHOR)) {
                            event = eventReader.nextEvent();
                            book.setAuthor(event.asCharacters().getData());
                            continue;
                        }
                    }

                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart()
                                .equals(Declar.Book.TITLE)) {
                            event = eventReader.nextEvent();
                            book.setTitle(event.asCharacters().getData());
                            continue;
                        }
                    }
                    if (event.asStartElement().getName().getLocalPart()
                            .equals(Declar.Book.PUBLISHER)) {
                        event = eventReader.nextEvent();
                        book.setPulisher(event.asCharacters().getData());
                        continue;
                    }
                    if (event.asStartElement().getName().getLocalPart()
                            .equals(Declar.Book.YEAR)) {
                        event = eventReader.nextEvent();
                        book.setYear(Integer.parseInt(event.asCharacters().getData()));
                        continue;
                    }
                    if (event.asStartElement().getName().getLocalPart()
                            .equals(Declar.Book.PAGE)) {
                        event = eventReader.nextEvent();
                        book.setPage(Integer.parseInt(event.asCharacters().getData()));
                        continue;
                    }
                    if (event.asStartElement().getName().getLocalPart()
                            .equals(Declar.Book.PRICE)) {
                        event = eventReader.nextEvent();
                        book.setCost(Double.parseDouble(event.asCharacters().getData()));
                        continue;
                    }

                }
                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(Declar.BOOK)) {
                        items.add(book);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }


        return items;
    }

    @SuppressWarnings({"unchecked", "null"})
    public void saveXML(String configFile, ArrayList<Book> declare) throws Exception {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        // create XMLEventWriter
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(configFile));
        // create an EventFactory
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        // Начальный тег создаю (он-же документ разметки)
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        eventWriter.add(end);
        // открываю тег внутри которого мой перечень книг
        StartElement configStartElement = eventFactory.createStartElement("", "", Declar.BOOKS);
        eventWriter.add(configStartElement);
        eventWriter.add(end);


        for (Book declar : declare) {
            eventWriter.add(eventFactory.createStartElement("", "", Declar.BOOK));
            eventWriter.add(end);

            createNode(eventWriter, Declar.Book.AUTHOR, declar.getAuthor());
            createNode(eventWriter, Declar.Book.TITLE, declar.getTitle());
            createNode(eventWriter, Declar.Book.PUBLISHER, declar.getPulisher());
            createNode(eventWriter, Declar.Book.YEAR, "" + declar.getYear());
            createNode(eventWriter, Declar.Book.PAGE, "" + declar.getPage());
            createNode(eventWriter, Declar.Book.PRICE, "" + declar.getCost());

            eventWriter.add(eventFactory.createEndElement("", "", Declar.BOOK));
            eventWriter.add(end);
        }
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        // create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        // create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }
}
