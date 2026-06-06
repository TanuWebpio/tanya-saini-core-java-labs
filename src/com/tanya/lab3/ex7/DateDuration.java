package com.tanya.lab3.ex7;

import java.time.LocalDate;
import java.time.Period;

public class DateDuration {
	public static void calculateDuration(LocalDate inputDate) {

        LocalDate currentDate = LocalDate.now();

        Period period;

        if (inputDate.isBefore(currentDate)) {
            period = Period.between(inputDate, currentDate);
        } else {
            period = Period.between(currentDate, inputDate);
        }

        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 5, 15);
        calculateDuration(date);
    }
}
