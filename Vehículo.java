public class Vehículo {
    String tipo;

    public Vehículo(String tipo){
        this.tipo = tipo;
    }

    public class CocheVehículo extends Vehículo {
        String marca;
    
        //Llama al constructor de la clase base usando "super()"
        public CocheVehículo(String tipo, String marca){
            super(tipo);
            this.marca = marca; 
    
        }     
    }
    
}
