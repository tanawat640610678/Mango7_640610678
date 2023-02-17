public interface Handler {
    void setHandler(Handler nextHandler);
    // method สำหรับกำหนด nextHandler
    //เอาไว้ใช้กับตัวเอง process ไม่ได้ก็
    //ส่งไปให้ nextHandler process

    void process(File file);
    String getName();
}