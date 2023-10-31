package org.example;

public class LongTermParkingLot implements ParkingLot{

        @Override
        public int calculateFee(Ticket ticket) {
            int dailyRate = 2;
            int dailyMax = 15;

            int hour = ticket.getHours();
            int minutes = ticket.getMinutes();

            if (hour == 0 && minutes <= 30) {
                return 0; // No fee for less than or equal to 30 minutes.
            }

            if (minutes > 30) {
                hour++; // Round up to the nearest hour
            }

            int totalFee = hour * dailyRate;

            if (totalFee > dailyMax) {
                return dailyMax;
            }

            return totalFee;
        }
    }



 //   @Override
//    public int calculateFee(Ticket ticket) {
//        int dailyRate = 2;
//        double totalFee;
//        int dailyMax = 15;
//        double excludeFirstThirtyMinuteFromFee ;
//        double remainingMinutes;
//
//
//        int hour = ticket.getHours();
//        double minutes = ticket.getMinutes();
//
////        if( minutes % 60 != 0) {
////            double remainingMinutes = minutes % 60;
////         if(remainingMinutes >0){
////               hour++;
////              totalFee = hour *dailyRate;
////              if( totalFee > dailyMax){
////                  return dailyMax;
////              }
////           }
////
////       }
//
//
////        if (hour ==1 ){
////           totalFee= dailyRate * hour;
////
////            return totalFee;
////        }
//
//
//        if (minutes > 30) {
//            excludeFirstThirtyMinuteFromFee = (minutes - 30);
//            if (excludeFirstThirtyMinuteFromFee % 60 != 0) {
//                 remainingMinutes = excludeFirstThirtyMinuteFromFee % 60;
//                if (remainingMinutes > 0) {
//                   hour= hour++;
//                    totalFee = hour * dailyRate;
//                    if (totalFee > dailyMax) {
//                    return dailyMax;
//                    }
//                    else {
//                    return (int) totalFee;
//                    }
//                }
//                else {
//           totalFee = (remainingMinutes % 60) *dailyRate;
//            return (int) totalFee;
//        }
//            }
//        }
//        return  totalFee;
//    }
//}



//
////        else{
////            return 0;
////        }
////    return 0;
//    return }









// ToDo:  Use TDD to Implement this function
//  You will need to mock the Ticket interface
//  Business rules for this parking lot are as follows:
//        Basic fee is $2 per hour or fraction thereof
//        This means we always round up; ie, 4 hours 2 minutes is billed as 5 hours.
//        There is no pro-ration
//        Daily max is $15
//        On the first day, the first half hour is free





