package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;
    public Properties p;
    
    @BeforeTest
    public void setup() throws IOException {
        // 1. Read and load the config.properties file
        FileReader file = new FileReader("./src/test/resources/config.properties");
        p = new Properties();
        p.load(file);
        
        // 2. Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // 3. Navigate to appURL
        driver.get(p.getProperty("appURL"));
    }
    
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}