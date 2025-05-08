
public class builder {
    private int age;
    private String fname;
    private String lname;
    private double weight;

    public student builde(){
        return new student(this);
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getfname(){
        return fname;
    }
    public void setfname(String fname){
        this.fname = fname;
    }
    public String getlname(){
        return lname;
    }
    public void setlname(String lname){
        this.lname = lname;
    }
    public double getweight(){
        return weight;
    }
    public void setweight(double weight){
        this.weight = weight;
    }


}
