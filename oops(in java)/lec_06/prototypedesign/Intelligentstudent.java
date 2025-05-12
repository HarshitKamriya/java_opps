public class Intelligentstudent  extends Student{
    private int iq;
    public int getIq(){
        return iq;
    }
    public setIq(int iq){
        this.iq = iq;
    }





    public Student clone(){
        Intelligentstudent istCopy  = new Intelligentstudent();
        istCopy.setName(this.getName()) = this.name;
        istCopy.setAge(this.getAge()) = this.age;
        istCopy.setWeight(this.getWeight()) = this.weight;
        istCopy.setBatch(this.getBatch()) = this.batch;
        istCopy.setInsturctor(this.getInstructor()) = this.Instructor;
        
        return istCopy;
    }
}
