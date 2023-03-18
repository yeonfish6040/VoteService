package com.yeonfish.voteservice.Mappers;


import com.yeonfish.voteservice.DevController.logger;
import com.yeonfish.voteservice.beans.vo.UserVO;
import com.yeonfish.voteservice.mappers.AccountMapper;
import com.yeonfish.voteservice.util.UUID;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AccountMapperTest {
    private final logger log = new logger();

    @Autowired
    private AccountMapper accountMapper;

    @Test
    @Order(1)
    public void register() {
        UserVO userVO = new UserVO();
        userVO.setUUID(UUID.generate());
        userVO.setName("test");
        userVO.setNickName("test");
        userVO.setId("test");
        userVO.setPassword("test");
        userVO.setPhone("010-0000-0000");
        userVO.setStatus(0);

        accountMapper.add(userVO);
    }

    // get test
    @Test
    @Order(2)
    public void getUser() {
        UserVO userVO = new UserVO();
        userVO.setId("test");
        userVO.setPassword("test");

        log.info(accountMapper.get(userVO));
    }


    @Test
    @Order(3)
    public void update() {
        UserVO userVO = new UserVO();
        userVO.setId("test");
        userVO.setPassword("test");
        userVO = accountMapper.get(userVO);
        userVO.setNickName("tester");

        accountMapper.update(userVO);

        log.info(accountMapper.get(userVO));
    }

    @Test
    @Order(4)
    public void delete() {
        UserVO userVO = new UserVO();
        userVO.setId("test");
        userVO.setPassword("test");
        userVO = accountMapper.get(userVO);

        accountMapper.delete(userVO);
    }
}
