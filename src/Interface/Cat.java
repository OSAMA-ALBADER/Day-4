package Interface;

public class Cat implements Animal{
    @Override
    public void sleep() {
        System.out.println("cat sleep 15 hourse a day");
    }

    @Override
    public void eat() {
        System.out.println("cat eat tuna");
    }

    @Override
    public void makeSound() {
        System.out.println("mewww");
    }
}
