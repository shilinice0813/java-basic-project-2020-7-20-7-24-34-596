package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class BaolingBallGame {
    public List<Frame> frames;
    public void rollBall(){
        frames=new ArrayList<>();
        for(int i=0;i<10;i++){
            Frame frame=new Frame();
            frame.firstRoll = frame.firstRollBall();
            frame.secondRoll = frame.secondRollBall(frame.firstRoll);
            frames.add(frame);
        }
        for(int i=0;i<10;i++){
            Frame frame=frames.get(i);
            if(frame.firstRoll+frame.secondRoll==10){
                if(i!=9){
                    frame.extraPoint=frames.get(i+1).firstRoll;
                }
                frame.extraPoint=frame.firstRollBall();
            }
        }
    }

    public void displayPoint(){
        if(frames.size()>0){
            for (Frame frame :frames){
                System.out.print(frame.firstRoll+","+frame.secondRoll+","+frame.extraPoint+";");
            }
            System.out.println();
            for (Frame frame :frames){
                System.out.print(frame.firstRoll+frame.secondRoll+frame.extraPoint+"|");
            }
        }
    }
}
