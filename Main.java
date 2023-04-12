import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String carac1 = sc.next();
        String carac2 = sc.next();
        String carac3 = sc.next();
        if(carac1.equalsIgnoreCase("vertebrado")){
            if(carac2.equalsIgnoreCase("ave")){
                if(carac3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if(carac3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if(carac2.equalsIgnoreCase("inseto")){
                if(carac3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if(carac3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}