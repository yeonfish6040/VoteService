package com.yeonfish.voteservice.util;

import com.yeonfish.voteservice.DevController.logger;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RsaTest {
    private final logger log = new logger();

    HashMap<String, String> keypair;

    String plain = "hello";

    String encrypted;
    String decrypted;

    @Test
    @Order(1)
    public void test() {
        this.keypair = RsaCrypto.createKeypairAsString(2048);

        log.info(keypair.toString());

        this.encrypted = RsaCrypto.encrypt(this.plain, this.keypair.get("publicKey"));

        log.info(this.encrypted);

        this.decrypted = RsaCrypto.decrypt(this.encrypted, this.keypair.get("privateKey"));

        log.info(this.decrypted);
    }

}
