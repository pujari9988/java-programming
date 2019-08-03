import java .util.*;
public class p6
   {
      public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
         int n=0;
        System.out.println("Enter a numer");
        n=sc.nextInt();
        if(n>0)
         {
             System.out.println(n+"is positive");
          }

        else if(n<0)
         {
            System.out.println(n+"is negative");

          } 
       else
          {

              System.out.println("the number is zero");
          }


      }

 

  }