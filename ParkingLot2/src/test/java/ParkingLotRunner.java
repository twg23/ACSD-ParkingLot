import org.example.LongTermParkingLot;
import org.example.PremiumLot;
import org.example.Ticket;
import org.example.TicketImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.mockito.Mock;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.Assert;

import static org.mockito.Mockito.when;
//@Suite
//@SelectClasspathResource("/features")


public class ParkingLotRunner {

    private TicketImpl ticket ;
    private LongTermParkingLot longTermParkingLot;
    private PremiumLot premiumLot;

    @BeforeEach
    void setUp(){
        longTermParkingLot = new LongTermParkingLot();
        ticket = new TicketImpl();
        premiumLot =new PremiumLot();
    }

    @Test
    public void shouldCalculateFeeForTheHour(){
        ticket.setEntryTime("2023-10-30 14:00");
        ticket.setExitTime("2023-10-30 15:00");
        int fee =  longTermParkingLot.calculateFee(ticket);
        Assert.assertEquals( 2, fee);
    }

    @Test
    public void  shouldRoundUpMinutesToTheNearestHour(){
        ticket.setEntryTime("2023-10-30 14:00");
        ticket.setExitTime("2023-10-30 16:00");
         int fee = longTermParkingLot.calculateFee(ticket);
         Assert.assertEquals(4, fee);
    }
    @Test
    public void shouldTotalFeeNotExceedDailyMax(){
        ticket.setEntryTime("2023-10-30 09:00");
        ticket.setExitTime("2023-10-30 21:30");
        int fee = longTermParkingLot.calculateFee(ticket);
        Assert.assertEquals(15, fee);

    }

    @Test
    public void shouldAllowFirstHourFree(){
        ticket.setEntryTime("2023-10-30 09:00");
        ticket.setExitTime("2023-10-30 10:30");
        int fee = longTermParkingLot.calculateFee(ticket);
        Assert.assertEquals(2, fee);

    }
    @Test
    public void shouldCalculateFeeForTheHourOnPL(){
        ticket.setEntryTime("2023-10-30 14:00");
        ticket.setExitTime("2023-10-30 15:00");
        int fee =  longTermParkingLot.calculateFee(ticket);
        Assert.assertEquals( 4, fee);
    }




}
