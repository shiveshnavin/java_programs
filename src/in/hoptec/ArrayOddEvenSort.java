package in.hoptec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOddEvenSort {

    public static void main(String[] args) {
        inplaceSort();
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

    /**
     * Sort the even numbers (in ascending) and odd numbers (in descending)
     * such that in the sorted list the even and odd places are maintained
     * meaning if there is even number at index 1,3,4,6.. then in the sorted array
     * as well the positions 1,3,4,6.. will contain only even numbers
     */
    public static void inplaceSort(){
        int arr [] = new int[]{111,6,7,2,4,17,8,55,88,3,5,1,13,99,10};
        int arro [] = Arrays.copyOf(arr,arr.length);

//        int arr [] = new int[]{2,42,1,6,7};
        int pos [] = new int[arr.length];
        int oddCOunt = 0;
        int evenCOunt = 0;
        int lastOdd = -1;
        int lastEven = -1;
        for(int i=arr.length-1;i>=0;i--){
            int num = arr[i];
            if(num%2 == 0){
                evenCOunt++;
                pos[i] = lastEven;
                lastEven = i;
            }
            else {
                oddCOunt++;
                pos[i] = lastOdd;
                lastOdd = i;
            }
        }
      //  System.out.println(Arrays.toString(pos));
       // System.out.println("odd "+oddCOunt+" even "+evenCOunt);

        int i=lastEven,j=lastOdd;
        while (i>-1 || j>-1){
            if(i>-1){

                while (evenCOunt-->0)
                {
                    int cE = i;
                    while (pos[cE]>-1){

                        boolean swap = swapIfRightIsLess(cE,pos[cE],arr);
                      //  System.out.println("compare "+arr[cE]+" and "+arr[pos[cE]]+" "+(swap?"swapped":""));
                        cE = pos[cE];
                    }

                }
                i=pos[i];
            }

            if(j>-1){

                while (oddCOunt-->0)
                {
                    int cE = j;
                    while (pos[cE]>-1){

                        boolean swap = swapIfRightIsLess(pos[cE],cE,arr);
                      // System.out.println("compare "+arr[cE]+" and "+arr[pos[cE]]+" "+(swap?"swapped":""));

                        cE = pos[cE];
                    }

                }
                j=pos[j];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arro));
    }

    static boolean swapIfRightIsLess(int l, int r, int[] arr){
        if(arr[l]>arr[r]){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            return true;
        }
        return false;
    }


}
