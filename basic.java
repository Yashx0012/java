public class basic {
    public static void main(String[] args){

        String name = "yash";
        int age = 21;
        double marks = 85.5;
        boolean iseligible = true; 

        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        double bonusmarks = 5.0;
        double totalmarks =  marks + bonusmarks;
        System.out.println("total marks: " + totalmarks);

        System.out.println("grade evaluation");
        if(totalmarks>=90){
            System.out.println("outstanding");
        } else if(totalmarks>=75){
            System.out.println("excellent");
        }  else if(totalmarks>=60){
            System.out.println("good");
        }  else if(totalmarks>=40){
            System.out.println("average");
        }  else {
            System.out.println("fail");
        }

        int choice = 23;
        System.out.println("Random choice: " + choice);
        switch(choice){
            case 1: 
             System.out.println("student profile");
             break;
            case 2: 
             System.out.println("student grades");
             break;
            case 3: 
             System.out.println("exit");
             break;  
            default:
                System.out.println("invalid choice");
             break;    
        }


    }       
}