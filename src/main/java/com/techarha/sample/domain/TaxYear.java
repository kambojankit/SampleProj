package com.techarha.sample.domain;

import java.util.Date;

/**
 * @author ankit.
 */
public class TaxYear {
    private Date startDate;
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    //TODO change the code to accept a date to handle non-cumulative calculations.
    public int getMonthNumber(){

        return 1;
    }
}
