package com.sadcrow.earthquake.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateSetup {

    private Date dateFrom;

    private int daysDifference;

    private String stringFormatedDate;

    public DateSetup(int days) {

        this.daysDifference = days;
        this.dateSetup();
        this.setupStringFormattedDate();

    }

    private void dateSetup(){
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int day = today.get(Calendar.DAY_OF_MONTH);
        today.set(year, month, day, 0,0,0);
        today.add(Calendar.DAY_OF_MONTH, - this.daysDifference);
        this.dateFrom = today.getTime();
    }

    private void setupStringFormattedDate(){
        LocalDateTime ldt = LocalDateTime.now().plusDays(-this.daysDifference);
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        this.stringFormatedDate = formattedDate.format(ldt);
        System.out.println(this.stringFormatedDate);
    }

    public String getStringFormatedDate() {
        return stringFormatedDate;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateFrom(){
        return this.dateFrom;
    }
}
