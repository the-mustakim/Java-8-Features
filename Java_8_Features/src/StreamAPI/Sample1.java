package StreamAPI;

import java.util.Arrays;

public class Sample1 {

    public static void main(String[] args) {

        // This is an imperative approach of coding
        int [] array = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                sum += array[i];
            }
        }
        System.out.println("The sum of array 1 even is: " + sum);

        // Java Stream
        int[] array2 = {1,2,3,4,5};
        int sum2 = Arrays.stream(array).filter(n->n%2==0? true:false).sum(); ;

        System.out.println("The sum of array 2 even numbers using stream is: " + sum);


    }
}
