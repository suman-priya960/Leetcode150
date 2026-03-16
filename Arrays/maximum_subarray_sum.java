public class maximum_subarray_sum {
    public int maxSubArray(int[] nums) {

        int maxSum =nums[0];
        int currentsum=0;


        for(int i = 0; i < nums.length; i++) {
            currentsum+=nums[i];
            if(currentsum>maxSum){
                maxSum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }

        }



        return maxSum;
    }
}
