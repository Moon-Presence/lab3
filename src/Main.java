public class Main {
    public static void main(String[] args){
        System.out.println("Лабораторная работа №3\n"+
                              "Выполнил: ст. гр. ПЭ-171\n"+
                              "Осокин Р.М.\n"+
                              "Задание: создание абстрактного приложения работующего\n"+
                              "с файлами разных типов через реализацию наследования\n"+
                              "и полиморфизм");
        String path = args[0];
        File f= new File();
        System.out.println("//наследование");
        f.setName(path);

        System.out.println("File name - "+f.getName());

        if(f.fileExisting(path))
            Log.console("File exist");
        else
            Log.console("File doesn't exist");
        switch(f.getFormat(path))
        {
            case"mp3":Mp3File.readMp3();  Mp3File.displayMp3() ;break;
            case"txt":TxtFile.readText(); TxtFile.showText()   ;break;
            case"avi":AviFile.readAvi();  AviFile.displayAvi() ;break;
            case"jpg":JpgFile.readJpg();  JpgFile.displayJpg() ;break;
        }
        if(f.fileClose())
            Log.console("Closing complete");
        else
            Log.console("INVALID closing process");

        System.out.println("//полиморфизм");
        File f2= new File();
        f2.setName(path);
        System.out.println("File name - "+f2.getName());
        switch(f2.getFormat(path))
        {
            case"mp3":f2 =new Mp3File();break;
            case"txt":f2 =new TxtFile();break;
            case"avi":f2 =new AviFile();break;
            case"jpg":f2 =new JpgFile();break;
        }
        f2.read();
        f2.show();
        if(f2.fileClose())
            Log.console("Closing complete");
        else
            Log.console("INVALID closing process");
    }
}
