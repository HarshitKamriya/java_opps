public class MySqlDb  implements Database{
    // @Override
    // public void createQuery() {
    //     System.out.println("I am in MySqlDb class");
    // }



    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
