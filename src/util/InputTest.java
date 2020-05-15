package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("You typed: " + input.getString());
//        System.out.println("Yes or No: " + input.yesNo());

        System.out.println(input.getInt(1,5));
        System.out.println(input.getInt());

//        System.out.println(input.getDouble());
//        System.out.println(input.getDouble(5.5,10.90));
    }
}
