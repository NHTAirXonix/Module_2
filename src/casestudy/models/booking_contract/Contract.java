package casestudy.models.booking_contract;

import casestudy.models.person.Customer;

public class Contract {
    private final String id;
    private final Booking booking;
    private final String deposit;
    private final String allPrice;
    private final Customer customer;

    public Contract(String id, Booking booking, String deposit, String allPrice, Customer customer) {
        this.id = id;
        this.booking = booking;
        this.deposit = deposit;
        this.allPrice = allPrice;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "\n---------------Contract-"+id+"--------------" +
                "\nidContract='" + id + '\'' +
                ", deposit='" + deposit + '\'' +
                ", allPrice='" + allPrice + '\'' +
                "\n" + booking +
                "\n" + customer;
    }
}
