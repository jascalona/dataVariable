import java.util.Random;
import java.util.random.*;

public class Matriz {
    public static void main(String[] args) {

        Random random = new Random();
        int [][] matriz = new int [5][5];
        
        for(int i = 0; i < matriz.length; i++) {        //columnas 
            for(int j = 0; j < matriz.length; j++) {        //filas
                matriz[i][j] = random.nextInt(900);
            }
        }
//Impresion
        String respuesta = "";
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    respuesta = respuesta + "," + matriz[i][j];
                }
                 respuesta = respuesta + "\n";
            }
            System.out.println(respuesta);
    }
}
