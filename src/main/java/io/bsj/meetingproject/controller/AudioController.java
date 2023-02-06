package io.bsj.meetingproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AudioController {

    @PostMapping("/audio")
    public void receiveAudio(@RequestBody byte[] audioData) {

    }
}
