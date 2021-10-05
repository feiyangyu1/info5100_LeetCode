public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};
        moveZeroes(nums1);
        moveZeroes(nums2);
        for(int i : nums1)
            System.out.print(i+"  ");

        System.out.println();

        for(int i : nums2)
            System.out.print(i+" ");
    }

    public static int[] moveZeroes(int[] nums){

        if(nums == null)
            return null;

        for( int i = 0; i < nums.length-1; i ++){
            int pos = 1;
            if(nums[i] == 0){
                while(nums[i+pos] == 0 && (i+pos) < nums.length-1) {
                    pos ++;
                }
                nums[i] = nums[i+pos];
                nums[i+pos] = 0;
            }
        }

        return nums;
    }
}
