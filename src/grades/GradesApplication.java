package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {
        //   <Key(dataType),valueStudentObj>
        HashMap<String, Student> students = new HashMap<>();

//        students.put("JavaJS");

        Student moongchi = new Student("Moongchi");
        moongchi.addGrade(100);
        moongchi.addGrade(80);
        moongchi.addGrade(30);

        Student sarang = new Student("Sarang");
        sarang.addGrade(100);
        sarang.addGrade(90);
        sarang.addGrade(85);

        Student javaLearner = new Student("JavaLearner");
        javaLearner.addGrade(80);
        javaLearner.addGrade(70);
        javaLearner.addGrade(75);

        Student leMans = new Student("LeMans");
        leMans.addGrade(100);
        leMans.addGrade(40);
        leMans.addGrade(20);

        students.putIfAbsent("MoongchiGitHubID", moongchi);
        students.putIfAbsent("SarangGitHubID", sarang);
        students.putIfAbsent("JavaLearnerGitHubID", javaLearner);
        students.putIfAbsent("LeMansGitHubID", leMans);

        cli(students); //command line interface
    }
    public static void cli(HashMap<String, Student> students) {
        //Print the list of GitHub usernames out to the console,
//        System.out.println("Here are the GitHub usernames of our students:" + students.keySet());
//        System.out.println("students.values(): " + students.values()); // grades.Student@60 ADDRESSES Of value. <key, Value>
//        System.out.println("students.size(): " + students.size()); // 4

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do {
            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }
            //        System.out.println("students.keySet(): " + students.keySet());

            //and ask the user which student they would like to see more information about.
            //        Scanner sc = new Scanner(System.in);
            System.out.println("What student would you like to see more information on?");
            String userInput = input.getString();

            if (students.containsKey(userInput)) {

                Student currentStudent = students.get(userInput);
//                System.out.println(students.get(userInput).getName());
                System.out.println(String.format("Name: %s - GitHub Username: %s\n" +
                        "Current Average: %.2f\n", currentStudent.getName(), userInput, currentStudent.getGradeAverage())); // String.format == printf
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            }
            System.out.println("Would you like to see another student?\n");
        }while(input.yesNo());

        //The user should enter a GitHub username (i.e. one of the keys in your map).
        //If the given input does not match up with a key in your map, tell the user that no users with that username were found.
        //If the given username does exist, display information about that student, including their name and their grades.






    }
}
