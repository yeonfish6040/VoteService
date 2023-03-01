package com.yeonfish.voteservice.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public int register();
}
