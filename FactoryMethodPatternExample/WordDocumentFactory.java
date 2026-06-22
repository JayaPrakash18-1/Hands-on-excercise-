package FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{
    public void createDocument(){
        new WordDocument();
    }
}
