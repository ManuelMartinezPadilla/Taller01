public class Coche04 {
    String marca;
    String modelo;

    //Constructor con un parámetro
    public Coche04(String marca){
        this.marca = marca;
    }

     //Llamada al constructor anterior usando "this()"
     public Coche04(String marca, String modelo){
        this(marca); //Llama al constructor de un solo parámetro
        this.modelo = modelo;
     }
}
