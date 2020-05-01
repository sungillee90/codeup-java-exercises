public class HelloWorld {
    public static void main (String arg[]) {

        System.out.println("Hello, World!");
        System.out.println("Hello, Sung!");

        int myFavoriteNumber = 76;
        System.out.println("myFavNum = " + myFavoriteNumber);

        String myString = "MyName is Sung Il Lee.";
        System.out.println(myString);
        // char myString = 'c';

        String myStringCharacter = "3.14159";
        System.out.println(myStringCharacter);

        // LONG variable only takes the integer. So no 3.14(L) worked.
        // 0 is consider as INTEGER
        // long myNumber = 0L; ====> initialize! DO IT! long variable
        long myNumber = 123;
        System.out.println(myNumber);

        // 2 ways to fix it (casting) OR put f at the end OR change float to double
        float myNumber2 = (float) 3.14;
        System.out.println("casting (float): " + myNumber2);
        float myNumber3 = 3.14f;
        System.out.println("putting f at the end: " + myNumber3);
        double myNumber4 = 3.14;
        System.out.println("change float to double: " + myNumber4);

//        int x = 5;
//        System.out.println(x++);  // 5
//        System.out.println(x);    // 6

        int x = 5;
        System.out.println(++x);  // 6
        System.out.println(x);    // 6

        // class is RESERVED keywords
//        String class = "sung";
//        System.out.println(myName);



//        String theNumberThree = "three";
//        Object o = theNumberThree;  // Object o = "three" (String);
//        int three = (int) o;        // int three = (casting to integer) object O => String "three"
//                                    // int three !== String "three"
//
//        System.out.println(theNumberThree);
//        System.out.println(o);
//        System.out.println(three);

//        int three = (int) "three";    // String can NOT be an OBJECT or
                                        // String can NOT Casting into the integer
                                        // Object can NOT Casting into integer

        int xy = 4;
//        xy = xy + 5;  // 9
        xy += 5;    // 9

        System.out.println(xy);

        int xy1 = 3;
        int y = 4;
//        y = y * xy1;    // 12
        y *= xy1;   //12

        System.out.println(y);

        int x3 = 10;
        int y3 = 2;
        x3 /= y3;   // 5
        y3 -= x3;   // -3

        System.out.println(x3);
        System.out.println(y3);

        int maxValue = Integer.MAX_VALUE;   // 2147483647
        int newMaxValue = maxValue + 1;
        ++maxValue;     // -2147483648
        ++maxValue;     // -2147483647


        System.out.println(maxValue);
        System.out.println("newMaxValue= " + newMaxValue);
        // Once I declear data type of int or any of them,
        // you do not need to put int to re-assign the value
        x = 5;
        y3 = 6;
        x += y3; // 6+5 = 11
        System.out.println(x);

    }
}
