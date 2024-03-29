package com.yeonfish.voteservice.beans.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserVO {
    private String UUID;
    private String Name;
    private String NickName;
    private String Id;
    private String Password;
    private String Phone;
    private int Status;
}
