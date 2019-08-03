import java.util.Scanner;
class task2
 {
    public static void main(String [] args)
      {
         Scanner sc=new Scanner(System.in);
         long binary1,binary2;
         int i=0,remainder=0;
         int sum[] =new int[25];
         System.out.println("first binery number");
         binary1=sc.nextLong();
          System.out.println("second binery number");
          binary2=sc.nextLong();
          System.out.println(binary1 +"+"+ binary2);


          while(binary1 !=0||binary1!=0)
           {
              sum[i++]=(int)((binary1 % 10 +binary2 % 10+remainder)%10);
               remainder=(int)((binary1 % 10 +binary2 % 10+remainder)/10);
               binary1=binary1/10;
                 binary2=binary2/10;
             
          }
        if(remainder !=0)
 {
   sum[i++]=remainder;
 }
   --i;
System.out.println("sum of binery number is");

while(i>=0)
 {
System.out.println(sum[i--]);
}
System.out.println("");





      }
 }