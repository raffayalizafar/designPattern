package task3;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private final long size;
    private final List<File> children  =  new ArrayList<>();
    public Directory(long i) {
        size = i;

    }
    public void addFile(File file) {
        this.children.add(file);
    }
    private String getType() {
        return "Directory type : ";
    }

    private long getSize() {
        return children.size();
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directorySize='" + size + '\'' +
                ", children=" + children +
                '}';
    }


}
