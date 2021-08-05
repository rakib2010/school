
package schoolmanegement;


public class Test {
    public static void main(String[] args) {
        Student student = new Student(10,"Karim");
        
        student.setPaidFees(8000);
        student.setPaidFees(7900);
        student.setPaidFees(7000);
        student.setPaidFees(9000);
        student.setPaidFees(8250);
        student.setPaidFees(17000);
        student.setPaidFees(26000);
        student.setPaidFees(16500);
        
        
        
        
        Teacher teacher = new Teacher(66,"Nasim",20000);
        teacher.setSalary(25000);
        teacher.setSalary(15000);
        teacher.setSalary(17000);
        
        
        ExtraCost ex = new ExtraCost(3600,2500);
        ex.setProvident_fund(2500);
        ex.setUtilities(3000);

        
        
        
        
        
        
        
        System.out.println("Total Student Tution Fees = "+student.getTotalPaid());
        
        System.out.println("Total Deposit of School = "+School.totalEarned);
        
        System.out.println("Teacher's Salary = "+teacher.getTotalSalary());
        
        System.out.println("Extra Cost = "+ex.getTotalCost());
       
        System.out.println("Total Cost of School = "+School.totalSpent);
        
        
        
        int remaining = School.totalEarned - School.totalSpent;
        System.out.println("Remaining Fund = "+remaining);
    }
    
}
