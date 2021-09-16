package in.hoptec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOddEvenSort {

    public static void main(String[] args) {
        sortType2();
    }
    public static void sortType2() {
        int arr [] = new int[]{6,99,2,4,17,8,55,88,3,5,1,13,99};

        Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));
        List<Integer> ints = IntStream.of(arr).boxed().collect(Collectors.toList());
        Collections.sort(ints,Collections.reverseOrder());
        System.out.println(ints);
        Collections.reverse(ints);
        System.out.println(ints);
    }
    public static void sortType1(){
        // [even in descending][odd in ascending]
        int arr [] = new int[]{6,7,2,4,17,8,55,88,3,5,1,13,99};
        int countEven = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                arr[i] = arr[i] * -1;
                countEven++;
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while (countEven-->0){
            arr[countEven] *= -1;
        }
        System.out.println(Arrays.toString(arr));
    }

}
