package sg.edu.rp.c346.paintynote;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuizBook {

    public static String[] questions = new String [] {
            "Villagers and Devils are the 2 main teams in Werewolf Online",
            "Sorcerer definitely belongs to the Villagers team and is a good role",
            "The following roles have no alignment or teams : Fool, Serial Killer, \n" +
                    "Arsonist",
            "The role of a priest is to get answers from god to help the team",
            "If sect leader dies, every sect members dies too",
            "The abbreviation 'med' refers to medic/doctor role",
            "When an Aura Seer checks an Alpha Werewolf, it will show 'Unknown'",
            "The purpose of Grumpy Grandma is to act grumpy so she wins by getting lynched",
            "Werewolves can't kill Bomber nor Serial Killer",
            "When headhunter's target dies, he becomes a villager"
    };

    public static int[] images = new int [] {
            R.drawable.w1, R.drawable.w2, R.drawable.w3, R.drawable.w4,
            R.drawable.w5, R.drawable.w6, R.drawable.w7, R.drawable.w8,
            R.drawable.w9, R.drawable.w10
    };

    public static boolean[] answers = new boolean[]{
            false, false, true, false, true, false, true, false, true, true
    };


}
