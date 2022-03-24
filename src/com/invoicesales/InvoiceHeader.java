package com.invoicesales;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
int numberinvoice;
    String nameofcustomer;
    Date dateinvoice;
    ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int numberinvoice, String nameofcustomer, Date dateinvoice) {
        this.numberinvoice = numberinvoice;
        this.nameofcustomer = nameofcustomer;
        this.dateinvoice = dateinvoice;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    public int getNumberinvoice() {
        return numberinvoice;
    }

    public void setNumberinvoice(int numberinvoice) {
        this.numberinvoice = numberinvoice;
    }

    public String getNameofcustomer() {
        return nameofcustomer;
    }

    public void setNameofcustomer(String nameofcustomer) {
        this.nameofcustomer = nameofcustomer;
    }

    public Date getDateinvoice() {
        return dateinvoice;
    }

    public void setDateinvoice(Date dateinvoice) {
        this.dateinvoice = dateinvoice;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "numberinvoice=" + numberinvoice + ", nameofcustomer=" + nameofcustomer + ", dateinvoice=" + dateinvoice + '}';
    }
    
        
}
