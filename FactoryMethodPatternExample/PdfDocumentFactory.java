package FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
    public void createDocument(){
        new PdfDocument();
    }
}
