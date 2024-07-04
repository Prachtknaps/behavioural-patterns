package at.swd;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor wordProcessor = new WordDocumentProcessor();
        DocumentProcessor pdfProcessor = new PdfDocumentProcessor();

        wordProcessor.processDocument();
        pdfProcessor.processDocument();
    }
}