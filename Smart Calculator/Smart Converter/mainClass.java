import java.util.Scanner;

public class mainClass
{
    static int condition;
    public void home()
    {
        Scanner scan = new Scanner(System.in);

        calculator cal = new calculator();
        tempratureConversion temp = new tempratureConversion();
        si mySI = new si();
        dc myDC = new dc();
        shapes myShape = new shapes();
        square mySQ = new square();
        sr mySR = new sr();
        CubeOf co = new CubeOf();
        cubeRoot cr = new cubeRoot();

        mainClass myClass = new mainClass();

        try
        {
            System.out.println("You can type 0 to exit SmartConverter\n");

            System.out.println("Choose an program with its serial number ");

            System.out.println("1] Calculator");
            System.out.println("2] Temprature Conversion");
            System.out.println("3] Simple Interest");
            System.out.println("4] Days Converter");
            System.out.println("5] Calculating Shapes");
            System.out.println("6] Square of a Number");
            System.out.println("7] Square Root of a Number");
            System.out.println("8] Cube of Number");
            System.out.println("9] Cube Root of a Number");

            System.out.print("\n>> ");
            myClass.condition = scan.nextInt();                

            switch (myClass.condition)
            {

                case 1:

                cal.calculator();

                break;

                case 2:

                temp.temperatureConverter();

                break;

                case 3:

                mySI.simpleInterest();

                break;

                case 4:

                myDC.daysConverter();

                break;

                case 5:

                myShape.shapes();

                break;

                case 6:

                mySQ.squareOf();

                break;

                case 7:

                mySR.squareRootOf();

                break;

                case 8:

                co.cubeOf();

                break;

                case 9:

                cr.cubeRoot();

                break;

                case 10:

                //pending

                break;

                case 0:

                System.out.println("\nShutdown Confirmed");

                break;

                default:
                System.out.println("Invalid Input");
                home();
                break;

            }
        }catch(Exception e)
        {
            System.out.println("Should be an int type input\n");
            home();
        }
    }
    public static void main(String args[])
    {
        mainClass mainC = new mainClass();

        mainC.home();        
    }
}