public class FibonacciSeries {
    //0 1 1 2 3 5 8 13---A series of numbers in which each number is the sum of two preceding numbers(i.e.-0+1=1) and so on
    public static void main(String[] args) {

        int first=0, second=1, sum=0;   //so you need 3 variable, 1st to store first number, 2nd to store second number,
                                        // and 3rd to store sum of first & second number
        for(int i=1; i<=10;i++){
            System.out.println(sum);
            sum=first+second;           //it will perform the addition of first variable and second  variable
            first=second;               //everytime it will store the second variable value into first  variable
            second=sum;                 //everytime it will store the sum's value into second variable
        }
    }
}
