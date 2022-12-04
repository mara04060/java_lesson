package file;

import java.util.Objects;

public class DeclarHead {
    static final String C_ORG_NAME = "C_ORG_NAME";
    static final String TIN = "TIN";
    static final String C_FIN = "C_FIN";
    private String cOrgName;
    private String tin;
    private String cFin;

    public DeclarHead() {
    }

    public String getcOrgName() {
        return this.cOrgName;
    }

    public void setcOrgName(String cOrgName) {
        this.cOrgName = cOrgName;
    }

    public String getTin() {
        return this.tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getcFin() {
        return this.cFin;
    }

    public void setcFin(String cFin) {
        this.cFin = cFin;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof DeclarHead)) {
            return false;
        } else {
            DeclarHead that = (DeclarHead)o;
            return Objects.equals(this.getcOrgName(), that.getcOrgName()) && Objects.equals(this.getTin(), that.getTin()) && Objects.equals(this.getcFin(), that.getcFin());
        }
    }

    public String toString() {
        return "DeclarHead{cOrgName='" + this.cOrgName + '\'' + ", tin='" + this.tin + '\'' + ", cFin='" + this.cFin + '\'' + '}' + "\n";
    }
}
