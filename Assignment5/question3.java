
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}


class Bulldog extends Dog {
    void specialAbility() {
        System.out.println("The bulldog has a special ability.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
       
        Bulldog bulldog = new Bulldog();

      
        bulldog.eat();

        
        bulldog.bark();

       
        bulldog.specialAbility();
    }
}
