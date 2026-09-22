// MethodOverriding and RuntimePolymorphism
class vehicle {
    void run(){
       System.out.println("Vehicle is running");
    }
}
class car extends vehicle{
    void run(){
        System.out.println("car is running smoothly at speed 80km/h");
    }
}
public class PolymorphismDemo{
    public static void main(String[] args){
        vehicle p = new car();
        p.run();
    }
}