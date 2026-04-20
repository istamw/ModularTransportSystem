import composicion.CentroControl;
import abstraccion.Vehiculo;
import polimorfismo.*;

public class Programa {
    public static void main(String[] args) {
        Vehiculo v1 = new DronTransporte(1);
        Vehiculo v2 = new CamionAutonomo(2);
        Vehiculo v3 = new MotoBolt(3);

        CentroControl c = new CentroControl();

        c.registrarUnidad(v1);
        c.registrarUnidad(v2);
        c.registrarUnidad(v3);

        c.monitorearFlota();
    }
}