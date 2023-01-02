import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int [] arrayOfNumbers = {3,66,5,2,7,3,7};
        Arrays.sort(arrayOfNumbers);

        twoSums(arrayOfNumbers, 9);





    }
    private static int[] twoSums(int[] numbers, int target) {

        int a_pointer = 0;
        int b_pointer = numbers.length -1;

        while (a_pointer <= b_pointer){
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if(sum > target){
                b_pointer -=1;
            } else if (sum < target) {
                a_pointer += 1;
            }else {
                return  new int[] {a_pointer +1 , b_pointer+1};
            }
        }

        return new int[]{a_pointer +1, b_pointer +1};
    }


}
