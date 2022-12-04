package file;

public class Declar {
    static final String DECLAR = "DECLAR";
    static final String DECLARHEAD = "DECLARHEAD";
    static final String DECLARBODY = "DECLARBODY";
    private DeclarHead DeclarHead;
    private DeclarBody DeclarBody;

    public Declar() {
    }

    public DeclarHead getDeclarHead() {
        return this.DeclarHead;
    }

    public void setDeclarHead(DeclarHead declarHead) {
        this.DeclarHead = declarHead;
    }

    public DeclarBody getDeclarBody() {
        return this.DeclarBody;
    }

    public void setDeclarBody(DeclarBody declarBody) {
        this.DeclarBody = declarBody;
    }

    public String toString() {
        return "Declar{DeclarHead=" + this.DeclarHead + ", DeclarBody=" + this.DeclarBody + '}';
    }
}