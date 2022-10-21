package com.wellsFargo.CommBo.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class TwilioService {

    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static final String CUSTOMER_NUMBER = System.getenv("CUSTOMER_NUMBER");

    public static final String TWILIO_NUMBER = System.getenv("TWILIO_NUMBER");
    public  void call() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = com.twilio.rest.api.v2010.account.Call.creator(
                        new com.twilio.type.PhoneNumber(CUSTOMER_NUMBER),
                        new com.twilio.type.PhoneNumber(TWILIO_NUMBER),
                        URI.create("http://demo.twilio.com/docs/voice.xml"))
                .create();

        System.out.println(call.getSid());
    }
}
