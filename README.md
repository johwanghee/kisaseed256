# SEED256 for JAVA (jar)
[hihoyeho](https://github.com/leeinuk/Seed256)님의 Seed 256 Java 버전을 jar로 배포 하기 위한 저장소 입니다.

# 사용법
kisaseed256-1.x.jar를 라이브러리 추가 후

```Java
import com.github.johwanghee.encryption.kisaseed256.KisaSeed256;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeedTest {

    @Test
    public void testDecrypt() throws InvalidKeyException {
        String key = "YouMustEncryptKeyChangeLength32b";
        String text = "123";
        System.out.println("KEY LENGTH :::: " + key.getBytes().length);
        
        // 암호화
        String enc = KisaSeed256.Encrypt(text, key);
        System.out.println("Encrypt :::: " + enc);

        // 복호화
        String dec = KisaSeed256.Decrypt(enc, key);
        System.out.println("Decrypt :::: " + dec);
        assertEquals(text, dec);
    }
}
```



KisaSeed256.Decrypt(data, KEY)
 
참고
- SEED: https://seed.kisa.or.kr/kisa/algorithm/EgovSeedInfo.do
- 원본소스: https://hihoyeho.tistory.com/entry/SEED256-for-JAVA
