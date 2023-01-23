package IO;

import java.io.File;

public class FilterFileSample {
    public static void main(String[] args) {
        FilterFileSample sample = new FilterFileSample();
        String pathName = File.separator + "Users" + File.separator + "amand" + File.separator + "바탕 화면" +
                File.separator + "GodOfJava" + File.separator + "test";
        sample.checkList(pathName);
    }

    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
            File []mainFileList = file.listFiles();
            File []JPGNamedList = file.listFiles(new JPGFileNameFilter());
            File []JPGFileList = file.listFiles(new JPGFileFilter());
            System.out.println("====All Files List====");
            for (File tempFile : mainFileList) {
                System.out.println(tempFile.getName());
            }
            System.out.println("====File Ends with .JPG List====");
            for (File tempFile : JPGNamedList) {
                System.out.println(tempFile.getName());
            }
            System.out.println("====.JPG File List====");
            for (File tempFile : JPGFileList) {
                System.out.println(tempFile.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
