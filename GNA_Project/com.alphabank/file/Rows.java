package file;

public class Rows {
    static final String ROWNUM = "ROWNUM";
    static final String BANK_ID = "BANK_ID";
    static final String NUM = "NUM";
    static final String RST_TYPE = "RST_TYPE";
    static final String OPER_TYPE = "OPER_TYPE";
    static final String OPER_DATE = "OPER_DATE";
    static final String ACCOUNT = "ACCOUNT";
    static final String CURRENCY = "CURRENCY";
    static final String RESIDENT = "RESIDENT";
    static final String CLIENT_NAME = "CLIENT_NAME";
    static final String CLIENT_ADDR = "CLIENT_ADDR";
    static final String RECEIVE_DATE = "RECEIVE_DATE";
    static final String STS_DATE = "STS_DATE";
    static final String REASON = "REASON";
    static final String REC_ID = "REC_ID";
    static final String REC_NUM = "REC_NUM";
    private String rownum;
    private String bankId;
    private String num;
    private String rstType;
    private String operType;
    private String operDate;
    private String account;
    private String currency;
    private String resident;
    private String clientName;
    private String clientAddr;

    public Rows() {
    }

    public String getRownum() {
        return this.rownum;
    }

    public void setRownum(String rownum) {
        this.rownum = rownum;
    }

    public String getBankId() {
        return this.bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRstType() {
        return this.rstType;
    }

    public void setRstType(String rstType) {
        this.rstType = rstType;
    }

    public String getOperType() {
        return this.operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOperDate() {
        return this.operDate;
    }

    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getResident() {
        return this.resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddr() {
        return this.clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public String toString() {
        return "Rows--{rownum='" + this.rownum + '\'' + ", bankId='" + this.bankId + '\'' + ", num='" + this.num + '\'' + ", rstType='" + this.rstType + '\'' + ", operType='" + this.operType + '\'' + ", operDate='" + this.operDate + '\'' + ", account='" + this.account + '\'' + ", currency='" + this.currency + '\'' + ", resident='" + this.resident + '\'' + ", clientName='" + this.clientName + '\'' + ", clientAddr='" + this.clientAddr + '\'' + '}' + "\n";
    }
}
