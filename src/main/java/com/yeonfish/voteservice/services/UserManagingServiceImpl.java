package com.yeonfish.voteservice.services;

import com.yeonfish.voteservice.beans.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserManagingServiceImpl {
    public UserVO login(UserVO userVO);
}
