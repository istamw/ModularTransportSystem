package polimorfismo;

import abstraccion.Vehiculo;

public class MotoBolt extends Vehiculo {
    public MotoBolt(int id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Patrón Motocicleta: Desplazamiento ágil en dos ruedas.");
    }
}
