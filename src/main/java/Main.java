public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(10, 1, 1);
        bicicleta.acelerar();
        bicicleta.frenar();
        bicicleta.cambiarPlato(2);
        bicicleta.cambiarPiñon(2);
    }
}
