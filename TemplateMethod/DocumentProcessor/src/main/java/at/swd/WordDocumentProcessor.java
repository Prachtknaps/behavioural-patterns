package at.swd;

public class WordDocumentProcessor extends DocumentProcessor {
    @Override
    void openDocument() {
        System.out.println("Opening Word document...");
    }

    @Override
    void readDocument() {
        System.out.println("Reading Word document content...");
    }

    @Override
    void closeDocument() {
        System.out.println("Closing Word document.");
    }
}
