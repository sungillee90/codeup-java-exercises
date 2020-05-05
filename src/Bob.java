import java.util.Scanner;

public class Bob {
    public static void main (String[] arg) {
        System.out.println("heee");
        Scanner sc = new Scanner(System.in);

        String askFirstQ = "Do you want to go to Osaka for dinner.";
//        String askSecondQ = "Put it in the 4th gear!";
        System.out.println("askFirstQ = " + askFirstQ);
        if (askFirstQ.endsWith("?")) {
            System.out.println("sure");
        } else if (askFirstQ.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (askFirstQ.endsWith(" ")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }


    }
}
