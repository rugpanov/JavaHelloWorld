package ru.gpanov;
import ru.gpanov.speakers.*; 
public class EntryPoint {

    public static void main(String[] args) {
        Speaker speaker = new HWSpeaker();
	    speaker.say();//1
    }
}
