package Ejercicios;

public class Libro {
String Titulo;
String Autor;
int numPaginas;


// Constructor por defecto
public Libro(){
    this.Titulo = "Cien años de Soledad";
    this.Autor = "Gabriel García Márquez";
    this.numPaginas = 540;
    
}

// Constructor parametrizado
public Libro (String Titulo, String Autor, int NumPaginas) {
    this.Titulo = Titulo;
    this.Autor = Autor;
    this.numPaginas = NumPaginas;
}

public String goString() {
    return "Libro: " + Titulo + ", Autor: " + Autor + ", Paginas : " + numPaginas;
    }
}
