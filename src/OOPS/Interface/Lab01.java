//1. Interface also has abstract methods.
//2. Even if you do not mention the word abstract near method name in interface, it's fine.
//3. the class that is implementing the method need to mention public in front of the method's name
//4. An interface cannot have a constructor
//5. Interface supports multiple inheritance (2 or more Base classes-> 1 derived class)
//6. Interfaces cannot have traditional non-abstract methods but they can have default and static methods
//7. Objects cannot be created of an interface meaning an interface cannot be instantiated.
//8. In interface, everything is public. Private, protected, etc cannot be used for an interface.
//9. Interface can be declared as public meaning it can be accessed outside of the package also.
//10. If no access modifier is specified, meaning it is implicitly considered as having a default access.
//This means it is accessible only within the package.
//11. An interface cannot be declared as private or protected.

package Classes.Interface;

public class Lab01 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}

    interface Animal {
        abstract void walk();
    }

    interface Herbivore {
        void eat();
    }

    class Horse implements Animal, Herbivore {
        public void walk() {
            System.out.println("I am Horse. I walk on 4 legs");
        }

        public void eat() {
            System.out.println("I eat only plants");
        }
    }


