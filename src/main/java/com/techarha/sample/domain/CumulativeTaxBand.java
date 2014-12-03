package com.techarha.sample.domain;

/**
 * @author ankit.
 */
public class CumulativeTaxBand extends TaxBand {
    private TaxYear taxYear;
    private boolean isCumulativeMonthly;
    private boolean isFirstFlag;

    public TaxYear getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(TaxYear taxYear) {
        this.taxYear = taxYear;
    }

    public boolean isCumulativeMonthly() {
        return isCumulativeMonthly;
    }

    public void setCumulativeMonthly(boolean isCumulativeMonthly) {
        this.isCumulativeMonthly = isCumulativeMonthly;
    }

    @Override
    public Double getLimit() {

        // find Current Month based on Today's Date
        if(isFirstFlag){
            //calculate M1 or W1 accordingly
            //i.e set the todays date to special date, to consider the tax on Month 1
        }
        //TODO change this to pass date in getMonthNumber so that we use special code to represent non-cumulative calc.
        int monthNumber = taxYear.getMonthNumber();
        // get limit and calculate cumulative limit
        Double cLimit = ((super.getLimit())/12) * monthNumber;
        return cLimit;
    }


}
