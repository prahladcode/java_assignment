
interface A {
    void methodA();
}


interface B {
    void methodB();
}


class MultipleInheritanceDemo implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();

     
        obj.methodA();
        obj.methodB();
    }
}
