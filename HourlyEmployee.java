public class HourlyEmployee extends Employee{
    int extraHours;
    int extraHourPrice;

    public HourlyEmployee(int fixedSalary, int extraHourPrice) {
        super(fixedSalary);
        this.extraHourPrice = extraHourPrice;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    @Override
    public void setTotalSalary(){
        totalSalary = (extraHourPrice*extraHours)+getFixedSalary();
    }
}
