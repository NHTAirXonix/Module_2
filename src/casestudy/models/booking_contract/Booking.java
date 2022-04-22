package casestudy.models.booking_contract;

import casestudy.models.facility.Facility;
import casestudy.models.person.Customer;

public class Booking {
    private int bookingNumber;
    private String dayStart;
    private String dayEnd;
    private Customer customer;
    private Facility facility;
    private int customerNumber;
    private String serviceName;
    private String serviceType;

    public Booking(int bookingNumber,
                   String dayStart,
                   String dayEnd,
                   Customer customer,
                   Facility facility) {
        this.bookingNumber = bookingNumber;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customer = customer;
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber=" + bookingNumber +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", customer name=" + customer.getName() +
                ", facility name=" + facility.getServiceName() +
                '}';
    }
}
