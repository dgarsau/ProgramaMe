package org.example;

public class LaPulga {

    static java.util.Scanner in;

    public static void casoDePrueba() {


        String entrada = in.nextLine();
        int[] vector = vectorSplit(entrada);
        comprobarVector(vector);
        calcularPotencia(vector);

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);
        String entrada = in.nextLine();
        int numCasos = Integer.parseInt(entrada);

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

    public static int[] vectorSplit(String entrada){

        String[] vectorString = entrada.split(" ");
        int[] vector = new int[vectorString.length];

        for (int i = 0; i < vectorString.length; i++){
            vector[i] = Integer.parseInt(vectorString[i]);
        }
        return vector;

    }

    public static void comprobarVector(int[] vector){
        if(vector[0]<1 || vector[0]>100){
            System.exit(0);
        }
        if(vector[1]<1 || vector[1]>100){
            System.exit(0);
        }
        if(vector[2]<1 || vector[2]>100000){
            System.exit(0);
        }

    }


    public static void calcularPotencia(int[] vector){

        int barra = vector[0];
        int potencia = vector[1];
        int pulsaciones = vector[2];
        int limite = barra*potencia;
        int total = 0;

        for(int i = 0; i<pulsaciones ; i++){
            total+=potencia;
            if (total>limite){
                total=0;
            }
        }
        System.out.println(total);

        int resultado = pulsaciones*potencia-();

    }
}

