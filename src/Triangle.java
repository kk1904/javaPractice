public class Triangle {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=10;
        c=10;
        if(a==b && b==c && c==a){
            System.out.println("Equal triangle");
        }
        else if (a==b || b==c || c==a) {
            System.out.println("Iscocles triangle");
        }
        else {
            System.out.println("Scaler triangle");
        }
    }
}
