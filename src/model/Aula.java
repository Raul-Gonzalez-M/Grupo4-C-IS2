public class Aula {
    
    private int capacidadMaxima;
    private int capacidadActual;
    private String nombre;
    private List<Clase> clases;
    
    public Aula(int capacidadMaxima, String nombre) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        this.nombre = nombre;
        this.clases = new ArrayList<>();
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public int getCapacidadActual() {
        return capacidadActual;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Clase> getClases() {
        return clases;
    }
    
    public void agregarClase(Clase clase) {
        if (capacidadActual < capacidadMaxima) {
            clases.add(clase);
            capacidadActual++;
        } else {
            throw new IllegalStateException("El aula está llena");
        }
    }
    
    public void eliminarClase(Clase clase) {
        if (clases.remove(clase)) {
            capacidadActual--;
        }
    }
}
