import java.util.Scanner;
public class cubeRoot
{
    public void cubeRoot()
    {
        mainClass mainC = new mainClass();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number");
        double number = scan.nextDouble();
        
        double finalNum = Math.cbrt(number);
        
        System.out.println("Cube root of "+number+" is "+finalNum);
        
        mainC.home();
    }
}