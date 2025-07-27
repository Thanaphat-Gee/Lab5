public abstract class Animal{
    private final String name;
    public Animal(String name){
        this.name = name ;
    }
    public String getname(){
        return name;
    }
    public abstract String makeSound();
}