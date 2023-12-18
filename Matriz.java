import java.util.Random;

public class Matriz {
    public static void main(String[] args) {

        Random random = new Random();
        int [][] matriz = new int [100][100];   //generador de matriz
        
//codigoPrimario = variable 01
//secuenciaSerail = variable 02

        for(int codigoPrimario = 0; codigoPrimario < matriz.length; codigoPrimario++) {        //columnas 
            for(int secuenciaSerail = 0; secuenciaSerail < matriz.length; secuenciaSerail++) {        //filas
                matriz[codigoPrimario][secuenciaSerail] = random.nextInt(5000);
            }
        }
//Impresion
        String respuesta = "";
            for(int codigoPrimario = 0; codigoPrimario < matriz.length; codigoPrimario++) {
                for(int secuenciaSerail = 0; secuenciaSerail < matriz.length; secuenciaSerail++) {
                    respuesta = respuesta + "," + matriz[codigoPrimario][secuenciaSerail];
                }
                 respuesta = respuesta + "\n";
            }
            System.out.println(respuesta);
    }
}
