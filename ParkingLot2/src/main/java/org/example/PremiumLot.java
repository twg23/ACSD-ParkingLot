package org.example;

public class PremiumLot implements ParkingLot {

    @Override
    public int calculateFee(Ticket ticket) {
        int days = ticket.getDays();
        int hours = ticket.getHours();
        int minutes = ticket.getMinutes();

        if (minutes > 0) {
            hours += 1;
        }

        int hoursCharge = Math.min(hours * 4, 27);

        if (days % 7 == 6) {
            hoursCharge = 0;
        }

        days -= days / 7;

        return (days * 27) + hoursCharge;
    }
}
