import java.io.*;
public class Exception_Ex{
    public static void main(String[] args) throws Exception{
        try{
            int a,b;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the values of a and b");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException ex){
            System.out.println(ex.getMessage()+"is not a number");
            System.exit(0);
        }
    }
}