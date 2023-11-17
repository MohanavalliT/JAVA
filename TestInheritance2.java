class Animal{
    void eat()
    {
        System.out.println("eating");
    }
}
class Dog extends Animl{
    void bark()
    {
        System.out.println("barking");
    }
}
class BabyDog extends Dog{
    void weep()
    {
         System.out.println("weeping");
    }
}
class Inheritance2{
public staticvoid main(Stringargs[]){
     BabyDog d=new BabyDog();
    d.weep();
    d.bark();
    d.eat();
     }
 }
        
    
