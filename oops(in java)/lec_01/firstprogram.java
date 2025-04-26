// package oops(in java);

public class firstprogram {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;



        house h1 = new house();
        h1.roomcount = 10;
        h1.floorsize = 2;
        h1.color = "Blue";
        
        
        
        house h2 = new house();
        h2.roomcount = 30;
        h2.floorsize = 5;
        h2.color = "Red";

        System.out.println(h1.floorsize+h2.floorsize);
        System.out.println(h1.roomcount+h2.roomcount);
        System.out.println(h1.color);

    }
    public static class house{
        int roomcount;
        int floorsize;
        String color;
        
    }
}
