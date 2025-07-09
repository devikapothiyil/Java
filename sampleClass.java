class Person {
    String name;
    int age;

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Devika";
        p.age = 21;
        p.display();
    }
}
