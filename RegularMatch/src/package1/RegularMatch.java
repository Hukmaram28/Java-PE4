package package1;

import java.util.Scanner;

public class RegularMatch {

    public boolean reg(String s){
        boolean k=s.matches("(.*)Harry(.*)");
        return k;
    }

    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=in.nextLine();
        System.out.print("Is Harry here ? ");
        System.out.print(s.matches("(.*)Harry(.*)"));
    }
}
