package github1;

// Base class
class Parent {
    public void displayMessage() {
        System.out.println("This is the parent class.");
    }
}

// Derived class (inherits from Parent)
class Child extends Parent {
    public void showMessage() {
        System.out.println("This is the child class.");
    }
}

public class Even {
    public static void main(String[] args) {
        // Create an object of the Child class
        Child child = new Child();

        // Call methods from both Parent and Child classes
        child.displayMessage(); // Method from Parent class
        child.showMessage();    // Method from Child class
    }
}