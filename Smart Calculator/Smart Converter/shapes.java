import java.util.Scanner;
public class shapes
{
    public Scanner scan = new Scanner(System.in);
    public void area()
    {
        
        float pi = 3.14f;
        
        System.out.print("\nEnter radius\n>> ");
        double r = scan.nextDouble();
        
        double area = pi*r*r;
        
        System.out.println("\nBy using the formula πr²");
        System.out.println("\nArea: "+area);
        
        shapes();
        
    }
    
    public void circum()
    {
        
        float pi = 3.14f;
        
        System.out.print("\nEnter Radius: \n>> ");
        double r = scan.nextDouble();
        
        double circum = 2*pi*r;
        
        System.out.println("By using the formula 2πr");
        System.out.println("Circumference: "+circum);
        
        shapes();
        
    }
    
    public void circle() 
    {
        mainClass myClass = new mainClass();
    
        System.out.println("Type 0 to go back");
        
        System.out.println("Choose an option\n");
        
        System.out.println("1] Area");
        System.out.println("2] Circumference");     
        
        myClass.condition = scan.nextInt();
        
        switch (myClass.condition)
        {
        
        case 1:
            
            area();
            
            break;
            
        case 2:
            
            circum();
            
            break;
            
            default:
                
                System.out.println("Invalid Input");
                circle();
                
                break;
        
        }
        
    
    }
    
    public void areaOfRectangle()
    {
        
        System.out.print("\nEnter Length\n>> ");
        double l = scan.nextDouble();
        
        System.out.print("\nEnter Breadth\n>> ");
        double b = scan.nextDouble();
        
        double area = l*b;
        
        if (l > b)
        {
            
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|                  |");
            System.out.println("|                  |");
            System.out.println("|__________________|");
            
            System.out.println("\nArea: "+area);
            shapes();
            
        }
        else if (b > l)
        {
            
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|_______|");
            
            System.out.println("\nArea: "+area);
            shapes();
            
        }
        else if (l == b)
        {
            
            System.out.println("After analyzing your input looks like it is a square.");
            shapes();
        }
        
        else {
            
            System.out.println("Error calculating your shape");
            shapes();
            
        }
        
    }
    public void perimeterOfRectangle()
    {
        
        System.out.print("\nEnter Length\n>> ");
        double l = scan.nextDouble();
        
        System.out.print("\nEnter Breadth\n>> ");
        double b = scan.nextDouble();
        
        double perimeter = 2*(l+b);
        
        if (l > b)
        {
            
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|                  |");
            System.out.println("|                  |");
            System.out.println("|__________________|");
            
            System.out.println("\nArea: "+perimeter);
            shapes();
            
        }
        else if (b > l)
        {
            
            System.out.println(" _______");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|       |");
            System.out.println("|_______|");
            
            System.out.println("\nArea: "+perimeter);
            shapes();
            
        }
        else if (l == b)
        {
            
            System.out.println("After analyzing your input looks like it is a square.");
            shapes();
        }
        
        else {
            
            System.out.println("Error calculating your shape");
            shapes();
            
        }
        
    }
    
    public void rect()
    {
        mainClass myClass = new mainClass();
        
        System.out.println("You can type 0 to go back\n");
        
        System.out.println("Choose an option\n");
        
        System.out.println("1] Area");
        System.out.println("2] Perimeter\n>> ");
        
        myClass.condition = scan.nextInt();
        
        switch(myClass.condition)
        {
        
        case 1:
            
            areaOfRectangle();
            
            break;
            
        case 2:
            
            perimeterOfRectangle();
            
            break;
            
            default:
                
                System.out.println("Invalid input");
                rect();
                
                break;
        
        }
                
    }
    
    public void areaOfSq()
    {
        
        System.out.println("Enter Side\n>> ");
        double side = scan.nextDouble();
        
        double area = side*side;
        
        System.out.println("Area of Square: "+area);
        
        sq();
        
    }
    
    public void perimeterOfSq()
    {
        
        System.out.println("Enter Side\n>> ");
        double side = scan.nextDouble();
        
        double peri = 4*(side);
        
        System.out.println("Area of Square: "+peri);
        
        sq();
        
    }
    
    public void sq()
    {
        mainClass myClass = new mainClass();
        
        System.out.println("\nWhat do you want to find?\n");
        
        System.out.println("1] Area");
        System.out.println("2] Perimeter\n>> ");
        
        myClass.condition = scan.nextInt();
        
        switch (myClass.condition)
        {
        
        case 1:
            
            areaOfSq();
            
            break;
            
        case 2:
            
            perimeterOfSq();
            
            break;
            
            default:
                
                System.out.println("Invalid Input");
                rect();
                
                break;
        
        }
        
    }
    
    public void shapes()
    {
        mainClass myClass = new mainClass();
        
        System.out.println("\nType 0 to exit\n");
        
        System.out.println("1] Circle");
        System.out.println("2] Rectangle");
        System.out.println("3] Square");
        
        System.out.print("\n>> ");
        myClass.condition = scan.nextInt();
        
        switch(myClass.condition)
        {
        
            case 1:
            
                circle();
                
            break;
            
            case 2:
                
                rect();
                
                break;
                
            case 3:
                
                sq();
                
                break;
                
                default:
                    
                    System.out.println("Sorry I didn't get that");
                    shapes();
                    
                    break;
        
        }
    }
}