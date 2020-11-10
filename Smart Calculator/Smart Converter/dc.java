import java.util.Scanner;
public class dc
{
    public void daysConverter()
    {       
        Scanner scan = new Scanner(System.in);
        
        mainClass mainC = new mainClass();
        
        System.out.print("\nEnter number of days\n>> ");
        
        int days = scan.nextInt();
        
        int weeks = days/7;
        int months = days/30;
        int years = days/365;
        
        String dayStr = Integer.toString(days);
        String weekStr = Integer.toString(weeks);
        String monthStr = Integer.toString(months);
        String yearStr = Integer.toString(years);
        
        //for days
        if (days <= 9)
        {
            
            weekStr = "0"+days;
            
        }
        else if (days > 9)
        {
            
            dayStr = ""+days;
            
        }
        
        //for weeks
        if (weeks <= 9)
        {
            
            weekStr = "0"+weeks;
            
        }
        else if (weeks > 9)
        {
            
            weekStr = ""+weeks;
            
        }
        
        //for months
        if (months <= 9)
        {               
            
            monthStr = "0"+months;
            
        }
        else if (months > 9)
        {                       
            
            monthStr = ""+months;
            
        }
        
        //for years
        if (years <= 9)
        {                       
            
            yearStr = "0"+years;
            
        }
        else if (years > 9)
        {
            
            yearStr = ""+years;
            
        }
        
        System.out.println("Days   :"+dayStr);   
        System.out.println("Weeks  :"+weekStr);
        System.out.println("Months :"+monthStr);
        System.out.println("Years  :"+yearStr);
        
        mainC.home();        
    }
}
