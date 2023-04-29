import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class AppIndicatorTest {
    private static final Logger LOG = LoggerFactory.getLogger(AppIndicatorTest.class);
    @Test
    @Order(1)
    @DisplayName("Testing availability of native lib")
    @EnabledOnOs(OS.LINUX)
    public void shouldHaveNoErrors() {
        try {
            System.loadLibrary("ayatana-appindicator3");
            LOG.debug("Native code library ayatana-appindicator3 successfully loaded");
        } catch (UnsatisfiedLinkError e) {
            LOG.error("Native code library failed to load.\n", e);
        }
    }
}