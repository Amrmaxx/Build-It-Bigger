package com.app.android.javajokes;

import java.util.Random;

public class Jokes {

    public static String joke() {
        Random r = new Random();
        int randomJokeNumber = r.nextInt(8);

        String joke="";
        switch (randomJokeNumber) {
            case 0:
                joke = "I'm a big fan of whiteboards. I find them quite re-markable.";
                break;
            case 1:
                joke = "Can a kangaroo jump higher than a house? \nOf course, a house does not jump at all.";
                break;
            case 2:
                joke = "Doctor:I am so sorry but your son didn't survive the operation\n " +
                        "Son: Dad dad I am alive\nFather: Shut up son, you don't know more than the doctor";
                break;
            case 3:
                joke = "A driver almost hit a man so he shouted: DID YOU COME HERE TO DIE?\n" +
                        "the walking person: No man i came here yesterdie";
                break;
            case 4:
                joke = "Patient: Oh doctor, I’m just so nervous. This is my first operation.\n" +
                        "Doctor: Don't worry. Mine too.";
                break;
            case 5:
                joke = "Q. why do you take a chicken every time you go to hotel\n" +
                        "A. so you can actually check-in";
                break;
            case 6:
                joke = "What did the Terminator do after he lost his job?\n" +
                        "He became an Exterminator";
                break;
            case 7:
                joke = "Why your astronaut friend is so upset?\n" +
                        "He just needed a little space.";
                break;
        }
        return joke;
    }
}
