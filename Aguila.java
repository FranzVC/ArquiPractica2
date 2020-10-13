public class Aguila implements Animal
{
    String estado;
    public Aguila()
    {
        // initialise instance variables
        estado = "No vacunado";
    }

    @Override
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String mostrarEstado(){
        return " "+ this.estado + " ";
    }
    
    @Override
    public String comer(){
        return "comio ratones";
    }
}