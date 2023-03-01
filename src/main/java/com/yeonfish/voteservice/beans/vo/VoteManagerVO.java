package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VoteManagerVO {
    private String UUID;
    private UserVO User;
    private int ManageLvl;
}
