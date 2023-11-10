package Exam2022.Q3;

public class HDModule {
    private String moduleID;
    private int cHours; // contact hours
    private int sHours; // self-study hours
    private int aHours; // asssessment hours
    public HDModule(String id, int cHours, int sHours, int aHours) {
    this.moduleID = id;
    this.cHours = cHours;
    this.sHours = sHours;
    this.aHours = aHours;
    }
    public String getModuleID() { return moduleID; }
    public int getContactHours() { return cHours; }
    public int getSelfStudyHours() { return sHours; }
    public int getAssessmentHours() { return aHours; }    
}
