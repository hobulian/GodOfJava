package IO;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        String pathName = File.separator + "Users" + File.separator + "amand" + File.separator + "바탕 화면" +
                File.separator + "GodOfJava" + File.separator + "test";
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile()); // 이미 있어도 False 반환
            getFileInfo(file);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) throws IOException {
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Absolute file = " + file.getAbsolutePath());
        System.out.println("Canonical path = " + file.getCanonicalPath());
        System.out.println("Canonical file = " + file.getCanonicalFile());
        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
        System.out.println("Parent = " + file.getParent());
    }
}
