package system;

import logintest.DataInitializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigTests {

    @Test
    public void testDecryption(){
        String actualEmail = DataInitializer.getEmail();
        String decryptedEmail = "robert.bolt@rev.com";
        Assertions.assertEquals(actualEmail, decryptedEmail, "Unexpected decrypted email");
    }
}


