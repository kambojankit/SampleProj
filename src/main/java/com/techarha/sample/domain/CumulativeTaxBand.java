package com.techarha.sample.domain;

/**
 * @author ankit.
 */
public class CumulativeTaxBand extends TaxBand {
    private TaxYear taxYear;
    private boolean isCumulativeMonthly;

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
        int monthNumber = taxYear.getCurrentMonthNumber();
        // get limit and calculate cumulative limit
        Double cLimit = ((super.getLimit())/12) * monthNumber;
        return cLimit;
    }


}
