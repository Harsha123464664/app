import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        float total=0,avg;
        System.out.println("please enter 5 prices:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            total=total+arr[i];
        }
        avg=total/5;
        System.out.println("the average of 5 prices is:"+ avg);
        System.out.println("the prices of that are higher than the calculated average are:");
        for(int i=0;i<5;i++){
            if(arr[i]>avg)
            System.out.print(arr[i]+" ");
            else
            continue;
        }
    }
}