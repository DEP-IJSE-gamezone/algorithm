import java.util.Arrays;

public class algo12_1 {
    public static void main(String[] args) {
        algo12_1 a = new algo12_1();
        int[] nums = {6, 4, 9, 5, -3, 0, 8, 2, 1};
        System.out.println(Arrays.toString(nums));
        a.mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    void mergeSort(int[] nums) {
        sort(nums, 0, nums.length);
    }

    void sort(int[] nums, int start, int end) {
        int length = (end - start) / 2;
        if (length == 0) return;
        int length2 = ((end - start) % 2 == 0 ? length : length + 1);
        int[] array1 = new int[length];
        int[] array2 = new int[length2];
        for (int i = 0; i < length; i++) array1[i]=nums[i];
        for (int i = 0; i < length2; i++) array2[i]=nums[length+i];
        sort(array1, start, length);
        sort(array2, start, length2);

        int i = 0;
        int m=0, n=0;
        for (;m<length && n<length2;i++){
            if(array1[m]<array2[n]){
                nums[i]=array1[m++];
            }else {
                nums[i]=array2[n++];
            }
        }
        for (;m<length;i++){
            nums[i]=array1[m++];
        }
        for (; n <length2 ; i++) {
            nums[i]=array2[n++];
        }
        System.out.println(Arrays.toString(nums));
    }
}
