package lt.sdacademy.Fundamentals.loop.while_loop.for_each;

public class Example1 {
    public static void main(String[] args) {
        Animal dog =new  Animal("Boss", "Boxer");
        Animal cat =new  Animal("Dolly", "Ciauciau");

        Animal[] animals = {dog, cat};

        for (Animal a: animals) System.out.println(a);

    }
}

class Animal {
    // Kintamieji
    private String name;
    private  String breed;

    // Konstruktorius
    Animal(String name, String breed){
        this. name = name;
        this. breed = breed;
    }
    //Kintamojo getteris
    public  String  getName(){
        return name;
    }
}