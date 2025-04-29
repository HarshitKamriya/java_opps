public class static_class {
    public static void main(String[] args) {
        staticvariable obj1 = new staticvariable();
        obj1.name = "Har";
        obj1.stand = 10;
        obj1.crushName = "Har";
        staticvariable obj2 = new staticvariable();
        System.out.println(obj2.stand);
        System.out.println(obj2.crushName);
        obj2.crushName = "Pranj";
        staticvariable.crushName = "pal";
        System.out.println(obj1.crushName);
    }
}
