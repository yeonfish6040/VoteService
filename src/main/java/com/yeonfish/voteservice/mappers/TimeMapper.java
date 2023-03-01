package com.yeonfish.voteservice.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface TimeMapper {
    public String getTime();
}
