package FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {
        new ExcelDocumentFactory().createDocument();
        new WordDocumentFactory().createDocument();
        new PdfDocumentFactory().createDocument();
    }
}
