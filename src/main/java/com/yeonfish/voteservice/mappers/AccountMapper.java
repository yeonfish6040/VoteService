package com.yeonfish.voteservice.mappers;

import com.yeonfish.voteservice.beans.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    // registation mapper
    public int add(UserVO userVO);

    // account update mapper
    public int update(UserVO userVO);

    // login
    public UserVO get(UserVO userVO);

    public int delete(UserVO userVO);
}
