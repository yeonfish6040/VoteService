package com.yeonfish.voteservice.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VoteMapper {
    public String getVote();
}
