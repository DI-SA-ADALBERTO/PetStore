public class Animal {
    private String Especie;
    private String Name;
    private String Haircolor;

    public Animal() {
    }

    public Animal(String especie, String name, String haircolor) {
        this.Especie = especie;
        this.Name = name;
        this.Haircolor = haircolor;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        this.Especie = especie;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getHairColor() {
        return Haircolor;
    }

    public void setHairColor(String haircolor) {
        this.Haircolor = haircolor;
    }
    public String sonido(){
        return null;
    }
}
