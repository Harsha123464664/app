class MyException extends Exception{
    int x;
    MyException(int i){
        x=i;
    }
    public String toString(){
        return "MyExceptions"+x+" ";
    }
}
public class UserDefinedExample{
    static void calculate(int i)throws MyException{
        System.out.println("calculate"+i);
        if(i>20){
            throw new MyException(i);
        }
        System.out.println("Terminate");
    }
    public static void main(String[] args){
        try{
            calculate(10);
            calculate(35);
        }
        catch(MyException ex){
            System.out.println("An exception"+ex+"caught");
        }
    }
}