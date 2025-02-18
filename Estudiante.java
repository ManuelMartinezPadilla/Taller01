package Ejercicios;

class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "No registrado";
        this.edad = 0;
        this.curso = "No registrado";
    }

    // Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No registrado";
    }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llamada a otro constructor
        this.curso = curso;
    }

    public String toString() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}