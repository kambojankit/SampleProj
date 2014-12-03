package com.techarha.sample.business.impl;

import com.techarha.sample.business.TaxProcessor;
import com.techarha.sample.domain.TaxBand;
import com.techarha.sample.domain.TaxCountry;
import com.techarha.sample.domain.TaxDeductions;

/**
 * @author ankit.
 */
public class RestCodeProcessor implements TaxProcessor{

    @Override
    public TaxDeductions processTax(Double taxableIncome, TaxCountry taxCountry) {
        TaxBand basicBand = taxCountry.getBasicBand();
        TaxBand higherBand = taxCountry.getHigherband();
        TaxBand additionalBand = taxCountry.getAdditionalband();

        Double baseTax = 0.0;
        Double higherTax = 0.0;
        Double additionalTax = 0.0;
        if(taxableIncome > basicBand.getLimit()){
            if(taxableIncome > higherBand.getLimit()){
                baseTax = basicBand.getLimit() * basicBand.getRate();
                higherTax = (higherBand.getLimit() - basicBand.getLimit()) * higherBand.getRate();
                additionalTax = (taxableIncome - higherBand.getLimit()) * additionalBand.getRate();
            }else{
                baseTax = basicBand.getLimit() * basicBand.getRate();
                higherTax = (taxableIncome - basicBand.getLimit()) * higherBand.getRate();
            }
        }else {
            baseTax = taxableIncome * taxCountry.getBasicBand().getRate();
        }

        return null;
    }

}
