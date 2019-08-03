package number
   public class p9
     {
        public static void main(string[] args)
          {
            System.out.println("ENter A three number");
              Scanner sc=new Scanner(System.in);
              int x=sc.nextInt();
              int y=sc.nextInt();
              int z=sc.nextInt();
            
              if(x>y && x>z)
                {
                   System.out.println(x+"is large");
              }
                   else if(y>z && y>x )    
                {
                     System.out.println(y+"is large");

                }
               else if(z>x &&z>y)
               {
                       System.out.println(z+"is large");
 
               }
            }


      }