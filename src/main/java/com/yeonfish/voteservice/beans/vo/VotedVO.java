package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VotedVO {
    private VoteParamVO VoteParam;
    private UserVO User;
}
