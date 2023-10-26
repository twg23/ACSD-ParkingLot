package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TicketImpl implements Ticket{
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;


    @Override
    public int getDays() {
        return 0;
    }

    @Override
    public int getHours() {
        return 0;
    }

    @Override
    public int getMinutes() {
        return 0;
    }

    public void setEntryTime(String time)  {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        entryTime = LocalDateTime.parse(time, formatter);
    }

    public void setExitTime(String time)  {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        exitTime = LocalDateTime.parse(time, formatter);
    }



}
