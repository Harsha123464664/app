import java.util.Scanner;
class Fraction{
    public Fraction() throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter two numbers:");
        int numerator=sc.nextInt();
        int denominator=sc.nextInt();
        int result=numerator/denominator;
        System.out.println("the result is:"+result);
    }
    void display(){
        System.out.println("Divide by zero exception example");
    }
    public static void main(String args[]){
        try{
            Fraction f=new Fraction();
            f.display();
        }
        catch(ArithmeticException e){
            System.out.println("can't be divided by zero"+e);
        }
    }
}