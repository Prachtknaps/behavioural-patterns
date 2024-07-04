package at.swd;

public abstract class DocumentProcessor {
    public void processDocument() {
        openDocument();
        readDocument();
        closeDocument();
    }

    abstract void openDocument();
    abstract void readDocument();
    abstract void closeDocument();
}
