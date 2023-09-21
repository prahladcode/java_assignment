class MyClass {
    private int privateVar;

    public MyClass(int privateVar) {
        this.privateVar = privateVar;
    }

    public void printPrivateVar() {
        System.out.println("Value of privateVar inside the class: " + this.privateVar);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
       
        obj.printPrivateVar();
    }
}
