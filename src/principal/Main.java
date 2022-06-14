package principal;

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        try {
            switch (menu()) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        }catch (Exception e){
            System.out.println("Debe introducir un entero positivo");
        }
    }
    private static int menu(){
        System.out.println("Bienvenido, a continuación se le mostrará las diferentes opciones que puede elegir:");
        System.out.println("Opción 1: Conocer el nombre, edad y puntuación obtenida por cada jugador de una pista");
        System.out.println("Opción 2: Conocer la puntuación final de la partida en una pista (suma de\n" +
                "puntuaciones de los jugadores de esa pista)");
        System.out.println("Opción 3: Conocer la máxima puntuación de una pista junto con el nombre y la edad\n" +
                "del ganador");
        System.out.println("Opción 4: Obtener las pistas ordenadas por puntos en orden decreciente indicando los\n" +
                "datos del jugador ganador");
        System.out.println("Indique la opción deseada");
        int opc=s.nextInt();
        return opc;
    }
}
