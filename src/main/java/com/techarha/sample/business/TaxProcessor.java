package com.techarha.sample.business;

import com.techarha.sample.domain.TaxCountry;
import com.techarha.sample.domain.TaxDeductions;

/**
 * @author ankit.
 */
public interface TaxProcessor {
    public TaxDeductions processTax(Double taxableIncome, TaxCountry taxCountry);

}
