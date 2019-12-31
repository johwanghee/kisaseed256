import com.github.johwanghee.encryption.kisaseed256.KisaSeed256;
import org.junit.Test;

import java.security.InvalidKeyException;

import static org.junit.Assert.assertEquals;

public class SeedTest {

    @Test(expected = InvalidKeyException.class)
    public void testKeyException() throws Exception {
        String key = "0123456789012345678901234567890";
        String text = "123";
        KisaSeed256.Encrypt(text, key);
    }

    @Test
    public void testDecrypt() throws InvalidKeyException {
        String key = "YouMustEncryptKeyChangeLength32b";
        String text = "123";
        System.out.println("KEY LENGTH :::: " + key.getBytes().length);
        String enc = KisaSeed256.Encrypt(text, key);
        System.out.println("Encrypt :::: " + enc);
        String dec = KisaSeed256.Decrypt(enc, key);
        System.out.println("Decrypt :::: " + dec);
        assertEquals(text, dec);
    }
}
