public class Employee {

        // Attributes
        private String name;
        private String jobTitle;
        private double salary;

        // Constructor
        public Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        // Method to calculate bonus
        public double calculateBonus(double bonusPercentage) {
            return salary * (bonusPercentage / 100);
        }

        // Method to update salary
        public void updateSalary(double percentageIncrease) {
            salary += salary * (percentageIncrease / 100);
        }

        public static void main(String[] args) {
            // Creating an instance of Employee class
            Employee employee = new Employee("Alice", "Software Engineer", 60000.0);

            // Printing initial details
            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Job Title: " + employee.getJobTitle());
            System.out.println("Salary: $" + employee.getSalary());

            // Calculating and printing bonus
            double bonusPercentage = 10.0;
            double bonus = employee.calculateBonus(bonusPercentage);
            System.out.println("Bonus (10%): $" + bonus);

            // Updating and printing new salary
            double percentageIncrease = 5.0;
            employee.updateSalary(percentageIncrease);
            System.out.println("Updated Salary (5% increase): $" + employee.getSalary());
        }

}
