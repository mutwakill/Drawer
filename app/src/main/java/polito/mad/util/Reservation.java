package polito.mad.util;

import android.text.format.Time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class Reservation implements Serializable {
    private Customer customer;
    private Calendar time;
    private List<Dish> dishes;
    private String notes;
    static enum Status{DELIVERED,WAITING,CANCELED};
    private Status status;





    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }




    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public List<Dish> getDish() {
        return dishes;
    }

    public void setDish(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }



}
