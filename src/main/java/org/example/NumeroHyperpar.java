package org.example;

public class NumeroHyperpar {

    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int numero = in.nextInt();
        if (numero<0) {
            return false;
        } else {
            comprobarNumero(numero);
            return true;
        }
    }

    public static void comprobarNumero(int numero){
        boolean hyperpar = true;

        while(numero>0){
            if(numero%2!=0){
                System.out.println("NO");
                hyperpar=false;
                break;
            }else {
                numero/=10;
            }
        }

        if (hyperpar){
            System.out.println("SI");
        }

    }
}