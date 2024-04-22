package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private Driver(){   //singleton design pattern it allows us to use one instance in our project on stability our framework

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            if (Config.getProperty("browser").equals("chrome")){
                WebDriverManager.chromedriver().create();

                driver = new ChromeDriver();

            } else if (Config.getProperty("browser").equals("chromeHeadless")) {
                WebDriverManager.chromedriver().create();
                driver= new ChromeDriver(new ChromeOptions().addArguments());//new ChromeDriver(new ChromeOptions(). setHeadless(true));

            }else {
                WebDriverManager.chromedriver().create();
                driver = new ChromeDriver();
            }
        }
        return driver;
    }
}
/*
        WebDriverManager.chromedriver().setup();
        String browser = (String) System.getProperty("browser","chromeHeadlessTest");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        switch (browser){
            case "chromeTest":
                WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().clearResolutionCache().setup();
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            case "chromeHeadlessTest":
                WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().clearResolutionCache().setup();
                options.addArguments("-disable-cache");
                options.addArguments("--headless==new");
                options.addArguments("-proxy-server='direct://'");
                options.addArguments("--proxy-bypass-list=*");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("window-size=1920,1080");
                driver = new ChromeDriver(options);
                break;
            default:
                throw new IllegalArgumentException("Invalid browser type: " + browser);

        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static String getCurrentUrl() { return driver.getCurrentUrl(); }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {

        if (helperClass==null) {

            helperClass = new Driver();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;
    }*/
