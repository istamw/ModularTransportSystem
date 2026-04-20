package polimorfismo;

import abstraccion.Vehiculo;
import interfaces.IConectable;

public class DronTransporte extends Vehiculo implements IConectable {
    public DronTransporte(int id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Patrón Dron: Despegue vertical y navegación aérea en 3 dimensiones.");
    }

    @Override
    public void sincronizarGPS(){
        System.out.println("Conectando dron a la red satelital...");
        System.out.println("Mapeando terreno...");
        System.out.println("[GPS sincronizado correctamente]");
    }
}
