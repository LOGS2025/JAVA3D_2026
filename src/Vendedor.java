import java.util.Random;

public class Vendedor {

    public int gen_random_num(int range){
        Random rand = new Random();
        return rand.nextInt(range);
    }

    public int stock_up(){
        Random rand = new Random();
        int productos = rand.nextInt(50);
        System.out.println("Total de productos destinados : " + productos);
        return productos;
    }

    public int check_stock(StringBuffer producto, int[] stock, int cantidad_sol){
        int cantidad_disp = 0;
        switch (producto.toString()) {
            case "pan":
                cantidad_disp = stock[0];
                System.out.println("Hay " + stock[0]);
                break;
            case "manzana":
                cantidad_disp  = stock[1];
                System.out.println("Hay " + stock[1]);
                break;
            case "concha":
                cantidad_disp = stock[2];
                System.out.println("Hay " + stock[2]);
                break;
        }
        if ( cantidad_sol > cantidad_disp) {
            System.out.println("No hay suficiente " + producto);
            return 1;
        }
        System.out.println("Se logró");
        return 0;
    }

}
