package Exam2022.Q3;

public class ModuleOAdapter implements Module {
    private HDModule hdModule;

    public ModuleOAdapter(HDModule hdModule) {
        this.hdModule = hdModule;
    }

    public String getModuleCode() {
        return hdModule.getModuleID();
    }

    public int getCredits() {
        return getTotalHours() / 10;
    }

    public int getTotalHours() {
        return hdModule.getContactHours() +
                hdModule.getSelfStudyHours() +
                hdModule.getAssessmentHours();
    }
}