public class StringFunctions {
    public static void main(String[] args) {
        String string1="krishna";
        String string2="vasani";

        int length=string1.length();  //function
        System.out.println("Length of string is:=" +length);

        String myNameInUpperCaseLetters =string1.toUpperCase();
        System.out.println("Letters in Uppercase:=" + myNameInUpperCaseLetters);

        String myNameInLowerCaseLetters =string1.toLowerCase();
        System.out.println("Letters in LowerCase:=" + myNameInLowerCaseLetters);

        String myFullName= string1.concat(string2);
        System.out.println("My Full Name:=" +myFullName);

        StringBuffer stringBuffer=new StringBuffer(string1);
        System.out.println("Reverse String:="+ stringBuffer.reverse());

        String replaceString =string1.replace("krishna","radha");
        System.out.println("Replaced String:=" + replaceString);

        boolean containsString = string1.contains("z");
        System.out.println("If string contains:="+ containsString);

    }
}
