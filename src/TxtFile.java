public class TxtFile extends File {
    public static void readText(){
        Log.console("Start reading txt file");
        Log.console("End reading txt file");
    }
    public static void showText(){
        Log.console("Start displaying txt file");
        Log.console("End displaying txt file");
    }

    @Override
    public void read() {readText();}
    @Override
    public void show() {showText();}
}
