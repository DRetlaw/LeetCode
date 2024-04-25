import java.util.HashMap;
import java.util.Map;

public class Test2504244 {

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println("Done!!!");
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int counter=1;
        int current = nums[0];
        int index = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(current!=nums[i])
            {
                nums[++index]=nums[i];
                current = nums[i];
                counter++;
            }
            
            
        }

        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+",");
        return counter;
    }
    
}
