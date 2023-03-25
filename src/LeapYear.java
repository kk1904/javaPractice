public class LeapYear {
    //To check the Leap year you can check the following criteria.
    // If the given year is divisible by 4 And not divisible by 100 then it is a leap year. or
    // If the given year is divisible by 100 then it should also be divisible by 400,
    // then it is known as leap year.(for Century year)
    public static void checkLeapYear(int year){
            if(year%4 ==0 && year%100!=0 || year%100 == 0 && year%400 ==0) {
                System.out.println("Year" + year + " This is a Leap Year");
        }
        else {
            System.out.println("Year" + year + " This is not a Leap Year");
        }
    }
    public static void main(String[] args){
        checkLeapYear(1991);
        checkLeapYear(2000);
        checkLeapYear(2013);
        checkLeapYear(2024);
    }
}

