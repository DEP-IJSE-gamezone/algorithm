
import java.util.Arrays;
public class algo11_1 {


    void main() {
        int[] nums = {6, 4, 9, 5, -2, 7, 0};
//    int[] nums = {5, 4, 3, 2, 1, 0, -1};
        System.out.println(Arrays.toString(nums));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    void insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            //selection
            int value=nums[i+1];
            //optimization logic
            if (value>nums[i])continue;
            int insertionIndex=i;
            //search
            for (int j = 0; j < i+1; j++) {
                if (value<nums[j]) {
                    insertionIndex=j;
                    break;
                }
            }
            //shift
            for (int k = i+1; k >insertionIndex; k--) {
                nums[k]=nums[k-1];
            }
            nums[insertionIndex]=value;
        }
    }



}