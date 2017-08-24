package ru.gpanov;

import ru.gpanov.speakers.HelloWorldSpeaker;
import ru.gpanov.speakers.Speaker;

public class EntryPoint {

    public static void main(String[] args) {
        Speaker speaker = new HelloWorldSpeaker();
	    speaker.say();
    }
}
