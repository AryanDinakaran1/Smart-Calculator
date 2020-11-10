import java.util.Scanner;
public class calculator
{
    public Scanner scan = new Scanner(System.in);
    public void add()
    {       
        
        System.out.print("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.print("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        double answer = fnum+snum;          
        
        System.out.println("");  //This line is typed to leave a line

        System.out.println("Added Answer: "+answer);
        
        calculator();
        
    }
    
    public void sub()
    {
        
        System.out.print("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.print("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        double answer = fnum-snum;          
        
        System.out.println("");  //This line is typed to leave a line

        System.out.println("Subtracted Answer: "+answer);
        
        calculator();
        
    }
    
    public void mul()
    {
        
        System.out.print("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.print("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        double answer = fnum*snum;          
        
        System.out.println("");  //This line is typed to leave a line

        System.out.println("Multiplied Answer: "+answer);
        
        calculator();
        
    }
    
    public void div()
    {
        
        System.out.print("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.print("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        double answer = fnum/snum;          
        
        System.out.println("");  //This line is typed to leave a line

        System.out.println("Divided Answer: "+answer);
        
        calculator();
        
    }
    
    public void calculator()
    {
        mainClass mainC = new mainClass();
        mainClass myClass = new mainClass();        
        
        System.out.println("Type 0 to go back\n");
        
        System.out.print("Choose an operator by number\n");
        
        System.out.println("1] Addition");
        System.out.println("2] Subtraction");
        System.out.println("3] Multiplication");
        System.out.print("4] Division\n>> ");
        
        myClass.condition = scan.nextInt();
        
        switch (myClass.condition)
        {
        
        case 1:
            add();
            break;
            
        case 2:
            sub();
            break;
            
        case 3:
            mul();
            break;
            
        case 4:
            div();
            break;
            
        case 0:
            mainC.home();
            break;
            
            default:
                System.out.println("Invalid input");
                calculator();
                break;
        
        }
        
    }
}