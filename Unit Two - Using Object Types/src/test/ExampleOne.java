package test;

public class ExampleOne {
    public static void main(String[] args) {
        Member john = new Member("John Doe", 101);
        Trainer sarah = new Trainer("Sarah Lee", 5);

        WorkoutPlan strengthTraining = sarah.createWorkoutPlan("Strength Training");
        sarah.assignWorkoutPlan(john, strengthTraining);

        System.out.println(john.getWorkoutPlan().getPlanName());
        System.out.println(john.getWorkoutPlan().getDifficulty());

        john.cancelWorkoutPlan();

        WorkoutPlan cardioEndurance = sarah.createWorkoutPlan("Cardio Endurance");
        sarah.assignWorkoutPlan(john, cardioEndurance);

        System.out.println(john.getWorkoutPlan().getPlanName());
        System.out.println(john.getWorkoutPlan().getDifficulty());

        john.getWorkoutPlan().setDifficulty("Hard");
        System.out.println(john.getWorkoutPlan().getDifficulty());

        WorkoutPlan yogaFlexibility = sarah.createWorkoutPlan("Yoga Flexibility");
        john.changeWorkoutPlan(yogaFlexibility);

        System.out.println(john.getWorkoutPlan().getPlanName());
        System.out.println(john.getWorkoutPlan().getDifficulty());
    }
}
