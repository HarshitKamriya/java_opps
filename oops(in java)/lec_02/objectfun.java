public class objectfun {

    public static void main(String[] args) {
        Fun f1 = new Fun(10,20);
        Fun f2 = new Fun(30,40);
        Swap(f1,f2);
        System.out.println(f1.x+" " + f2.x);
    }
    public static void Swap(Fun f1,Fun f2){
        Fun temp = f1;
        f1 = f2;
        f2 = temp;
    }
}

