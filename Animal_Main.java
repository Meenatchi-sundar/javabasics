class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // explicit call to parent constructor
    }
}

public class Animal_main {   // or rename appropriately
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}