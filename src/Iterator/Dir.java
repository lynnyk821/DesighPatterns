package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Dir {
    List<Dir> dirs;
    List<File> files;
    public Dir() {
        dirs = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    public void addFile(File file) {
        files.add(file);
    }
    public List<Dir> getDirs(){
        return dirs;
    }
    public List<File> getFiles(){
        return files;
    }
    public DirFileIterator iterator() {
        return new DirFileIterator(this);
    }
}
