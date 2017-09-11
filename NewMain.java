package javaapplication2;
import java.util.*;

public class NewMain {

    
    public static void main(String[] args) {
     
       int a[]= {0,4,3,2,7,6,8,9,5,1};
       System.out.println("Array Size = " + a.length);
       
       for (int i=0; i<a.length; i++)
       {
           for (int j=i; j<a.length;j++)
           {
               if( a[i] > a[j] )
               {
                   int temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;                  
               }
               
               else
               {
                   a[i]=a[i];
               }
           }
       }
       
       for (int k=0; k<a.length; k++)
       {
           System.out.print(a[k] + " ");
       }
            
    }
    
}
