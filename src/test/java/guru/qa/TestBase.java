package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase extends TestData {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "720x880";
        Configuration.holdBrowserOpen = true;
    }
}
