package com.yeonfish.voteservice.services;

import com.yeonfish.voteservice.beans.dao.AccountDAO;
import com.yeonfish.voteservice.beans.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagingService implements UserManagingServiceImpl {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserVO login(UserVO userVO) {
        UserVO DBData = accountDAO.getUser(userVO);

        if (userVO.getId().equals(DBData.getId()) && userVO.getPassword().equals(DBData.getPassword()))
            return DBData;

        return null;
    }
}
