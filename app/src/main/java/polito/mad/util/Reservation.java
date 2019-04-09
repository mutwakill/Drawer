package polito.mad.util;

import android.text.format.Time;

import java.io.Serializable;
import java.util.Calendar;

public class Reservation implements Serializable {
    private Customer customer;
    private Calendar time;
    private String dish;
    private String notes;

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

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }



}
