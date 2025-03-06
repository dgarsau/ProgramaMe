package org.example;

public class MatricesTriangulares {

    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        int num = in.nextInt();
        in.nextLine();
        if (num <= 0 || num>50) {
            return false;
        } else {
            int[][] matrizvacia = new int[num][num];
            int[][] matriz=rellenarMatriz(matrizvacia);
            comprobarMatriz(matriz);

            return true;
        }
    }

    public static int[][] rellenarMatriz(int[][] matriz) {
        String[] arrayfila=null;

        for (int i = 0; i < matriz.length; i++) {

            String fila = in.nextLine();
            arrayfila = fila.split(" ");

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(arrayfila[j]);
            }

        }

        return matriz;

    }

    public static void comprobarMatriz(int[][] matriz){
        boolean superior=true;
        boolean inferior=true;

        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j <matriz[i].length; j++){
                if(i>j && matriz[i][j]!=0){
                    superior=false;
                }
                if(i<j && matriz[i][j]!=0){
                    inferior=false;
                }
            }
        }

        if(superior || inferior){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

}
