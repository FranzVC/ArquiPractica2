public class Zoo
{
    public static void main(String[] args){
        Animal leon = new Leon();
        Animal aguila = new Aguila();
        Animal elefante = new Elefante();
        
        System.out.println(leon.comer());
        System.out.println(aguila.comer());
        System.out.println(elefante.comer());
        
        System.out.println(leon.mostrarEstado());
        Veterinario.vacunar(leon);
        System.out.println(leon.mostrarEstado());
        System.out.println(aguila.mostrarEstado());
        System.out.println(elefante.mostrarEstado());
    }
}
