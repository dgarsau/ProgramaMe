package org.example;

public class ClarasyOscuras { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }

    public static void casoDePrueba() {

        String entrada = in.nextLine();
        int[] vector = vectorSplit(entrada);
        comprobarVector(vector);
        int totalLosas = totalLosas(vector);
        dividirLosas(totalLosas);

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

        if (vector.length>2){
            System.exit(0);
        } else {
            for (int i = 0; i < vector.length; i++){

                if (vector[i] > 999 || vector[i] < 1){
                    System.exit(0);
                }

            }
        }
    }

    public static int totalLosas(int[] vector){

        return vector[0]*vector[1];

    }

    public static void dividirLosas(int losas){

        if (losas%2==0){
            System.out.println(losas/2 + " " + losas/2);
        } else {
            System.out.println(losas/2+1 + " " + losas/2);
        }

    }

}
