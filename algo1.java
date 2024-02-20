import java.util.Arrays;

void main(){
    int[] nums={10,20,30,40,50};
    System.out.println(Arrays.toString(nums));
    reversedArray(nums);
    System.out.println(Arrays.toString(nums));

}
void reversedArray(int[] nums){
    for (int i=0;i<nums.length/2;i++){
        int temp=nums[i];
        nums[i]=nums[nums.length-1-i];
        nums[nums.length-1-i]=temp;
    }
}
