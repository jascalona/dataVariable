// import java.util.random;

public class NumAl{
    public static void main(String [] args) {
        
        
        int i = 0, cantidad = 100, rango = 4000;
        int arreglo[] = new int[cantidad];

        arreglo[i] = (int) (Math.random()*rango); 
        for(i = 1; i<cantidad; i++){
            arreglo[i] = (int) (Math.random()*rango);
            for(int j = 0; j <1; j ++){
                if(arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }

        for(int k = 001; k<cantidad; k ++) {
            System.out.println((k + 001) + " " + arreglo[k]);
        }
    }
}