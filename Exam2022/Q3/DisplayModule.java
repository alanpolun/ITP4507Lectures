package Exam2022.Q3;

public class DisplayModule {
    public void display(Module module) {
        System.out.println("Module " + module.getModuleCode() +
                " has " + module.getCredits() + " credits and " +
                module.getTotalHours() +
                " total notational learning hours.");
    }
}
