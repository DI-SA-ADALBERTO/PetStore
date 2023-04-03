public class Cat extends Animal {
    public Cat (String especie, String name, String haircolor){
        super(name,especie,haircolor);
    }
    public String maullido(){
        return "meow, meow, meow, raol, raol";
    }

    public String toString() {
        System.out.println("Especie: "+getName());
        System.out.println("Name: "+getEspecie());
        System.out.println("Haircolor: "+getHairColor());
        return "";
    }

}
