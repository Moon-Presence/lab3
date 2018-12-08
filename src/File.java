public class File {
    String name;
    public String getName()
    {
        Log.console("Start writing file name");
        String tokens[]= this.name.split("\\.");
        Log.console("File name - "+tokens[0]);
        return tokens[0];
    }

    public void setName(String path)
    {
        Log.console("Enter file path");
        String tokens[]= path.split("\\\\");
        this.name=tokens[tokens.length-1];
        Log.console("File - "+this.name);
    }
    public String getFormat(String path)
    {
        Log.console("Enter file format");
        String tokens[]= path.split("\\.");
        Log.console("File format - "+tokens[tokens.length-1]);
        return tokens[tokens.length-1];
    }
    public Boolean fileExisting(String path)
    {
        Log.console("Checking file existing");
        return true;
    }
    public Boolean fileClose()
    {
        Log.console("Closing file");
        return true;
    }

    public void read()
    {
        Log.console("Start file read");
        Log.console("End file read");
    }
    public void show()
    {
        Log.console("Start file display");
        Log.console("End file display");
    }
}
