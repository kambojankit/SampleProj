package com.techarha.sample.business.impl;

import com.techarha.sample.business.TaxProcessor;
import com.techarha.sample.domain.TaxCountry;
import com.techarha.sample.domain.TaxDeductions;

/**
 * @author ankit.
 */
public class RestCodeProcessor implements TaxProcessor{

    @Override
    public TaxDeductions processTax(Double taxableIncome, TaxCountry taxCountry) {

        return null;
    }

}
