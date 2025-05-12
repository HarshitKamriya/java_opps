public class client {
    public static void main(String[] args) {
        Studentregistery studentregistery = new Studentregistery();
        fillRegistry(studentregistery);

        Student Preetam = studentregistery.get("SD2").clone();
        Preetam.setAge(20);


        Student Sahil = studentregistery.get("SD2").clone();
        Sahil.setAge(25);
        
    }
    public static void fillRegistry(Studentregistery studentregistery){
        Student obj1 = new Student();
        obj1.setBatch("SD2");
        obj1.setInsturctor("Abhishek");
        studentregistery.register("SD2",obj1);
    }
}
