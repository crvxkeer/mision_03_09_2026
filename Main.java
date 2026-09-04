import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("Ingrese nombre: ");
            String nombre = input.nextLine();

            System.out.print("Ingrese carrera: ");
            String carrera = input.nextLine();

            System.out.print("Ingrese edad: ");
            int edad = input.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);
        estudiante.mostrarInformacion();

        }
    }