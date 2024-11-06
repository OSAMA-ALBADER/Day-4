package Abstract;

public class Main {
    public static void main(String[] args) {
       Teacher teacher = new Teacher("Osama", "Cyber investigation", 27,5);
       teacher.describeRole();
       teacher.getClass();
        System.out.println( teacher.getName() + " has " + teacher.getClasses() + " class a week");

    }
}
