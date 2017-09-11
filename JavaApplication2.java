package javaapplication2;
import java.util.Random;

public class JavaApplication2 {

    public static int randInt(int min, int max) {
            
    Random rand= new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
    
    }
    
    public static void main(String[] args) {
        
        int x=0;
        x= randInt(1900,2100);
        System.out.println("Year = " + x);
        
        if (x%4==0)
        {
             System.out.println("Leap year");
        }
        
        else 
        {
             System.out.println("Not a leap year");
        }
    }
}

