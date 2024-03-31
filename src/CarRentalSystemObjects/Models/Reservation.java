package CarRentalSystemObjects.Models;

import java.util.Date;

public class Reservation {
    Vehicle vehicle;
    Date fromDate;
    Date toDate;
    User user;
    ReservationStatus reservationStatus;

    public Reservation(Vehicle vehicle, Date fromDate, Date toDate, User user, ReservationStatus reservationStatus) {
        this.vehicle = vehicle;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.user = user;
        this.reservationStatus = reservationStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public User getUser() {
        return user;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
