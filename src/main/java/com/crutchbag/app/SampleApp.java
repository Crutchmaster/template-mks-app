package com.crutchbag.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.crutchbag.mks.Mks;

@Component
public class SampleApp {
    @Autowired
    private Mks mks;
    @Autowired
    private SampleAppCommands cmds;


@EventListener(ApplicationReadyEvent.class)
    private void ready() {
        mks.log("Ready");
        mks.feed(cmds);
    }
}
