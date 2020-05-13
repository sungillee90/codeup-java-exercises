package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        //   <Key(dataType),valueStudentObj>
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Moongchi");
        s1.addGrade(100);
        s1.addGrade(80);
        s1.addGrade(30);

        Student s2 = new Student("Sarang");
        s2.addGrade(100);
        s2.addGrade(90);
        s2.addGrade(85);

        Student s3 = new Student("JavaLearner");
        s3.addGrade(80);
        s3.addGrade(70);
        s3.addGrade(75);

        Student s4 = new Student("LeMans");
        s4.addGrade(100);
        s4.addGrade(40);
        s4.addGrade(20);

        //Print the list of GitHub usernames out to the console,
        System.out.println("students = " + students);
        //and ask the user which student they would like to see more information about.
        //The user should enter a GitHub username (i.e. one of the keys in your map).
        //If the given input does not match up with a key in your map, tell the user that no users with that username were found.
        //If the given username does exist, display information about that student, including their name and their grades.






    }
}
