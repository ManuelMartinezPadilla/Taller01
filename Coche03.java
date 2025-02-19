public class Coche03 {
    String marca;
    String modelo;

    //Constructor por defecto
    public Coche03(){
     this.marca = "Desconocida";
    }

    //Constructor parametrizado
    public Coche03(String marca){
        this.marca = marca;
    }

    //Constructor sobrecargado con dos parámetros
    public Coche03(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    } 
}
