package day2;

public class Driver {
    public static void main(String[] args) {
        //create student classes using Type Name = new Constructor(methods)
        Student Bob = new Student("Bob", 15, "58295829", 4.0, "Computer Science", 2027, true);
        Student Alice = new Student("Alice", 15, "48395739", 4.0, "Computer Science", 2027, true);

        //get and print info from Bob, using the method getInfo()
        String info1 = Bob.getInfo();
        System.out.println(info1);

        //cannot access instance variables from outside the class, only methods
        // System.out.println(Alice.age);
    }
}