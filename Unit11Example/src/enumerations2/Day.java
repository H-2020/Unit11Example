package enumerations2;

public enum Day {
    Monday(true),
    Tuesday(true),
    Wednesdag(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    private boolean workDay;
    private Day(boolean workDay) {
        this.workDay=workDay;
    }

    public boolean isWorkDay() {
        return this.workDay;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return name() +" is work day.";
    }
}
