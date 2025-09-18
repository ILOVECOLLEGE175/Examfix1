/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
           if age >= 16
           print("YES!");
           
           else print("you must wait(16-calculateAge)more years to drive");
        // to be completed
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        int pay = (hourlyWage * unpaidHours);
            netpay = (int pay * 0.70);
            calculate pay = (netpay);
        // to be completed
    
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
return.print("John Deere has recieved a wire transfer of (net pay)");
 set netpay = 0;
 set unpaidHours = 0;
        // to be completed
    }
}