package Dam_M_03.Cursa_2.Model;

public class DatosCompeti {

    private String nombre;
    private  String vehiculo;
    private int circuito;
    private int minutos;
    private int segundos;
    private int puntuacion;
    private int totalPuntuacion;
    private int oponentes;

    public DatosCompeti() {
    }

    //porque vehiculo no es this.vehiculo=vehiculo;
    public DatosCompeti(String nombre, int circuito, int minutos, int segundos, int puntuacion, int totalPuntuacion, int oponentes, String vehiculo) {
        this.nombre = nombre;
        this.circuito = circuito;
        this.minutos = minutos;
        this.segundos = segundos;
        this.puntuacion = puntuacion;
        this.totalPuntuacion = totalPuntuacion;
        this.oponentes = oponentes;
        this.vehiculo = vehiculo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public String getVehiculo() {
        return vehiculo;
    }

    public  void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public  int getOponentes() {
        return oponentes;
    }

    public  void setOponentes(int oponentes) {
        this.oponentes = oponentes +1;
    }

    public String getNombre() {

        return nombre;
    }

    public  void setNombre(String nomb) {

        this.nombre = nomb;
    }

    public  int getCircuito() {
        return circuito;
    }

    public  void setCircuito(int circuito) {
        this.circuito = circuito;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getTotalPuntuacion() {
        return totalPuntuacion;
    }

    public void setTotalPuntuacion(int totalPuntuacion) {
        this.totalPuntuacion = totalPuntuacion;
    }
}
