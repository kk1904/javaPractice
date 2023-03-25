package exampleofdifferentmethods;
public class CalculateResult {
        public void result(int marks) {
            if(marks>=0 && marks<=100)
            {
                if (marks >= 70)
                    System.out.println("Marks=" + marks + " Student passed with Grade A");
                else if (marks >= 60 && marks < 69)
                    System.out.println("Marks=" + marks + " Student passed with Grade B");
                else if (marks >= 50 && marks < 59)
                    System.out.println("Marks=" + marks + " Student passed with Grade C");
                else if (marks >= 40)
                    System.out.println("Marks=" + marks + " Student passed with Grade D");
                else
                    System.out.println("Marks=" + marks + " Student failed");
            }
            else {
                System.out.println("Marks=" + marks + " Invalid Marks");
            }
        }
        public  static void main(String[] args)
        {
            CalculateResult r1=new CalculateResult();
            r1.result(89);
            r1.result(23);
            r1.result(145);
        }
}

