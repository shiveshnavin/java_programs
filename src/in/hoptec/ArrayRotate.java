package in.hoptec;

import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int k = 7;
        int[] karr = new int[k];
        int N = arr.length;
        k=k%N;
        for (int i = N - 1; i >= 0; i--) {
            int npos = i + k;
            if (npos >= N) {
                PrintUtil.print(N,i,N-1-i);
                karr[N - 1 - i] = arr[i];
            } else {
                arr[i+k] = arr[i];
            }
        }

        for (int i = 0; i < k; i++) {
            arr[i] = karr[k-i-1];
        }

        PrintUtil.print(Arrays.toString(arr));

    }
}
