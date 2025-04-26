public class mergesort {
    public static void main(String[] args) {
        
    }
    public static void mergesort(int[] arr,int sp,int ep){
        int m = sp+(ep-sp)/2;
        if(sp>ep) return;
        mergesort(arr, sp, m);
        mergesort(arr, m+1, ep);
        merge(arr,sp,m,ep);

    }
    public static int[] merge(int[] arr,int sp,int m, int ep){
        int[] nums = new int[ep-sp+1];
        

    }
}
