import java.util.*;
public class Lecture_27{
    
        static void sort(int arr[],int n){
              for(int i=0;i<n-1;i++){
                    int min=i;
                    for(int j=i+1;j<n;j++){
                        if(arr[j]<arr[min]){
                            min=j;
                        }
                    }
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
              }
              for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
           }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("******Before Sorting******");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("******After sorting******");
        sort(arr,n);
    }
}