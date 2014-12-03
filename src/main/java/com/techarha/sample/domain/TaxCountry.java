package com.techarha.sample.domain;

/**
 * @author ankit.
 */
public class TaxCountry {
    private String countryCode;

    private TaxBand basicBand;
    private TaxBand higherband;
    private TaxBand additionalband;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public TaxBand getBasicBand() {
        return basicBand;
    }

    public void setBasicBand(TaxBand basicBand) {
        this.basicBand = basicBand;
    }

    public TaxBand getHigherband() {
        return higherband;
    }

    public void setHigherband(TaxBand higherband) {
        this.higherband = higherband;
    }

    public TaxBand getAdditionalband() {
        return additionalband;
    }

    public void setAdditionalband(TaxBand additionalband) {
        this.additionalband = additionalband;
    }
}
