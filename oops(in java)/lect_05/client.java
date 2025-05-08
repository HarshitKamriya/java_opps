
public class client {
    public static void main(String[] args) {
        builder build = student.createbuild();
        build.setAge(24);
        build.setfname("Harshit");
        build.setlname(null);
        build.setweight(58);

        student s1 = build.builde();
        System.out.println(s1.getfname());




    }
}
