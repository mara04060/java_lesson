package file;

import java.io.FileOutputStream;
import java.util.Iterator;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxWrite {
    private String configFile;
    private Declar declar;

    public StaxWrite() {
    }

    public void setFile(String configFile) {
        this.configFile = configFile;
    }

    public void setDeclar(Declar declare) {
        this.declar = declare;
    }

    public void saveF1() throws Exception {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.configFile));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        eventWriter.add(end);
        StartElement configStartElement = eventFactory.createStartElement("", "", "DECLAR");
        eventWriter.add(configStartElement);
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_ORG_NAME", this.declar.getDeclarHead().getcOrgName());
        this.createNode(eventWriter, "TIN", this.declar.getDeclarHead().getTin());
        this.createNode(eventWriter, "C_FIN", this.declar.getDeclarHead().getcFin());
        eventWriter.add(eventFactory.createEndElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_DOC_FNAME", this.declar.getDeclarBody().getcDocFName().replace("F0", "F1"));
        this.createNode(eventWriter, "PROC_FILE_NAME", this.declar.getDeclarBody().getcDocFName());
        this.createNode(eventWriter, "C_DOC_CRTDATE", this.declar.getDeclarBody().getcDocCrtDate());
        this.createNode(eventWriter, "C_DOC_CRTTIME", this.declar.getDeclarBody().getcDocCrtTime());
        this.createNode(eventWriter, "PROC_FILE_ERROR_CODE", "0000");
        this.createNode(eventWriter, "RESPONSE_TEXT", "Відправник: Приймальний шлюз ДПС України");
        eventWriter.add(eventFactory.createEndElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    public void saveF2() throws Exception {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.configFile));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        eventWriter.add(end);
        StartElement configStartElement = eventFactory.createStartElement("", "", "DECLAR");
        eventWriter.add(configStartElement);
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_ORG_NAME", this.declar.getDeclarHead().getcOrgName());
        this.createNode(eventWriter, "TIN", this.declar.getDeclarHead().getTin());
        this.createNode(eventWriter, "C_FIN", this.declar.getDeclarHead().getcFin());
        eventWriter.add(eventFactory.createEndElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_DOC_FNAME", this.declar.getDeclarBody().getcDocFName().replace("F0", "F2"));
        this.createNode(eventWriter, "C_DOC_CRTDATE", this.declar.getDeclarBody().getcDocCrtDate());
        this.createNode(eventWriter, "C_DOC_CRTTIME", this.declar.getDeclarBody().getcDocCrtTime());
        this.createNode(eventWriter, "C_DOC_QTREC", "0");
        this.createNode(eventWriter, "PROC_FILE_NAME", this.declar.getDeclarBody().getcDocFName());
        this.createNode(eventWriter, "PROC_FILE_CRTDATE", this.declar.getDeclarBody().getcDocCrtDate());
        this.createNode(eventWriter, "PROC_FILE_QTREC", this.declar.getDeclarBody().getcDocQtRec());
        this.createNode(eventWriter, "PROC_FILE_ERROR_CODE", "0000");
        this.createNode(eventWriter, "RESPONSE_TEXT", "Помилок не знайдено");
        eventWriter.add(eventFactory.createEndElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    public void saveR1() throws Exception {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.configFile));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        eventWriter.add(end);
        StartElement configStartElement = eventFactory.createStartElement("", "", "DECLAR");
        eventWriter.add(configStartElement);
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_ORG_NAME", this.declar.getDeclarHead().getcOrgName());
        this.createNode(eventWriter, "TIN", this.declar.getDeclarHead().getTin());
        this.createNode(eventWriter, "C_FIN", this.declar.getDeclarHead().getcFin());
        eventWriter.add(eventFactory.createEndElement("", "", "DECLARHEAD"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createStartElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        this.createNode(eventWriter, "C_DOC_FNAME", this.declar.getDeclarBody().getcDocFName().replace("F0", "R0"));
        this.createNode(eventWriter, "C_DOC_CRTDATE", this.declar.getDeclarBody().getcDocCrtDate());
        this.createNode(eventWriter, "C_DOC_CRTTIME", this.declar.getDeclarBody().getcDocCrtTime());
        this.createNode(eventWriter, "C_DOC_QTREC", this.declar.getDeclarBody().getcDocQtRec());
        Iterator var7 = this.declar.getDeclarBody().getRows().iterator();

        while(var7.hasNext()) {
            Rows rows = (Rows)var7.next();
            eventWriter.add(eventFactory.createStartElement("", "", "ROWS"));
            eventWriter.add(eventFactory.createAttribute("ROWNUM", rows.getRownum()));
            eventWriter.add(end);
            this.createNode(eventWriter, "BANK_ID", rows.getBankId());
            this.createNode(eventWriter, "NUM", rows.getNum());
            this.createNode(eventWriter, "RST_TYPE", rows.getRstType());
            this.createNode(eventWriter, "CLIENT_NAME", rows.getClientName());
            this.createNode(eventWriter, "OPER_DATE", rows.getOperDate());
            this.createNode(eventWriter, "ACCOUNT", rows.getAccount());
            this.createNode(eventWriter, "CURRENCY", rows.getCurrency());
            this.createNode(eventWriter, "RESIDENT", "1");
            this.createNode(eventWriter, "RECEIVE_DATE", rows.getOperDate());
            this.createNode(eventWriter, "STS_DATE", rows.getOperDate());
            this.createNode(eventWriter, "REASON", "0");
            this.createNode(eventWriter, "REC_ID", rows.getRownum());
            this.createNode(eventWriter, "PROC_FILE_NAME", this.declar.getDeclarBody().getcDocFName());
            this.createNode(eventWriter, "REC_NUM", rows.getRownum());
            eventWriter.add(eventFactory.createEndElement("", "", "ROWS"));
            eventWriter.add(end);
        }

        eventWriter.add(eventFactory.createEndElement("", "", "DECLARBODY"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }
}

