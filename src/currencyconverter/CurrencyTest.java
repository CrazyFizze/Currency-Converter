/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

/**
 *
 * @author Radek
 */
public class CurrencyTest {
    public double multiply(String PLN_Principle, String Other_currency){
        double PLN_P = Double.parseDouble(PLN_Principle);
        double Dif_currency = Double.parseDouble(Other_currency);
        return PLN_P/Dif_currency;
    }
}
