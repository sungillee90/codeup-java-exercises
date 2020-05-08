// Custom data type is Person in this case.
public class Person {
    // 1. Object basics
    // Creating fields
    private String name;

    // returns the person's name
    public String getName() {
        return String.format("Hello %s!", this.name);
    }
    // Creating Constructor
    private Person (String name) {
        this.name = name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello" + this.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kim");
        Person p2 = new Person("Sung");
        Person p3 = new Person("Jenny");
//        me.name = "SUNG";
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        // TODO 2. Understanding references
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  //TRUE
//        System.out.println(person1 == person2);   //FALSE

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);   //TRUE

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println("person1.getName(): " + person1.getName());    //JOHN
//        System.out.println(person2.getName());    //JOHN
//        person2.setName("Jane");
//        System.out.println(person1.getName());    //Jane
//        System.out.println(person2.getName());    //Jane

    }


}
