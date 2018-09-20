package package1;

import java.util.Scanner;

public class Transpose {

    public String[] tra(String s){
        String a[]=s.split(" ");
        String k="";
        for(int i=0;i<a.length;i++){
            for(int j=(a[i].length()-1);j>=0;j--){
                k=k+a[i].charAt(j);
            }
            a[i]=k;
            k="";
        }
        return a;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s= in.nextLine();
        String a[]=s.split(" ");
        String k="";
        for(int i=0;i<a.length;i++){
            for(int j=(a[i].length()-1);j>=0;j--){
                k=k+a[i].charAt(j);
            }
            a[i]=k;
            k="";
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
