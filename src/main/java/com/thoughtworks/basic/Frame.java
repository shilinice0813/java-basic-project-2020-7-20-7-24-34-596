package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Frame {
    public int firstRoll;
    public int secondRoll;
    public int extraPoint;
    public int firstRollBall(){
        Random random=new Random();
        int firstRoll=random.nextInt(10);
        return firstRoll;
    }
    public int secondRollBall(int firstRoll){
        Random random=new Random();
        int secondRoll=random.nextInt(10-firstRoll+1);
        return secondRoll;
    }
}
