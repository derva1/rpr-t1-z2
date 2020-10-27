package ba.unsa.etf.rpr;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Unesite neki broj n: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
    for(int i=1;i<n;i++){
        if(i%sumaCifara(i) == 0 ) System.out.println(+i);
    }



    }

    private static int sumaCifara(int i) {
        int broj=0;
        int cifra=0;
        int suma=0;
        broj=i;
        while(broj>0){
            cifra=broj%10;
            suma = suma + cifra;
            broj = broj / 10;
        }

        return suma;
    }
}
