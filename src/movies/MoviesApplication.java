package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] arg) {

        System.out.println("Do you want to see all the movies by default? or by category?");
        Input usersInput = new Input();
        usersInput.yesNo();


    }
}
