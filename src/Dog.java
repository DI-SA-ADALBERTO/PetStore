public class Dog extends Animal{
    public Dog (String especie, String name, String haircolor){
        super(especie,name,haircolor);
    }

    public String ladrido (){
        return"Guau, Guau, Guau";
    }

    public String toString() {
        System.out.println("Especie: "+getName());
        System.out.println("Name: "+getEspecie());
        System.out.println("Haircolor:"+getHairColor());
        return "";
    }

}