public class Bicicleta {
    private int VelocidadActual;
    private int platoActual;
    private int piñonActual;

    public Bicicleta(int VelocidadActual, int platoActual, int piñonActual){
        this.VelocidadActual = VelocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }

    public void acelerar(){
        VelocidadActual *= 2;

    }

    public void frenar(){
        VelocidadActual /= 2;
    }

    public void cambiarPlato(int plato){
        platoActual = plato;
    }

    public void cambiarPiñon(int piñon){
        piñonActual = piñon;
    }
    
}
