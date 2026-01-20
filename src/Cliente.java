import java.util.Random;

public class Cliente {

    public int gen_random_num(int range){
        Random rand = new Random();
        return rand.nextInt(range);
    }

    public StringBuffer elegir_producto(){
        StringBuffer producto = new StringBuffer();
        switch (gen_random_num(3)+1){

            case 1: producto.append("pan");
            break;
            case 2: producto.append("manzana");
            break;
            case 3: producto.append("concha");
            break;
        }
        System.out.println("Elijo " + producto);
        return producto;
    }

    public int elegir_cantidad(){
        int cantidad = gen_random_num(20);
        System.out.println("Quiero " + cantidad );
        return cantidad;
    }
}
