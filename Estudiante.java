public class Estudiante {

    private String nombre;
    private String carrera;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;

    }

    public void mostrarInformacion() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);

    }
    
}
