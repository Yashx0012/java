class studentinfo {
     String name;
     int rollno;
     double percentage;

     void inputdata(String Studentname, int roll, double perc){
        name = Studentname;
        rollno = roll;
        percentage = perc;
     }

     void displaydata(){
        System.out.println("Roll Number: " + rollno );
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("-------------------------");
     }
}

public class Student{
    public static void main(String[] args){

        studentinfo student1 = new studentinfo();
        studentinfo student2 = new studentinfo();

        student1.inputdata("yash", 12, 96.9);
        student2.inputdata("shruti", 29, 97.0);

        System.out.println("--- Student Records ---");
        student1.displaydata();
        student2.displaydata();
    }
}