public class Elefante implements Animal
{
    String estado;
    public Elefante()
    {
        // initialise instance variables
        estado = "No vacunado";
    }

    @Override
    public String mostrarEstado(){
        return " "+ this.estado + " ";
    }
    
    @Override
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String comer(){
        return "comio mani";
    }
}
