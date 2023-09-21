class Animal {
    private String species;

   
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor invoked.");
    }

    public void displayInfo() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species); 
        this.breed = breed;
        System.out.println("Dog constructor invoked.");
    }

    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Breed: " + breed);
    }
}

public class SubclassConstructorDemo {
    public static void main(String[] args) {
        
        Dog myDog = new Dog("Canine", "Golden Retriever");

        
        myDog.displayInfo();
    }
}
