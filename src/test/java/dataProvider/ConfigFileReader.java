package dataProvider;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader  {
    private static Properties properties;
    private final String propertyFilePath = System.getProperty("configs/configuration.properties");

    public ConfigFileReader() throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        properties.load(reader);

    }

    public static String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

}
