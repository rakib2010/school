
package schoolmanegement;


public class ExtraCost {
    int utilities;
    int provident_fund;
    int TotalCost;

    public ExtraCost(int utilities, int provident_fund) {
        this.utilities = utilities;
        this.provident_fund = provident_fund;
    }

    public int getUtilities() {
        return utilities;
    }

    public void setUtilities(int utilities) {
        this.utilities = utilities;
    }

    public int getProvident_fund() {
        return provident_fund;
    }

    public void setProvident_fund(int provident_fund) {
        this.provident_fund = provident_fund;
    }

    public int getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(int TotalCost) {
        this.TotalCost = TotalCost;
        TotalCost+=provident_fund;
        TotalCost+=utilities;
        School.totalSpent +=TotalCost;
        
    }
    
    
    
    
    
    
    
}
