class machine{
    final int maxspeed = 120;
    
    machine(){
        System.out.println("Machine constructor called.");
    }

    void display(){
        System.out.println("Maximum speed limit: " + maxspeed);
    }
}

class advancedmachine extends machine{
    advancedmachine(){
        super();
        System.out.println("AdvancedMachine constructor called.");
    }
    void showdisplay(){
    System.out.println("Accessing parent limit via super: "+ super.maxspeed);
}
}
public class keyword1{
    public static void main(String[] args){
        advancedmachine s1 = new advancedmachine();
        s1.showdisplay();
    }
}