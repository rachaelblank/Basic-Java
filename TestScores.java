//This is for Programming Challenge 1 in chapter 11 
//Demostrates exceptions
//Rachael Blank

import java.util.*;

public class TestScores {
    int score[];
    public TestScores(int score[]){
        this.score=score;
    }
    public float calculateAverage(){ 
        float avg = 0;
        float sum =0;
        for(int i : score){
            if(i<0 || i>100){
                //exception
                throw new IllegalArgumentException(Integer.toString(i));
            }
            else{
            sum=sum+i;
            }
        }
        avg=sum/score.length;
        return avg;
    }
}