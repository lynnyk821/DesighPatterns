package Iterator;

import java.util.Iterator;

public class DirFileIterator implements FileIterator {
    private final Iterator<Dir> dirIterator;
    private final Iterator<File> fileIterator;
    private FileIterator currentIterator;

    public DirFileIterator(Dir dir) {
        dirIterator = dir.getDirs().iterator();
        fileIterator = dir.getFiles().iterator();
        currentIterator = null;
    }

    @Override
    public boolean hasMore() {
        if (currentIterator != null && currentIterator.hasMore()) {
            return true;
        }

        while (dirIterator.hasNext()) {
            currentIterator = dirIterator.next().iterator();
            if (currentIterator.hasMore()) {
                return true;
            }
        }

        return fileIterator.hasNext();
    }

    @Override
    public File next() {
        if (hasMore()) {
            if (currentIterator != null && currentIterator.hasMore()) {
                return currentIterator.next();
            }

            if (fileIterator.hasNext()) {
                return fileIterator.next();
            }
        }

        return null;
    }
}






