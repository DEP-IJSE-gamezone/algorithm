import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.StructureViolationException;

public class algo13 {
    //binary sort algorithm
    void main() {
        int[] nums = {5, 4, -3, 0, 7, 2, 1};
        int[] numsClone=nums.clone();
        final var SCANNER = new Scanner(System.in);

        do {
            System.out.print("Enter a number to search ");
            int value = SCANNER.nextInt();
            //sort array
            selectionSortViaMin(nums);
            int index = binarySearch(nums, value, 0, nums.length - 1);
            if(index !=-1){
                int indexExist=findIndex(numsClone,value);
                System.out.println("Found at "+indexExist);
            }else System.out.println("\033[31m Not found \033[0m");
        } while (true);
    }

    int binarySearch(int[] nums, int target, int head, int tail) {
        int middle = (head + tail) / 2;
        if (target == nums[head]) return head;
        else if (target == nums[tail]) return tail;
        else if (target == nums[middle]) return middle;
        else {
            if (target < nums[head] || target > nums[tail]) return -1;
            else {
                if (target < nums[middle]) {
                    return binarySearch(nums, target, head+1, middle-1);
                } else {
                    return binarySearch(nums, target, middle+1, tail-1);
                }
            }
        }


    }

    int findIndex(int[] numsClone,int target){
        for (int i = 0; i < numsClone.length; i++) {
            if(target==numsClone[i])return i;
        }
        return -1;
    }

    void selectionSortViaMin(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            if (i == minIndex) continue;
            int temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;
        }
    }
}