package com.techarha.sample.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ankit.
 */
public class TaxDeductions {
    private Double originalTaxableAmount;
    private Double amountAdjustments;
    private Double netTaxableAmount;

    private Map<TaxBand, Double> bandWiseTaxAmount;
    private Double netTaxDeducted;

    public TaxDeductions() {
        setBandWiseTaxAmount(new HashMap<TaxBand, Double>(0));
    }

    public Double getOriginalTaxableAmount() {
        return originalTaxableAmount;
    }

    public void setOriginalTaxableAmount(Double originalTaxableAmount) {
        this.originalTaxableAmount = originalTaxableAmount;
    }

    public Double getAmountAdjustments() {
        return amountAdjustments;
    }

    public void setAmountAdjustments(Double amountAdjustments) {
        this.amountAdjustments = amountAdjustments;
    }

    public Double getNetTaxableAmount() {
        return netTaxableAmount;
    }

    public void setNetTaxableAmount(Double netTaxableAmount) {
        this.netTaxableAmount = netTaxableAmount;
    }

    public Map<TaxBand, Double> getBandWiseTaxAmount() {
        return bandWiseTaxAmount;
    }

    private void setBandWiseTaxAmount(Map<TaxBand, Double> bandWiseTaxAmount) {
        this.bandWiseTaxAmount = bandWiseTaxAmount;
    }

    public Double getNetTaxDeducted() {
        return netTaxDeducted;
    }

    public void setNetTaxDeducted(Double netTaxDeducted) {
        this.netTaxDeducted = netTaxDeducted;
    }
}
