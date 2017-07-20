package ru.gpanov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Speaker speaker = new Speaker();
	    speaker.sayHello();
	    String[] str = new String[2];
	    str[0]="123";
	    str[1]="123";
	    System.out.print(Arrays.asList(str));
    }
}
