package config;

import helpers.settings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class base {
    protected static WebDriver driver;

    protected void getDriver() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2); // Blokir notifikasi
        prefs.put("profile.default_content_setting_values.geolocation", 2);   // Blokir permintaan akses lokasi
        prefs.put("profile.default_content_setting_values.media_stream", 2);  // Blokir akses ke kamera/mikrofon

        options.setExperimentalOption("prefs", prefs);
        //        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(settings.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(settings.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    protected static void quitDriver() {
        driver.quit();
    }
}
