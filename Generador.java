import java.util.Arrays;
import java.util.Scanner;
    //Generador con panel para usuario


public class Generador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int z [][]; z = new int [5][3];

        for(int i = 0; i < z.length; i++) {
            for(int j = 0; j < z[i].length; j++) {
                z[i][j] = j + i;
            }
            System.out.println(Arrays.toString(z[i]));
        }
        

    }
}
