package file;

import java.util.List;

public class DeclarBody {
    static final String C_DOC_FNAME = "C_DOC_FNAME";
    static final String C_DOC_CRTDATE = "C_DOC_CRTDATE";
    static final String C_DOC_CRTTIME = "C_DOC_CRTTIME";
    static final String C_DOC_QTREC = "C_DOC_QTREC";
    static final String ROWS = "ROWS";
    static final String PROC_FILE_NAME = "PROC_FILE_NAME";
    static final String PROC_FILE_ERROR_CODE = "PROC_FILE_ERROR_CODE";
    static final String RESPONSE_TEXT = "RESPONSE_TEXT";
    static final String PROC_FILE_CRTDATE = "PROC_FILE_CRTDATE";
    static final String PROC_FILE_QTREC = "PROC_FILE_QTREC";
    private String cDocFName;
    private String cDocCrtDate;
    private String cDocCrtTime;
    private String cDocQtRec;
    private List<Rows> rows;
    private String procFileName;
    private String procFileErrorCode;
    private String responseText;
    private String ProcFileCrtdate;
    private String ProcFileQtRec;

    public DeclarBody() {
    }

    public String getProcFileQtRec() {
        return this.ProcFileQtRec;
    }

    public void setProcFileQtRec(String procFileQtRec) {
        this.ProcFileQtRec = procFileQtRec;
    }

    public String getProcFileCrtdate() {
        return this.ProcFileCrtdate;
    }

    public void setProcFileCrtdate(String procFileCrtdate) {
        this.ProcFileCrtdate = procFileCrtdate;
    }

    public String getResponseText() {
        return this.responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getProcFileErrorCode() {
        return this.procFileErrorCode;
    }

    public void setProcFileErrorCode(String procFileErrorCode) {
        this.procFileErrorCode = procFileErrorCode;
    }

    public String getProcFileName() {
        return this.procFileName;
    }

    public void setProcFileName(String procFileName) {
        this.procFileName = procFileName;
    }

    public String getcDocFName() {
        return this.cDocFName;
    }

    public void setcDocFName(String cDocFName) {
        this.cDocFName = cDocFName;
    }

    public String getcDocCrtDate() {
        return this.cDocCrtDate;
    }

    public void setcDocCrtDate(String cDocCrtDate) {
        this.cDocCrtDate = cDocCrtDate;
    }

    public String getcDocCrtTime() {
        return this.cDocCrtTime;
    }

    public void setcDocCrtTime(String cDocCrtTime) {
        this.cDocCrtTime = cDocCrtTime;
    }

    public String getcDocQtRec() {
        return this.cDocQtRec;
    }

    public void setcDocQtRec(String cDocQtRec) {
        this.cDocQtRec = cDocQtRec;
    }

    public List<Rows> getRows() {
        return this.rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public String toString() {
        return "DeclarBody{cDocFName='" + this.cDocFName + '\'' + ", cDocCrtDate='" + this.cDocCrtDate + '\'' + ", cDocCrtTime='" + this.cDocCrtTime + '\'' + ", cDocQtRec='" + this.cDocQtRec + '\'' + ", rows=" + this.rows + '}' + "\n";
    }
}