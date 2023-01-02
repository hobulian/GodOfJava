package Collection.Map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

/*  Properties
    HashTable을 확장
 */
public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.checkProperties();
        System.out.println("");
        System.out.println("== CUSTOM PROPERTIES ==");
        sample.saveAndLoadProperties();
        System.out.println("== CUSTOM XML PROPERTY ==");
        sample.saveAndLoadPropertiesXML();
    }

    private void checkProperties() {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject:keySet){
            System.out.println(tempObject+"="+prop.get(tempObject));
        }
    }

    public void saveAndLoadProperties() {
        try {
            String fileName="test.properties";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "WooJin, JEON");
            prop.setProperty("WriterHome", "www.google.com");
            prop.store(fos, "Basic Properties file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveAndLoadPropertiesXML() {
        try {
            String fileName="text.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "WooJin, JEON");
            prop.setProperty("WriterHome", "www.google.com");
            prop.storeToXML(fos, "Basic XML Property file."); // 차이점 storeToXML
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis); // 차이점 loadFromXML
            fis.close();
            System.out.println(propLoaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
