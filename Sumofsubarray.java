package sum_of_subarray_sum;
import java.util.Scanner;
public class Sumofsubarray {
    public static int sumOfSubarraySums(int[] arr, int size) {
        int totalSum = 0;
        for (int i = 0; i < size; i++) {
            int subarraySum = 0;
            for (int j = i; j < size; j++) {
                subarraySum += arr[j];
                totalSum += subarraySum;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();

        int array[]=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println(sumOfSubarraySums(array,size));
    }
}