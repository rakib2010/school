
package schoolmanegement;

public class Student {
    int id;
    String name;
    int paidFees;
    int totalPaid;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(int paidFees) {
        this.paidFees = paidFees;
        totalPaid+= paidFees;
        School.totalEarned += paidFees;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(int totalPaid) {
        this.totalPaid = totalPaid;
    }
    
    
    
}
