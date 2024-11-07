import java.util.Scanner;
public class Array_Ex {

    public static void main(String[] arrgs){
        int i,n;
        int equal_count=0,greater_count=0,less_count=0;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("please enter 10 integer values:");
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter another value:");
        n=sc.nextInt();
        for(i=0;i<10;i++){
            if(arr[i]==n){
                equal_count++;
            }
            else if(arr[i]>n){
                greater_count++;
            }
            else{
                less_count++;
            }
        }
        System.out.println("the count of the numbers that are equal to the numbers passed is:"+equal_count);
       System.out.println("the count of the numbers that are greater than the numbers passed is:"+greater_count);
       System.out.println("the count of the numbers that are less than the numbers passed is:"+less_count);
    }
}