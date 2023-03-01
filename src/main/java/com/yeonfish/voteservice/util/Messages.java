package com.yeonfish.voteservice.util;

import com.yeonfish.voteservice.DevController.logger;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Messages {
    private final logger log = new logger();

    private InputStream secret = null;

    public Messages(InputStream secret) {
        this.secret = secret;
    }

    /** type = (SMS|LMS|MMS) */
    public void send(String to, String from, String text, String type) throws FileNotFoundException {

        Scanner sc = new Scanner(this.secret);

        String api_key = sc.next();
        String api_secret = sc.next();

        Message coolsms = new Message(api_key, api_secret);
        HashMap<String, String> params = new HashMap<String, String>();

            params.put("to", to);
        params.put("from", from);
        params.put("type", type);
        params.put("text", text);
        params.put("app_version", "test app 1.0");

        try {
            JSONObject obj = (JSONObject)coolsms.send(params);
            log.info(obj.toString());
        } catch (CoolsmsException e) {
            log.info(e.getMessage());
            log.info(e.getCode());
        }
    }
}
