package package1;

import java.util.Scanner;

public class ReplaceThis {

    public String rep(String s){
        String s1=s;
        s1=s1.replaceAll("d","f");
        s1=s1.replaceAll("l","t");
        return s1;
    }

    public static void main(String args[]){

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string!!");
        String s=in.nextLine();
        s=s.replaceAll("d","f");
        s=s.replaceAll("l","t");
        System.out.println(s);

    }

}
