import java.util.Enumeration;

public abstract class Statement {


    public abstract String getHeadValue(Customer aCustomer);
    public abstract String getFooterValue(Customer aCustomer);
    public abstract String getRentalValue(Rental each);
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeadValue(aCustomer);

        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += getRentalValue(each);
        }
        //add footer lines
        result += getFooterValue(aCustomer);
        return result;
    }

    public static void main(String[] args) {}

}