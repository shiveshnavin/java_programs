package in.hoptec;

public class BinarySearch {

    // Start 12:50 AM
    // Stop 1:03 AM

    public static void main(String[] args) {

        int arr [] ={1,2,3,4,5,6,7,8};

        int N=arr.length;
        int l=0;
        int h=N-1;

        int val=8;

        while (l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==val){
                System.out.println("Found at "+mid);
                return;
            }
            else if(arr[mid]>val){
                h=mid-1;
            }
            else if(val > arr[mid]){
                l=mid+1;
            }
        }
        System.out.println("Not found");

    }


}
