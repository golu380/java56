class Person{
    private  String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        setAge(age);
    }

   void getDetails(){
    System.out.println("name is:"+name +" age is : "+ age);
  }

    public  void setAge(int age){
        if(age < 0 || age >= 150){
            System.out.println("Enter valid age");
        }else{
            this.age = age;
        }
    }
}

public class EncapsulationDemo {

    public static void main(String [] args){

        System.out.println("hii");

        Person p1 = new Person("Elvina", 20);
        // System.out.println(p1.age);  could not access it becouase of private modifier

        p1.getDetails();

        Person p2 = new Person("kuchv", -3);
        p2.getDetails();

        EncapsulationDemo1 d1 = new EncapsulationDemo1();
        d1.getDetails();
        System.out.println(d1.name);

    }
}