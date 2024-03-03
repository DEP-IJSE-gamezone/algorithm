import java.util.Arrays;

void main(){
    int[] nums1={5,-1,3,-2,0,8,4};
    int[] nums2={5,-1,3,-2,0,8,4};

    System.out.println(Arrays.toString(nums1));
    bubbleSortViaMin(nums1);
    System.out.println(Arrays.toString(nums1));
    System.out.println("----------------------------");

    System.out.println(Arrays.toString(nums2));
    bubbleSortViaMax(nums2);
    System.out.println(Arrays.toString(nums2));


}

void bubbleSortViaMin(int[] nums){
    for (int i = 0; i < nums.length-1; i++) {
        for (int j = nums.length-1; j >i ; j--) {
            if(nums[j]<nums[j-1]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
            }
        }
    }

}
void bubbleSortViaMax(int[] nums){
    for (int i = 0; i < nums.length-1; i++) {
        for (int j = 0; j < nums.length-1 -i; j++) {
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }
}