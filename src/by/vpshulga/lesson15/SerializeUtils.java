package by.vpshulga.lesson15;

import java.io.*;

public class SerializeUtils {
    static void serializeObject(Object o, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(new File(fileName));
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(o);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Object deserializeObject(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
