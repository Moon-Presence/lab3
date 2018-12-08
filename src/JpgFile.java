public class JpgFile extends File {
    public static void readJpg(){
        Log.console("Start reading jpg file");
        Log.console("End reading jpg file");
    }
    public static void displayJpg(){
        Log.console("Start displaying jpg file");
        Log.console("End displaying jpg file");
    }

    @Override
    public void read() {readJpg();}
    @Override
    public void show() {displayJpg();}
}
