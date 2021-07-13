import java.util.HashMap;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            if(nums==null||nums.length<=1)
                throw new IllegalArgumentException("Array should contain atleast 2 elements");

            HashMap<Integer,Integer> map = new HashMap();

            for(int i = 0; i < nums.length; i++ )
            {
                Integer compliment = map.get(target-nums[i]);

                if(compliment!=null)
                {
                    return new int[] {i,compliment};
                }

                map.put(nums[i],i);
            }

            throw new IllegalArgumentException("We can not find the two sum result.");
        }

        public static void main(String[] args)
        {
            TwoSum twoSum = new TwoSum();
            int[] nums= {3, 2, 4};
            int[] result = twoSum.twoSum( nums,6);
            System.out.println("The index of 2 numbers are : [" + result[0] + "," + result[1] + "]");
        }
    }

