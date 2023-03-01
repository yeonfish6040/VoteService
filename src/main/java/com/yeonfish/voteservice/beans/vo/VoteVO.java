package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VoteVO {
    private String UUID;
    private String Name;
    private String Owner;
    private String Votes_Total;
    private int Vote_Type;
    private int OpenLvl;
}
