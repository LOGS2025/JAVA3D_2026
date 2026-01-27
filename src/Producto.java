public class Producto {

    /*int pan = 0;
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
    */
    String nombre, fabricante;
    double precio;
    public Producto(String nombre, double precio, String fabricante){
        this.nombre=nombre;
        this.precio=precio;
        this.fabricante=fabricante;
    }
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.fabricante = "Genérico";
        this.precio=precio;
    }
    public static void main(String[] args) {
        Producto pan = new Producto("chocolate", 20.10);
        Producto bolillo = new Producto("bolillo", 10.10);
        Producto manzana = new Producto("manzana", 30.10);

        Producto[] productos = {pan, bolillo, manzana};
        for (int i = 0; i < productos.length; i++){
            String nombre = productos[i].nombre;
            String fabricante = productos[i].fabricante;
            double precio = productos[i].precio;

            if (nombre != null && fabricante != null) {
                System.out.println(
                        nombre +
                        " : " +
                        fabricante +
                        " : " +
                        precio);
            }
        }
    }
}


