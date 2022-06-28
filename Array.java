
package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
           double [] array= new double [10] ;
           array =createArray () ;
        getAverage(array) ;
         getMax (array);
                      }
    
    
    
    
    public static double [] createArray  ()
    {
         
       
        Scanner input = new Scanner(System.in);
        double [] array = new double [10] ;
        System.out.print("Enter 10 double values : ");
           
        for (int i=0 ;i<array.length;i++)
        {
            array[i] =input.nextDouble();
        }
        return array ;
    }  
               
    
         public static double getAverage(double [] arr)
         {
             double sum=0.0,avg=0.0;
             for (int i=0;i<arr.length;i++)
             {
                 sum  += arr[i];
                 avg = sum / arr.length;
            
             }
             
             System.out.println("Average of the array values is : " + avg) ;
             return avg;
         }
          public static double getMax (double [] arr)
         {
            double max= arr[0] ;
            
            for (int i=1;i<arr.length;i++)
            {
                if (arr[i] > max)
                    max= arr[i] ;
                    
            }
            System.out.println("the maximum value is : " + max);
            return max;
                    
         }

}

    
   
    
    

