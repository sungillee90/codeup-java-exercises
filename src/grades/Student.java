package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

        //Private properties for the student's name, and grades.
        private String name;
        //grades property should be an todo ArrayList of integers.
        private ArrayList<Integer> grades;
        //constructor that sets name property, and initializes the grades property as an empty ArrayList.
        public Student(String name) {
            this.name = name;
            // todo We do [this.grades = new ArrayList<>();]
            //  so we don't waste memory initializing the array,
            //  if there no grades at first while you create Student's grades
            this.grades = new ArrayList<>();
        }

        // initializes the grades property as an empty ArrayList.
//        ArrayList<Integer> grades = new ArrayList<>();



        // returns the student's name
        public String getName(){
            return this.name;
        }
        // adds the given grade to the grades property
        public void addGrade(int grade){
            this.grades.add(grade);
//WRONG APPROACH      this.grades += grade;
            // Requried                          Provided
            // ArrayList (grades)              int (grade)
            //ArrayList's dataType is INT.

        }
        // returns the average of the students grades
        public double getGradeAverage(){
            double totalGrades = 0d;
            for (Integer grades : this.grades){
                totalGrades += grades;
            }
            return (totalGrades) / (this.grades.size());
            // Operator '/' cannot be applied to 'java.util.ArrayList<java.lang.Integer>', 'int'
        }

    public static void main(String[] args) {
        // Creating Objects
        Student student1 = new Student("Sung");
        Student student2 = new Student("Il");
        Student student3 = new Student("Lee");
        // Verify that you can add grades to each object, YES
        student1.addGrade(60);
        student1.addGrade(60);
        student1.addGrade(60);

        student2.addGrade(40);
        student2.addGrade(60);
        student2.addGrade(100);

        student3.addGrade(80);
        student3.addGrade(100);
        // and that your getGradeAverage method correctly
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());
        System.out.println("student3.getGradeAverage() = " + student3.getGradeAverage());

        // returns the average of the student's grades.
        // student1 = 60
        // student2 = 66.666
        // student3 = 90




    }


}
