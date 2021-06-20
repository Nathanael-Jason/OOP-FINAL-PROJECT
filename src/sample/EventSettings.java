package sample;

import java.time.LocalDate;

public class EventSettings {

    private String event;
    private LocalDate date;
    private String hours;
    private String mins;


    //encapsulate the fields above.
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public EventSettings(LocalDate date, String hours, String mins, String event){

        this.setDate(date);
        this.setEvent(event);
        this.setHours(hours);
        this.setMins(mins);
    }

    //listview display
    @Override
    public String toString(){
        return "REMINDER!! On: " + this.getDate() + " " + this.getHours() + ":" + this.getMins() + "  You should " + this.getEvent() + "!!  Don't Forget :)";
    }

}
