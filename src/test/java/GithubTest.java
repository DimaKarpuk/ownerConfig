import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class GithubTest extends TestBase {
    @Test
    void githubTest(){
        open("");
        Assertions.assertEquals("GitHub: Let’s build from here · GitHub", title());
    }
}
