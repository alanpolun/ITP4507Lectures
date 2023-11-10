public class ModuleCAdapter extends HDModule implements Module {
    public ModuleCAdapter(String id, int cHours, int sHours, int aHours) {
        super(id, cHours, sHours, aHours);
    }

    public String getModuleCode() {
        return getModuleID();
    }

    public int getCredits() {
        return getTotalHours()/ 10;
    }

    public int getTotalHours() {
        return getContactHours() +
                getSelfStudyHours() +
                getAssessmentHours();
    }
}