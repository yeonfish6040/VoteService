package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserVO {
    private String UUID;
    private String Name;
    private String Id;
    private String Password;
    private String Phone;
    private boolean Is_Certified;
}
