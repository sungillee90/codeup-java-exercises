package reDoExercises;

public class RedoPerson {
    private String name;

    public RedoPerson (String aName) {
        this.name = aName;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public static void main(String[] args) {
        RedoEmployee john = new RedoEmployee("John");
        RedoPerson sung = new RedoPerson("Sung");

        sung.sayHello();
        john.sayHello();
        john.doWork();


    }
}
