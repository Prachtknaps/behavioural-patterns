package at.swd;

public class PdfDocumentProcessor extends DocumentProcessor {
    @Override
    void openDocument() {
        System.out.println("Opening PDF document...");
    }

    @Override
    void readDocument() {
        System.out.println("Reading PDF document content...");
    }

    @Override
    void closeDocument() {
        System.out.println("Closing PDF document.");
    }
}
