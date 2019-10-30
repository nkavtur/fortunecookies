package nkavtur.fortunecookies;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FortuneCookiesTest {

    @Test
    public void show_me_magic() {
        assertNotNull(FortuneCookies.getAndCrack());
    }
}
