package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Ventas {

    static final String[] DIAS = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        double entrada = in.nextDouble();

        if (entrada==-1) {
            return false;
        } else {
            double[] vectorva = new double[6];
            double[] vector = rellenarVector(vectorva, entrada);
            comprobarVentas(vector);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static double[] rellenarVector(double[] vector, double entrada) {
        vector[0]=entrada;
        for (int i = 1; i<vector.length; i++){
            vector[i]=in.nextDouble();
        }
        return vector;
    }

    public static void comprobarVentas(double[] vector){

        double[] vector2 = vector.clone();
        Arrays.sort(vector2);

        int posicionmin = 0;
        int posicionmax = 0;

        String siono;

        double minimo = vector2[0];
        double maximo = vector2[vector.length-1];
        double total = 0;

        for (int i = 0; i<vector.length; i++){
            if(vector[i]==minimo){
                posicionmin=i;
            }
            if(vector[i]==maximo){
                posicionmax=i;
            }
            total+=vector[i];
        }

        double media = total/6;
        if (vector[5]>media){
            siono="SI";
        } else {
            siono="NO";
        }

        if(minimo==maximo){
            System.out.println("EMPATE");
        } else {
            System.out.println(DIAS[posicionmax] + " " + DIAS[posicionmin] + " " + siono);
        }

    }
}



