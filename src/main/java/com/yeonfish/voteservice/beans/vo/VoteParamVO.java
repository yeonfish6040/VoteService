package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VoteParamVO {
    private String UUID;
    private String Name;
}
