public class MangoDb implements Database{
    // public void createQuery(){
    //     System.out.println("I am in MangoDb class");
    // }



    @Override
    public Query createQuery() {
        return new MangoDbQuery();
    }
}
