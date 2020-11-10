import java.util.Scanner;
public class si
{
 public void simpleInterest()
    {
        
        mainClass mainC = new mainClass();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter Principal\n>> ");
        double p = scan.nextDouble();
        
        System.out.print("\n\nEnter Rate\n>>");
        double r = scan.nextDouble();
        
        System.out.print("\n\nEnter Time\n>>");
        double t = scan.nextDouble();
        
        double si = (p*r*t)/100;
        
        System.out.println("Simple Interest: "+si);
        
        mainC.home();
        
    }
}
