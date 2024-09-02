/*
Create an interface Payable with a method calculatePayment(). Implement this interface in
two classes, HourlyEmployee and SalariedEmployee. The HourlyEmployee class should
have fields for hours worked and hourly rate, while the SalariedEmployee class should
have a fixed salary field. In the main method, create objects of both employee types and
calculate their payments using the calculatePayment() method.
*/
interface Payable{
    void calculatePayment();
    
}
class Hl_Em implements Payable{
    // own class field 
    double horly_income;
    
    // for calculation needed
    double  hourly_rate, hourly_work;
    
    
    Hl_Em(double hourly_rate, double hourly_work)
    {
        this.hourly_rate = hourly_rate;
        this.hourly_work = hourly_work;
    }
    public void calculatePayment(){
        horly_income = hourly_rate * hourly_work;
        System.out.println("Total Salary taka : "+horly_income);
        
    }
}
class SL_Em implements Payable{
    // own class field
    double fixed_salary;
    SL_Em(double fixed_salary){
        this.fixed_salary= fixed_salary;
    }
    public void calculatePayment(){
        System.out.println("Total Salary taka : "+fixed_salary);
    }
}

public class Exam_03{
    public static void main(String []args)
    {
        Hl_Em hourly_income = new Hl_Em(50.50, 14);
        hourly_income .calculatePayment();
        
        SL_Em fixed_income = new SL_Em(50000);
        fixed_income.calculatePayment();
        
    }
}



