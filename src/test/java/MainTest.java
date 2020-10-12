import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.;

public class MainTest {

    @Test
    public void WelcomeShouldReturnDNTPMessage() {
        Main main = new Main();
        assertEquals("Welcome to the DNTP at Murex", main.Welcome());
    }
}
