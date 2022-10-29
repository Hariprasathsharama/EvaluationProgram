import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortFrequency {
    public void findFrequency(int[] a){
        int length=a.length;
        int[] freqArr =new int[length];
        for (int i = 0; i < length; i++) {
            freqArr[i]=1;
        }
        for (int i = 0; i < length; i++) {
            int count=1;
            for (int j = i+1; j < length; j++) {
                if(a[i]==a[j]){
                    count++;
                    freqArr[j]=0;
                }
            }
            if(freqArr[i]!=0){
                freqArr[i]=count;
            }
        }
          for (int i = 0; i < freqArr.length; i++) {
            if(freqArr[i]!=0){
                System.out.println(a[i]+"->"+freqArr[i]);
            }
        }
        System.out.println("After sort");
        for (int i = 0; i < freqArr.length; i++) {
            for (int j = 0; j < freqArr.length; j++) {
                if (freqArr[i]>freqArr[j]){
                    int temp=freqArr[i];
                    freqArr[i]=freqArr[j];
                    freqArr[j]=temp;

                    int temp2=a[i];
                    a[i]=a[j];
                    a[j]=temp2;
                }
            }
        }
        for (int i = 0; i < freqArr.length; i++) {
            if(freqArr[i]!=0){
                for (int j = 0; j < freqArr[i]; j++) {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=input.nextInt();
        int arr[]=new int[no];
        for (int i = 0; i < no; i++) {
            arr[i]=input.nextInt();
        }
        new SortFrequency().findFrequency(arr);
    }
}
