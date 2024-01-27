public class missingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5}; 
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
