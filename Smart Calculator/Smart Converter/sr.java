import java.util.Scanner;
public class sr
{
    public void squareRootOf()
    {
        Scanner scan = new Scanner(System.in);
        
        mainClass mainC = new mainClass();
        
        System.out.println("Enter the Number\n>> ");
        double num = scan.nextDouble();
        
        double answer = Math.sqrt(num);
        
        System.out.println("Square Root of "+num+" is "+answer);
        
        mainC.home();        
    }
}