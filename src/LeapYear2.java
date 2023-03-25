public class LeapYear2 {
    public static void checkLeapYear(int year)
    {
        if(year%4 == 0)
            if(year%100 == 0)
                if(year%400 == 0)
                    System.out.println("Year" + year + " This is a Leap Year");
                else
                    System.out.println("Year" + year + " This is not a Leap Year");
            else
                System.out.println("Year" + year + " This is a Leap Year");
        else
            System.out.println("Year" + year + " This is not a Leap Year");
    }
    public static void main(String[] args){
        checkLeapYear(1991);
        checkLeapYear(2000);
        checkLeapYear(2013);
        checkLeapYear(2024);
    }
}
