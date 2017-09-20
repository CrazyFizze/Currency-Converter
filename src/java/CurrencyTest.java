package currency;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radek
 */
public class CurrencyTest {
    public double multiply(String Principle_currency, String Other_currency){
        double P = Double.parseDouble(Principle_currency);
        double Dif_currency = Double.parseDouble(Other_currency);
        return P/Dif_currency;
    }
}
