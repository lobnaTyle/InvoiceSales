package sig.model;
 
import java.util.ArrayList;
import java.util.Date ;

public class InvoiceHeader {
   int id ;
   String customerName ;
   String date ;
   ArrayList<InvoiceLine> lines ;

    public InvoiceHeader(int id, String customerName, String date) {
        this.id = id;
        this.customerName = customerName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getInvoiceTotal() {
        double total = 0 ;
        for(InvoiceLine line : getLines()){
        total += line.getLineTotal();
        }
        return total;
    }

    public ArrayList<InvoiceLine> getLines() {
        if(lines == null){
        lines = new ArrayList<>();
        }
        return lines;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "id=" + id + ", customerName=" + customerName + ", date=" + date + '}';
    }

  
   
   
}

