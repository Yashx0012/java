class animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}
 class dog extends animal{
    void bark(){
         System.out.println("the dog barks.");
    }
 }
 class babydog extends dog{
    void weep(){
        System.out.println("the babydog weeps.");
    }
 }
 class cat extends babydog{
    void meow(){
        System.out.println("the cat meows.");
    }
 }
 public class Inheritance{
    public static void main(String[] args){
        System.out.println("--- Singlelevel Inheritance ---");
        dog s0 = new dog();
        s0.eat();
        s0.bark();
        
        System.out.println("--- Multilevel Inheritance ---");
        babydog s1 = new babydog();
        s1.eat();
        s1.bark();
        s1.weep();

        System.out.println("\n--- Hierarchical Inheritance ---");
        cat s2 = new cat();
        s2.eat();
        s2.meow();
    }
 }