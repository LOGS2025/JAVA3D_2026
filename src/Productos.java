import java.util.Arrays;
import java.util.Random;

public class Productos {

    int pan = 0;
    int manzanas = 0;
    int conchas_de_vainilla = 0;

    int[] stock = {pan, manzanas, conchas_de_vainilla};

    public void rellenar_almacen(int productos_total){
        int productos_restantes = productos_total;
        Random rand = new Random();
        int n = rand.nextInt(productos_restantes);
        while ( productos_restantes != 0) {
            for (int i = 0; i < 3; i++) {
                if (productos_restantes == 0){
                    break;
                }
                this.stock[i] += 1;
                productos_restantes -= 1;
            }
        }
    }

    public void mostrar_stock (){
        System.out.println(Arrays.toString(this.stock));
    }

}
