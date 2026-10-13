import java.util.*;
public class peakElement {
    public static void main(String[] args) {
      int musk[]={1,2,1,3,4,8,6,7};
      int k=3;
      System.out.println(val(musk, k));
        
    }
    public static int val(int[] musk, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:musk){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
