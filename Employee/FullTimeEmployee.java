public class FullTimeEmployee extends Employee{
   
        private double salary;
    
        public FullTimeEmployee() {
        }
    
        public FullTimeEmployee(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    
        public double getSalary() {
            return salary;
        }
    
        public void showFullTimeEmployeeInfo() {
            super.showEmployeeInfo();
            System.out.println("Employee Salary: " + salary);
        }
    
        public void yearlySalary() {
            double yearlySalary = salary * 12;
            System.out.println("Yearly Salary: " + yearlySalary);
        }
    }

