import java.util.ArrayList;
import java.util.Collections;
public class Fun5 {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<Integer>();
        nums.add(15);nums.add(27);nums.add(10);
        nums.add(13);nums.add(14);nums.add(23);
        nums.add(18);nums.add(29);nums.add(11);
        nums.add(31);nums.add(16);nums.add(22);
         System.out.println(nums);
            System.out.println();
        Collections.sort(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
        
    }
    
}
