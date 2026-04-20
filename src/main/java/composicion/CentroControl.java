package composicion;

import abstraccion.Vehiculo;
import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Vehiculo> vehiculos;

    public CentroControl(){
        vehiculos = new ArrayList<Vehiculo>();
        String separador = "=".repeat(52);
        System.out.println(separador + "\nCentro de Control de vehiculos creado correctamente\n" + separador);
    }

    public void registrarUnidad(Vehiculo v){
        if (vehiculos.contains(v)) {
            System.out.println("Error: El vehículo con ID " + v.getId() + " ya está registrado.");
        } else {
            vehiculos.add(v);
            System.out.println("[Vehiculo ID:"+ v.getId() +" registrado correctamente]");
        }
    }

    public void monitorearFlota(){
        System.out.println("-> Iniciando monitoreo de flota...");

        vehiculos.forEach((v) -> {
            v.patronMovimiento();
        });
    }
}
