package animales;

public class Principal {
        
    public static void main(String[] args) {
        
        Animales animal = new Animales();
        
        animal.nombre = "Perro";
        animal.Tipo = "mamifero";
        
        animal.Comer();
        animal.Correr();
        animal.tipo();
    }
}
