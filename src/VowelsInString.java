import java.util.Locale;

public class VowelsInString {
    public static void main(String[] args) {
        String str="Hello Everyone";
        str=str.toLowerCase();
        System.out.println("String:="+str);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Total number of vowels in the string:="+count);
    }
}
