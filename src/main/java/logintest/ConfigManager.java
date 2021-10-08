package logintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
  public static Properties getLoadedProperties() {
    Properties properties = new Properties();
    try (final FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties")) {
      properties.load(fileInputStream);
    } catch (IOException e) {
      System.out.println("The file [ config.properties ] couldn't be found or isn't a valid properties file.");
    }
    return properties;
  }

}
