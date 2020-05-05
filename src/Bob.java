import java.util.Scanner;

public class Bob {
    public static void main (String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What will you say to Bob? ");

        String userResponse = sc.nextLine().trim();
        System.out.println(userResponse);

        if (userResponse.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }

//        String askFirstQ = "Do you want to go to Osaka for dinner.";
////        String askSecondQ = "Put it in the 4th gear!";
//        System.out.println("askFirstQ = " + askFirstQ);
//        if (userResponse.endsWith("?")) {
//            System.out.println("sure");
//        } else if (userResponse.endsWith("!")) {
//            System.out.println("Whoa, chill out!");
//        } else if (userResponse.endsWith(" ")){
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("Whatever");
//        }


    }
}
