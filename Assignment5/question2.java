class Person {
    private String name;
    private int age;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class OverloadedConstructorDemo {
    public static void main(String[] args) {
        
        Person person1 = new Person();
        Person person2 = new Person("Alice");
        Person person3 = new Person("Bob", 30);

        
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge() + " years old");
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge() + " years old");
        System.out.println("Person 3: " + person3.getName() + ", " + person3.getAge() + " years old");
    }
}
