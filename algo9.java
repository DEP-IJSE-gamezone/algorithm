import java.util.Arrays;

void main(){
    int[] nums1={3,2,5,-3,10,8};
    int[] nums2={3,2,5,-3,10,8};

    System.out.println(Arrays.toString(nums1));
    selectionSortViaMin(nums1);
    System.out.println(Arrays.toString(nums1));
    System.out.println("----------------------");
    System.out.println(Arrays.toString(nums2));
    selectionSortViaMax(nums2);
    System.out.println(Arrays.toString(nums2));
}

void selectionSortViaMin(int[] nums){

    for (int i = 0; i < nums.length; i++) {
        int min=nums[i];
        int minIndex=i;
        for (int j = i+1; j <nums.length ; j++) {
            if(min>nums[j]){
                min=nums[j];
                minIndex=j;
            }
        }
        if(i==minIndex)continue;
        int temp=nums[i];
        nums[i]=min;
        nums[minIndex]=temp;
    }
}
void selectionSortViaMax(int[] nums){
    for (int i = nums.length-1; i >0 ; i--) {
        int max=nums[i];
        int maxIndex=i;
        for (int j = 0; j < i; j++) {
            if(max<nums[j]){
                max=nums[j];
                maxIndex=j;
            }
        }
        if(i==maxIndex)continue;
        int temp=nums[i];
        nums[i]=max;
        nums[maxIndex]=temp;
    }

}

//void recursion(int[] nums,int iteration,int interIteration){
//    if(iteration!= nums.length-1){
//
//        if(nums[iteration]>nums[interIteration] && iteration<interIteration){
//            int temp=nums[interIteration];
//            interIteration--;
//
//        }
//        if(interIteration==iteration){
//
//            recursion(nums,iteration++,nums.length-1);
//        }else{
//            recursion(nums,iteration,interIteration++);
//        }
//
//   }
//}


