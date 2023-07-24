package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import base.CommonFunctions;
import reporting.Extent;

public class CredsConfigFile extends CommonFunctions {
	
    private static Properties loginProperties;

    public static void loadCreds() throws Exception {
        loadProperties();
        Constant.username = loginProperties.getProperty("username");
        Constant.password = loginProperties.getProperty("password");
        Extent.getTest().info("Successfully retrieved credentials - User will now be logged in" );
    }

    private static void loadProperties() {
        loginProperties = new Properties();
        try {
            loginProperties.load(new FileInputStream(CommonFunctions.credsFilePath));
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
            Extent.getTest().info("Error reading properties file: " + e.getMessage());
        }
    }
}