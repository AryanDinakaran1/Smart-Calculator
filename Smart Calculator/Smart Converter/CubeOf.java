import java.util.Scanner;
public class CubeOf
{
    public void cubeOf()
    {
        mainClass mainC = new mainClass();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the number");
        double num = scan.nextDouble();
        
        double finalNum = num*num*num;
        
        System.out.println("The cube of "+num+" is "+finalNum);
        mainC.home();
    }
}