public class PrimeNumber {
    //prime number - a  number that is divisible only by 1 and itself.
    //example- 2,3,5,7,11,13
    public static void main(String[] args) {
        int num=7;                      //give the number which you want to check
        int count=0;
        for(int i=1; i<=num; i++){     //we will continue the loop until we reached to the value of number variable(for ex. here num=7)
            if(num%i==0){
                count++;               //it will increment the count variable everytime whenever it will find the 0 reminder
            }
        }
        if(count==2)                                   //if you will get 2 in count variable that means this number is divided by 1 and itself.
            System.out.println("Number is Prime");     //so you can say number is prime.
        else
            System.out.println("Number is not prime");  //otherwise this number is divisible by more values so that is not prime number
    }
}
