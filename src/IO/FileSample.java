package IO;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "C:\\Users\\amand\\바탕 화면\\GodOfJava\\test";
        // 역슬래시는 한 번만 사용하면 안되고 2번 연달아 사용해야 본래의 의미로 사용 가능
        // Escape character
        // String pathName = /GodOfJava;
        sample.checkPath(pathName);
        sample.checkFileMethods(pathName);
    }
    public void checkPath(String pathName) {
        File file = new File(pathName);
        if (file.exists() != true) {
            System.out.println("Made " + pathName + " result = " + file.mkdir());
        } else {
            System.out.println(pathName + " is exists? = " + file.exists());
            System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
        }
    }

    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is Directory? = " + file.isDirectory());
        System.out.println(pathName + " is file? = " + file.isFile());
        System.out.println(pathName + " is hidden? = " + file.isHidden());
        System.out.println(pathName + " can read? = " + file.canRead());
        System.out.println(pathName + " is write? = " + file.canWrite());
        System.out.println(pathName + " is execute? = " + file.canExecute());
    }
}
