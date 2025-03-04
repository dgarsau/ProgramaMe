package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EvitandoTropiezos {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()) {
            return false;
        } else {
            int[] vector=entradaVector(in.nextLine());
            comprobarC(vector);
            int[] escalones=entradaVector(in.nextLine());
            //comprobarEscalones();
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static int[] entradaVector(String in){
        String[] vectorString = in.split(" ");
        int[] vector = new int[vectorString.length];
        for (int i=0; i<vector.length; i++){
            vector[i] = Integer.parseInt(vectorString[i]);
        }

        return vector;
    }

    public static void comprobarC(int[] vector){
        if(vector[0]<0 && vector[0]>vector[1]) {
            System.out.println("Tropiezo");
            System.exit(0);
        }else {
            comprobarN(vector);
        }
    }

    public static void comprobarN(int[] vector){
        if(vector[2]<2 || vector[2]>200000) {
            System.out.println("Tropiezo");
            System.exit(0);
        }
    }

    public static void comprobarEscalones(int[] vector, int[] escalones){
        boolean error = false;
        if (escalones.length!=vector[2]){
            System.out.println("Tropiezo");
        } else {
            for (int i = 0; i < escalones.length-1; i++){
                if(escalones[i]>escalones[i+1]){
                    error = true;
                } else {
                    
                }
            }
        }
    }




}
