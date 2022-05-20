public class SumOfThreeIntegersZero {

    public static void main(String[] args) {
        int[] arr = {3, -1, -7, -4, -5, 9, -4};

        for(int i = 0; i < arr.length; i++) {
            int firstNumber = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                int secondNumber = arr[j];
                for(int k = j+1; k < arr.length; k++) {
                    int thirdNumber = arr[k];

                    int sum = firstNumber + secondNumber + thirdNumber;
                    if(sum == 0) {
                        System.out.println(firstNumber+","+secondNumber+","+thirdNumber);
                    }
                }
                System.out.println();
            }
        }
    }
}