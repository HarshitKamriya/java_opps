
public class student {
    private int age;
    private String fname;
    private String lname;
    private double weight;


    // public student(int age,String fname,String lname,double weight){
    //     this.age = age;
    //     this.fname = fname;
    //     this.lname = lname;
    //     this.weight = weight;
    // }
    public student(builder build){
        this.age = build.getAge();
        this.fname = build.getfname();
        this.lname = build.getlname();
        this.weight = build.getweight();

    }
    public int getAge(){
        return age;
    }
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public double getweight(){
        return weight;
    }
    public static builder createbuild(){
        return new builder();
    }


}
