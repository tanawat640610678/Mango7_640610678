public class Main{
    public static void main(String[] args){
        
        Handler handler = new TextFileHandler("handler1");
        Handler handler2 = new RichTextFileHandler("handler2");
        Handler handler3 = new DocFileHandler("handler3");
        
        handler.setHandler(handler2);
        handler2.setHandler(handler3);

        File myFile = new File("readme", "txt","C:Desktop");
        handler.process(myFile);

        File yourFile = new File("readyou", "rtf","C:");
        handler.process(yourFile);

        File ourFile = new File("readous", "doc","D:");
        handler.process(ourFile);
    }
}
