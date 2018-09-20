package package1;

import java.util.Scanner;

public class AlphabeticalOrder {

    public String[] ord(String s){
        String a[]=s.split(" ");
        String temp="";
        for(int i=0;i<a.length;i++){
            for (int j = i + 1; j < a.length; j++){
                if ((Character.toLowerCase(a[i].charAt(0)))>(Character.toLowerCase(a[j].charAt(0)))){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String s=in.nextLine();
        String a[]=s.split(" ");
        String temp="";
        for(int i=0;i<a.length;i++){
            for (int j = i + 1; j < a.length; j++){
                if ((Character.toLowerCase(a[i].charAt(0)))>(Character.toLowerCase(a[j].charAt(0)))){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
