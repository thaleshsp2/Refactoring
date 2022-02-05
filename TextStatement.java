import java.util.Enumeration;

public class TextStatement extends Statement {

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

    public String getHeadValue(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getRentalValue(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" +
            String.valueOf(each.getCharge()) + "\n";
    }

    public String getFooterValue(Customer aCustomer) {
        String result = "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
        return result;
    }
    public static void main(String[] args) {}

}