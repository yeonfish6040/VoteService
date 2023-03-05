package com.yeonfish.voteservice.util;

import com.yeonfish.voteservice.DevController.logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinaryConfigTest {
    private final logger log = new logger();

    private BinaryConfig binaryConfig = new BinaryConfig();

    @Test
    public void test01() {
        log.info(binaryConfig.getBinary());
        binaryConfig.set(6, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(1, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(2, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(3, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(4, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(5, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(6, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(8, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(9, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(10, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(12, true);
        log.info(binaryConfig.getBinary());
        binaryConfig.set(11, true);

        log.info(binaryConfig.get().toString());
        log.info(binaryConfig.getBinary());
        log.info(binaryConfig.get(1));
        log.info(binaryConfig.get(2));
    }
}
