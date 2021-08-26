public class CommissionedEmployee extends Employee{

    private int amountOfSales;
    private int percentageOfSales;

    public CommissionedEmployee(int fixedSalary) {
        super(fixedSalary);
    }
    @Override
    public void setTotalSalary(){
        totalSalary = amountOfSales*percentageOfSales;
    }
    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }
    public void setPercentageOfSales(int percentageOfSales) {
        this.percentageOfSales = percentageOfSales;
    }
}
