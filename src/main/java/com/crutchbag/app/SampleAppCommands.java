package com.crutchbag.app;

import org.springframework.stereotype.Component;

import com.crutchbag.mks.MQCommand;

@Component
public class SampleAppCommands {

    @MQCommand
    public String ping2() {
        return "{\"msg\":\"pong2\"}";
    }

}
