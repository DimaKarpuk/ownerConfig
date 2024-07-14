package config;

import org.aeonbits.owner.Config;

import static com.codeborne.selenide.Browsers.CHROME;

@Config.Sources({
        "classpath:local.properties"
})
public interface ConfigData extends Config {
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @DefaultValue(CHROME)
    String getBrowser();

    @DefaultValue("1920x1080")
    String getBrowserSize();
    @DefaultValue("122")
    String getBrowserVersion();
//    @DefaultValue("false")
//    boolean isRemote();
}
