package com.techarha.sample.business;

import com.techarha.sample.business.impl.BRTaxProcessor;

/**
 * @author ankit.
 */
public class TaxProcessorFactory {
    private TaxProcessorFactory(){

    }

    public TaxProcessor getTaxProcessor(){
        return new BRTaxProcessor();
    }
}
