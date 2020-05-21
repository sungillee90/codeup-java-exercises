// Custom data type is Person in this case.
public class Person {

    // Creating fields / property
    private String name;

    // End of property
    // Constructor
    public Person(String aName) {
        setName(aName);    // also works
        // this.name = aName;
    }

    // returns the person's name getName method getName = get Property
    // GETTER RETURN
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value setName method
    // SETTER will MOST LIKELY be VOID
    public void setName(String aName) {
        this.name = aName;
    }

    // prints a message to the console using the person's name
    // NOT GOING TO RETURN Anything b/c it will return inside of it
    public void sayHello() {
//        System.out.println("Hello" + this.name);
        System.out.println("Hello from " + getName());    // it will work also
    }

    public static void main(String[] args) {
        Person p1 = new Person("LEE");
        Person p2 = new Person("Sung");
        Person p3 = new Person("Jenny");
//        me.name = "SUNG";
        p1.sayHello(); // since sayHello() has sout, you do NOT need sout again.
//        System.out.println(p2.getName()); // getName() only has return so NEEDS SOUT
//        System.out.println(p3.getName());

        // TODO 2. Understanding references
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  //TRUE
//        System.out.println(person1.toString());     // unique id
//        System.out.println(person2.toString());     // unique id
//        System.out.println(person1 == person2);   //FALSE

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.toString()); // same id
//        System.out.println(person2.toString()); // same id
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
