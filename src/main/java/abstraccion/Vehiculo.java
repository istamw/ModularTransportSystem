package abstraccion;

public abstract class Vehiculo {
    private int id;

    public Vehiculo(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public abstract void patronMovimiento();
}
