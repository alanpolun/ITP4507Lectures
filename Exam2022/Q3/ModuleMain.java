package Exam2022.Q3;

public class ModuleMain {
    public static void main(String[] args) {
        Module moduleO = new ModuleOAdapter(
                new HDModule("ITP4507", 52, 78, 2));
        DisplayModule dm = new DisplayModule();
        dm.display(moduleO);

        Module moduleC = new ModuleCAdapter(
                "ITP4507", 52, 78, 2);
        dm.display(moduleC);
    }
}
