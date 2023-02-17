public class RichTextFileHandler implements Handler {

    private Handler nextHandler;
    private String name;

    public RichTextFileHandler(String name) {
        this.name = name;
    }

    public RichTextFileHandler() {
    }

    @Override
    public void setHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("rtf")) System.out.println("Processing " + file.getFileName() + "." + file.getFileType() + " by " + this.name);
        else if(nextHandler != null) nextHandler.process(file);
        else System.out.println("File not supported");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
