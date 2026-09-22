class mathoperation{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class  studentbox{
    String n;
    int id;

    studentbox(){
        n = "unknown";
        id = 0;

    }

    studentbox(String name){
        n = name;
        id = 152;
    }

    studentbox(String name, int i){
         n = name;
        id = i;

    }
    void display() {
        System.out.println("Name: " + n + ", ID: " + id);
}
}
public class overloading{
    public static void main(String[] args){
        mathoperation math = new mathoperation();
        System.out.println("sum(int): " + math.add(4,5));
        System.out.println("sum(double): " + math.add(4.4,5.6));
        System.out.println("sum(int): " + math.add(4,5,6));

        studentbox s1 = new studentbox();
        studentbox s2 = new studentbox("yash");
        studentbox s3 = new studentbox("shruti", 12);

        s1.display();
        s2.display();
        s3.display();
        
    }
}