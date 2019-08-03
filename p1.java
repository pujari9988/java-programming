
public class task1
  {
    public static void main(String args[])
     {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter A radius");
        float r=sc.nextfloat();
        double area=math.pi*math.pow(r,2);
        double per=2*math.pi*r;
      
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Area:"+df.format(area));
        System.out.println("Perimeter:"+df.format(per));
     }
} 