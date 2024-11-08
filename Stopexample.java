import java.io.*;
import java.util.*;
class Newmethod extends Thread{
    public void run(){
        for(int j=1;j<=6;j++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                System.out.println("first Thread is interrupted");
            }
            System.out.println("first Thread is:"+j);
        }
        System.out.println("existing from the first Thread");
    }
    public class Stopexample{
        public static void main(String[] args){
            Newmethod th1=new Newmethod();
            th1.start();
            for(int j=1;j<=6;j++){
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex){
                    System.out.println("Main Thread is Interrupted");
                }
                System.out.println("Main Thread is:"+j);
                if(j==3){
                    th1.stop();
                }
            }
            System.out.println("Exiting from MainThread");
        }
    }
}