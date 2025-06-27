package in.shivesh;

import java.util.*;

//https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
public class ArrayZeroSumTriplets {


    public static void main(String[] args) {
        int arr [] = {0, -1, 2, -3, 1};;
        List<List<Integer>> triplets = new ArrayList<>();
        System.out.println(method1Hashing(arr));
    }

    public static List<List<Integer>> method1Hashing(int arr[]){
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i=0;i<arr.length - 1;i++){
            Map<Integer,Integer> cache = new HashMap<>();
            for (int j = i + 1; j < arr.length ; j++) {
                if(cache.get(arr[j])!=null){
                    triplets.add(Arrays.asList(arr[i],arr[j],cache.get(arr[j])));
                }else {
                    int mul = (arr[i] + arr[j] ) * -1;
                    cache.put(mul,arr[j]);
                }
            }
        }
        return triplets;
    }


}
