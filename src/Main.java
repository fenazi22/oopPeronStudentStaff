public class Main {
    public static void main(String[] args) {

    Parson p=new Parson("Faisal","Riyadh");
    // superClass
        System.out.println("------   superClass ------------ \n");
    System.out.println(p.getAddress());
        System.out.println(p.getName());
        System.out.println(p.toString());

        //childClass Student
        System.out.println("------- childClass Student  ----------\n");
        Student stud1=new Student("Ahanmed","Maccah","Java",2022,20.0);
        System.out.println(stud1.toString());

        System.out.println("------- childClass Staff  ----------\n");
    Staff st1=new Staff("Ali","ٌRiyadh"," Tuwaiq Academy",500.25);
        System.out.println(st1.toString());

    }
}