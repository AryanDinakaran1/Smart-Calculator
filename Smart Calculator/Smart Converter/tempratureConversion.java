import java.util.Scanner;
public class tempratureConversion
{
    public Scanner scan = new Scanner(System.in);
    public void cel()
    {
        
        System.out.print("\nEnter Fahrenheit\n>> ");
        double f = scan.nextDouble();
        
        double c = (f-32) * 5/9;        
        
        System.out.println("Celsius: "+c+"°C");     
        
        temperatureConverter();
                
    }
    
    public void fah()
    {
        
        System.out.print("\nEnter Celsius\n>> ");
        double c = scan.nextDouble();
        
        double f = (c*9/5)-32;      
        
        System.out.println("Fahrenheit: "+f+"°F");
        
        temperatureConverter();         

        
    }
    
    public void temperatureConverter()
    {
        mainClass mainC = new mainClass();
        mainClass myClass = new mainClass();
        
        System.out.println("Type 0 to go back \n");
        
        System.out.print("\nChoose an option\n");
        
        System.out.println("1] Celsius");
        System.out.print("2] Faherenheit\n");
        
        System.out.print(">> ");
        
        myClass.condition = scan.nextInt();
                
        switch (myClass.condition) {
            case 1: 
                
                cel();
                break;
                
            case 2:
                
                fah();
                
                break;
                
            case 0:
                mainC.home();
                break;
            
            default:
                System.out.println("Invalid input\n");
                temperatureConverter();
                break;
            
        }
    }
    
}