public class Start {
    public static void main (String[ ] args)
	{
		FullTimeEmployee F1 = new FullTimeEmployee(123, "Peter", 20000);
		F1.showFullTimeEmployeeInfo();
		F1.yearlySalary();
		
		PartTimeEmployee P1 = new PartTimeEmployee();
		P1.setEmployeeId(456);
		P1.setEmployeeName("John");
		P1.setPaymentPerHour(50);
		P1.showPartTimeEmployeeInfo();
		P1.dailyIncome(8);
	}
}

