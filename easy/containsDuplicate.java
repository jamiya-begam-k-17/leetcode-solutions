import java.util.Scanner;
import java.util.HashSet;

public class containsDuplicate {
    public boolean isContainsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        // Sample input: 1 2 3 4 5 OR 1 2 3 4 1 (duplicate)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        containsDuplicate obj = new containsDuplicate();
        boolean result = obj.isContainsDuplicate(nums);

        if(result){
            System.out.println("Duplicate found!");
        } else {
            System.out.println("All elements are unique.");
        }

        sc.close();
    }
}

