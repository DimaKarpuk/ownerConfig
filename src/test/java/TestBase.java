import com.codeborne.selenide.Selenide;
import config.ConfigData;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.lang.module.Configuration;

public class TestBase {
    private static final ConfigData configData =
            ConfigFactory.create(
                    ConfigData.class,
                    System.getProperties()
            );
    @BeforeAll
    public static void beforeAll(){
        WebDriverConfig webDriverConfig = new WebDriverConfig(configData);
        webDriverConfig.configData();
    }
    @AfterEach
    public void afterEach(){
        Selenide.closeWebDriver();
    }
}
