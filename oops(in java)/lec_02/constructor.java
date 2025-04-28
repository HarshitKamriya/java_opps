public class constructor {
    public static void main(String[] args) {
        house h1 = new house(10, 2, "Blue");
        System.out.println(h1.roomcount);
    }
    public static class house{
        int roomcount;
        int floorsize;
        String color;
        house(int x,int y,String s){
            roomcount = x;
            floorsize = y;
            color = s;
        }
        house(){
            
        }
    }
    
}


