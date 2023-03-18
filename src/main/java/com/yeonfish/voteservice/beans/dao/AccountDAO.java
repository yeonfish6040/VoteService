package com.yeonfish.voteservice.beans.dao;

import com.yeonfish.voteservice.DevController.logger;
import com.yeonfish.voteservice.beans.vo.UserVO;
import com.yeonfish.voteservice.mappers.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccountDAO {

    private final logger log = new logger();

    @Autowired
    private AccountMapper accountMapper;

    public UserVO getUser(UserVO userVO) {
        return accountMapper.get(userVO);
    }

    public boolean addUser(UserVO userVO) {
        return accountMapper.add(userVO) == 1;
    }

    public boolean updateUser(UserVO userVO) {
        return accountMapper.update(userVO) == 1;
    }


}
