package com.invoicesales;

public class InvoiceLine {
   String NameIten;
   double PriceItem;
   int CountItem;
   InvoiceHeader header;

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getNameIten() {
        return NameIten;
    }

    public void setNameIten(String NameIten) {
        this.NameIten = NameIten;
    }

    public double getPriceItem() {
        return PriceItem;
    }

    public void setPriceItem(double PriceItem) {
        this.PriceItem = PriceItem;
    }

    public int getCountItem() {
        return CountItem;
    }

    public void setCountItem(int CountItem) {
        this.CountItem = CountItem;
    }

    public InvoiceLine(String NameIten, double PriceItem, int CountItem) {
        this.NameIten = NameIten;
        this.PriceItem = PriceItem;
        this.CountItem = CountItem;
    }
   
    
    
}
