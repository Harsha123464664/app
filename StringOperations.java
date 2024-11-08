import java.io.*;
import java.util.*;
class StringOperations {
    public static void main(String[] args){
        boolean flag;
        String str1="hello";
        String str2="world";
        System.out.println("the concatenated string is:"+str1.concat(str2));
        flag=str1.equals(str2);
        System.out.println("str1 is equql to str2:"+flag);
        System.out.println("the length of the str1 is:"+str1.length());
        System.out.println("the length of the str2 is:"+str2.length());
    }
}