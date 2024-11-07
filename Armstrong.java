import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        int N,temp,sum,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        N=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("please enter the elements of the array:");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the list of armstrong numbers in the given array are:");
        for(int i=0;i<N;i++){
            sum=0;
            temp=arr[i];
            while(temp !=0){
                r=temp%10;
                sum+=Math.pow(r,3);
                temp /=10;
            }
            if(sum==arr[i])
            System.out.println(arr[i]+" ");
            else
            continue;
        }
    }
}

