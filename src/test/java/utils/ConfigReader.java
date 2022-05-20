package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties prop;

    /**
     * this method will read any properties files
     * @param path
     * @return
     */
    public static Properties readProperties(String path){

        try {
            FileInputStream fis = new FileInputStream(path);
            prop = new Properties();
            prop.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

    /**
     * this method will return single value based on the key
     * @param key
     * @return
     */
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
}
