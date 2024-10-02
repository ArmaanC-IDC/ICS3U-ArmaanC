package day2;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 18, "58295829", 3.5, "Computer Science", 2025, true);
        Student student2 = new Student("Alice", 15, "48395739", 4.0, "Mechanical Engineering", 2027, false);

        String info1 = student1.getInfo();
        System.out.println(info1);
    }
}