package com.yeonfish.voteservice.Mappers;

import com.yeonfish.voteservice.DevController.logger;
import com.yeonfish.voteservice.mappers.TimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeMapperTest {
    private final logger log = new logger();

    @Autowired
    private TimeMapper mapper;

    @Test
    public void testGetTime() {
        log.title(mapper.getTime());
    }
}
