package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Stax {
    public Stax() {
    }

    public Declar readConfig(String configFile) {
        List items = new ArrayList();
        Declar declar = null;

        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new FileInputStream(configFile);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            DeclarBody declarBody = null;
            DeclarHead declarHead = null;
            Rows rows = null;

            while(true) {
                while(eventReader.hasNext()) {
                    XMLEvent event = eventReader.nextEvent();
                    if (event.isStartElement()) {
                        StartElement startElement = event.asStartElement();
                        if (startElement.getName().getLocalPart().equals("DECLARHEAD")) {
                            declarHead = new DeclarHead();
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_FIN")) {
                            event = eventReader.nextEvent();
                            declarHead.setcFin(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("TIN")) {
                            event = eventReader.nextEvent();
                            declarHead.setTin(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_ORG_NAME")) {
                            event = eventReader.nextEvent();
                            declarHead.setcOrgName(event.asCharacters().getData());
                            continue;
                        }

                        if (startElement.getName().getLocalPart().equals("DECLARBODY")) {
                            declarBody = new DeclarBody();
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_DOC_QTREC")) {
                            event = eventReader.nextEvent();
                            declarBody.setcDocQtRec(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_DOC_CRTDATE")) {
                            event = eventReader.nextEvent();
                            declarBody.setcDocCrtDate(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_DOC_CRTTIME")) {
                            event = eventReader.nextEvent();
                            declarBody.setcDocCrtTime(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("C_DOC_FNAME")) {
                            event = eventReader.nextEvent();
                            declarBody.setcDocFName(event.asCharacters().getData());
                            continue;
                        }

                        if (startElement.getName().getLocalPart().equals("ROWS")) {
                            rows = new Rows();
                            Iterator attributes = startElement.getAttributes();

                            while(attributes.hasNext()) {
                                Attribute attribute = (Attribute)attributes.next();
                                if (attribute.getName().toString().equals("ROWNUM")) {
                                    rows.setRownum(attribute.getValue());
                                }
                            }
                        }

                        if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("BANK_ID")) {
                            event = eventReader.nextEvent();
                            rows.setBankId(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("NUM")) {
                            event = eventReader.nextEvent();
                            rows.setNum(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("OPER_TYPE")) {
                            event = eventReader.nextEvent();
                            rows.setOperType(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("RST_TYPE")) {
                            event = eventReader.nextEvent();
                            rows.setRstType(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("ACCOUNT")) {
                            event = eventReader.nextEvent();
                            rows.setAccount(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("OPER_DATE")) {
                            event = eventReader.nextEvent();
                            rows.setOperDate(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("CLIENT_NAME")) {
                            event = eventReader.nextEvent();
                            rows.setClientName(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("CLIENT_ADDR")) {
                            event = eventReader.nextEvent();
                            rows.setClientAddr(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("NUM")) {
                            event = eventReader.nextEvent();
                            rows.setNum(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("CURRENCY")) {
                            event = eventReader.nextEvent();
                            rows.setCurrency(event.asCharacters().getData());
                            continue;
                        }

                        if (event.asStartElement().getName().getLocalPart().equals("RESIDENT")) {
                            event = eventReader.nextEvent();
                            rows.setResident(event.asCharacters().getData());
                            continue;
                        }
                    }

                    EndElement endElement;
                    if (event.isEndElement()) {
                        endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equals("ROWS")) {
                            items.add(rows);
                        }
                    }

                    if (event.isEndElement()) {
                        endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equals("DECLARBODY")) {
                            declarBody.setRows((ArrayList)items);
                        }
                    }

                    if (event.isEndElement()) {
                        endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equals("DECLAR")) {
                            declar = new Declar();
                            declar.setDeclarBody(declarBody);
                            declar.setDeclarHead(declarHead);
                        }
                    }
                }

                return declar;
            }
        } catch (FileNotFoundException var14) {
            var14.printStackTrace();
        } catch (XMLStreamException var15) {
            var15.printStackTrace();
        }

        return declar;
    }
}

