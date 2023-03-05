package com.yeonfish.voteservice.mappers;

import com.yeonfish.voteservice.beans.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    // registation mapper
    public int register(UserVO userVO);

    // account update mapper
    public int update(UserVO userVO);

}
