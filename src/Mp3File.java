public class Mp3File extends File {
    public static void readMp3(){
        Log.console("Start reading mp3 file");
        Log.console("End reading mp3 file");
    }
    public static void displayMp3(){
        Log.console("Start displaying mp3 file");
        Log.console("End displaying mp3 file");
    }

    @Override
    public void read() {readMp3();}
    @Override
    public void show() {displayMp3();}
}
