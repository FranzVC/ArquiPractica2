public class Leon implements Animal
{
    String estado;
    @Override
    public String comer(){
        return "comio carne";
    }
    
    @Override
    public String mostrarEstado(){
        return " "+ this.estado + " ";
    }
    
    @Override
    public void setEstado(String estado){
        this.estado = estado;
    }
    public Leon()
    {
        // initialise instance variables
        estado = "No vacunado";
    }

    
}
