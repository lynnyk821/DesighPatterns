package Iterator;


public class Main {
    public static void main(String[] args) {
        // Створюємо директорії і файли
        Dir rootDir = new Dir();

        File file1 = new File("D:\\Project\\Java\\file1.txt");
        File file2 = new File("D:\\Project\\Java\\file2.txt");
        File file3 = new File("D:\\Project\\Java\\file3.txt");
        File file4 = new File("D:\\Project\\Java\\file4.txt");

        rootDir.addFile(file1);
        rootDir.addFile(file2);
        rootDir.addFile(file3);
        rootDir.addFile(file4);

        // Створюємо ітератор
        FileIterator fileIterator = rootDir.iterator();

        // Проходимо всі файли в усіх директоріях
        while (fileIterator.hasMore()) {
            File file = fileIterator.next();
            System.out.println(file.getAbsolutePath());
        }
    }
}