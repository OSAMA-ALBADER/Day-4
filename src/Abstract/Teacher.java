package Abstract;

 class Teacher extends Person {

     private String subject;
     private int age;
     private int classes;

     public Teacher(String name, String subject, int age, int classes) {
         super(name);
         this.subject = subject;
         this.age = age;
         this.classes = classes;
     }

     public int getClasses() {
         return classes;
     }

     public void setClasses(int classes) {
         this.classes = classes;
     }


     @Override
     void describeRole() {
         System.out.println(getName() + " he love to teach " + subject + " eventhough he is " + age + " years old.");
     }
 }
