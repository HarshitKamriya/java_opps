public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private int weight;
    private String batch;
    private String Instructor;


    public Student clone(){
        Student stCopy  = new Student();
        stCopy.name = this.name;
        stCopy.age = this.age;
        stCopy.weight = this.weight;
        stCopy.batch = this.batch;
        stCopy.Instructor = this.Instructor;
        

        return stCopy;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setName(int age){
        this.age = age;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getBatch(){
        return batch;
    }
    public void setBatch(String batch){
        this.batch = batch;
    }
    public String getInstructor(){
        return Instructor;
    }
    public void setInsturctor(String Instructor){
        this.Instructor = Instructor;
    }



}
