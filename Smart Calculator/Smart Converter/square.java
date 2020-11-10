import java.util.Scanner;
public class square
{
    public void squareOf()
    {
        Scanner scan = new Scanner(System.in);
        
        mainClass mainC = new mainClass();
        
        System.out.println("Enter the Number\n>> ");
        double number = scan.nextDouble();
        
        double square = number*number;
        
        System.out.println("Square of "+number+" is "+square);
        
        mainC.home();        
    }
}