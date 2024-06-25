package object;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    
    public static <T extends Serializable> ArrayList<T> docDanhSachTuFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (ArrayList<T>) ois.readObject();
        } catch (EOFException e) {
            // Đã đọc đến cuối file, trả về danh sách rỗng
            return new ArrayList<>();
        }
    }

    public static <T extends Serializable> void ghiObjectVaoFile(String fileName, ArrayList<T> list) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        }
    }
}
