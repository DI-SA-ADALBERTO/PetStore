public class AppPetStore {
    public static void main(String[] args) {
        Cat mascota1 = new Cat("Gato","Simón","Amarillo");

        mascota1.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascota1.maullido());

        System.out.println("-----------------------------------------------------------");

        Dog mascota2= new Dog("Perro", "Bucky", "Blanco");

        mascota2.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascota2.ladrido());


    }
}
