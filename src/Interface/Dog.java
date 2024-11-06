package Interface;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dogs like to eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep 8 houres a day");
    }

    @Override
    public void makeSound() {
        System.out.println("park");
    }
}
