import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442 {

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<>();
        if(nums.length <= 1)
            return res;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
            if(nums[i] == nums[i+1]){
                res.add(nums[i]);
                i++;
            }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));

    }
}


