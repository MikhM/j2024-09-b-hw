package ru.otus.java.basic.homeworks.libs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFunctions extends Properties {
    Properties properties;

    public PropertiesFunctions() {
        properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            System.out.println(properties);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fileInputStream != null) {

                try {
                    fileInputStream.close();
                } catch (IOException exx) {
                    System.out.println(exx.getMessage());
                }
            }
        }
    }

    public String getProperyAsStr(String propName) {
        return properties.getProperty(propName);
    }
    public int getProperyAsInt(String propName) {
        return Integer.parseInt(properties.getProperty(propName));
    }

}
