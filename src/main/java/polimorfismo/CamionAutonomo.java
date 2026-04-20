package polimorfismo;

import abstraccion.Vehiculo;

public class CamionAutonomo extends Vehiculo {
    public CamionAutonomo(int id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Patrón Camión: Desplazamiento terrestre siguiendo carriles y señales.");
    }
}
