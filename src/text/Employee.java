package text;


public class Employee {

    int fun(int i) {
        return 0;
    }

    void Employee() {

    }

    private String name = "jerry";
    private double salary = 1.1;
    private String age = "";

//    {
//        name = "zzzz";
//        salary = 999;
//    }
//
//    {
//        name = "tom";
//        salary = 2.2;
//        System.out.println("non-static");
//    }
//
//    static {
//        System.out.println("static1");
//
//    }
//
//    static {
//        System.out.println("static2");
//
//    }
//
//    public Employee() {
//        name = "ben";
//        salary = 3.3;
//    }




    public void setSalary(double salary) {
        if (salary < 0)
            this.salary = 0;
        else
            this.salary = salary;
    }

    public Employee() {
    }

    //
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        age = "2";
        this.age = "3";
    }

    @Override
    public String toString() {
        return "[" + name + "," + salary + "]";
    }

    public static void main(String[] args) {
        Employee tom = new Employee("tom",1000);
        System.out.println(tom);
        tom.Employee();
        tom.fun(10);
//        Employee jerry =
//                new Employee("jerry",1000);
    }

//    public static void main(String[] args) {
//        Employee employee = new Employee();
//        System.out.println(employee.name);
//        System.out.println(employee.salary);
//    }
}