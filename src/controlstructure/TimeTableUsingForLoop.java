package controlstructure;
public class TimeTableUsingForLoop {
       //7 X 1 = 7
        public static void timeTable(int number){
            System.out.println("This is the TimeTable of Number " + number);
            System.out.println("==========================================");
            for(int i=1; i<=10; i++){
                System.out.println(number + "X" + i + "=" + number*i);
            }
            System.out.println("==========================================");
        }
    public static void main(String[] args){
                timeTable(7);
                timeTable(9);
    }
}
