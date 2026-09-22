class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("i am eating .." + name);
    }
    public  void sleep(){
        System.out.println("I am sleeping.." + name);
    }
}

class Dog extends Animal{
    String breed;

    Dog(String breed1, String name){
       super(name); //for calling parent constructor mandatory 
        breed = breed1;
         
    }

    public  void bark(){
        super.sleep(); // calling parent's method
        System.out.println("Dog is barking, whose name is: " + super.name); // calling parent's data members
        
    }
}
public class InheritanceP{

    public static void main(String [] args){
        System.out.println("hii");

        Dog d1 = new Dog("Golden retriever", "puppy");
        d1.bark();
        d1.sleep();
        d1.eat();

    }
}