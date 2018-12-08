public class AviFile extends File {
    public static void readAvi(){
        Log.console("Start reading avi file");
        Log.console("End reading avi file");
    }
    public static void displayAvi(){
        Log.console("Start displaying avi file");
        Log.console("End displaying avi file");
    }

    @Override
    public void read() {readAvi();}
    @Override
    public void show() {displayAvi();}
}
