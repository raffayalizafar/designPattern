package task3;

public class TextFile implements File{
    long size;

    public TextFile(long size) {
        this.size = size;
    }

    public String getType() {
        return "Directory type : ";
    }
}
