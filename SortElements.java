
import java.util.ArrayList;
import java.util.Scanner;

public class SortElements {
    public void descSort(ArrayList<Integer>even,ArrayList<Integer>odd) {
        for (int i = 0; i < even.size() - 1; i++) {
            for (int j = i + 1; j < even.size(); j++) {
                if (even.get(i) > even.get(j)) {
                    int temp = even.get(i);
                    even.set(i, even.get(j));
                    even.set(j, temp);
                }
            }
        }
        for (int i = 0; i < odd.size() - 1; i++) {
            for (int j = i + 1; j < odd.size(); j++) {
                if (odd.get(i) < odd.get(j)) {
                    int temp = odd.get(i);
                    odd.set(i, odd.get(j));
                    odd.set(j, temp);
                }
            }
        }
        System.out.println("After sort");
        int i = 0, j = 0, count = 0;
        int[] newArr = new int[even.size() + odd.size()];
        for (i = 0, j = 0; i < even.size() && j < odd.size(); i++, j++) {
            System.out.print(" " + even.get(i) + " " + odd.get(j) + " ");
        }
        System.out.println(even.get(even.size() - 1));
//        int m=even.size();
//        int n=odd.size();
//        int k=0;
//        while (i<m && j<n) {
//            if(even.get(i)<odd.get(j)){
//                newArr[k++]=even.get(i);
//                i++;
//            }
//            else{
//                newArr[k++]=odd.get(j);
//                j++;
//            }
//        }
//        while (i<m) {
//            newArr[k++]=even.get(i);
//            i++;
//        }
//        while(j<n){
//            newArr[k++]=odd.get(j);
//            j++;
//        }
//        for (int l = 0; l < k; l++) {
//            System.out.print(newArr[l]+" ");
//        }
//    }
//
    }
    public  void sort(int arr[]){

        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        for (Integer i:
             even) {
            System.out.print(i.toString()+" ");
        }
        for (Integer i:
             odd) {
            System.out.print(i.toString()+" ");
        }
        new SortElements().descSort(even,odd);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=input.nextInt();
        int arr[]=new int[no];
        for (int i = 0; i < no; i++) {
            arr[i]=input.nextInt();
        }
        new SortElements().sort(arr);
    }
}
