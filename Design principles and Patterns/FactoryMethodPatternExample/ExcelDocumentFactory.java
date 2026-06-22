package FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {
    public void createDocument(){
        new ExcelDocument();
    }
}
