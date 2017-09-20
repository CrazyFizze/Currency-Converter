/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Radek
 */
public class CurrencyTestTest {
    
    public CurrencyTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiply method, of class CurrencyTest.
     */
    
    //We'll going to test currency conversion from pln to dollar
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "3.58";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.28;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.28);
       
    }
    //We'll going to test currency conversion from dollar to pln
    @Test
    public void testMultiply2() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.28";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 3.58;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 3.58);
      
    }
    //We'll going to test currency conversion from pln to eur
    @Test
    public void testMultiply3() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "4.28";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.23;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.23);
      
    }
      //We'll going to test currency conversion from eur to pln
    @Test
    public void testMultiply4() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.23";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 4.28;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 4.28);
      
    }
     //We'll going to test currency conversion from pln to gbp
    @Test
    public void testMultiply5() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "4.86";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.21;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.21);
      
    }
    //We'll going to test currency conversion from gbp to pln
    @Test
    public void testMultiply6() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.21";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 4.86;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 4.86);
      
    }
    //We'll going to test currency conversion from dollar to euro
    @Test
    public void testMultiply7() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "1.19";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.84;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.84);
      
    }
    //We'll going to test currency conversion from euro to dollar
    @Test
    public void testMultiply8() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.84";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 1.19;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 1.19);
      
    }
    //We'll going to test currency conversion from dollar to gbp
    @Test
    public void testMultiply9() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "1.36";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.74;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.74);
      
    }
      //We'll going to test currency conversion from gbp to dollar
    @Test
    public void testMultiply10() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.74";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 1.36;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 1.36);
      
    }
    //We'll going to test currency conversion from gbp to euro
    @Test
    public void testMultiply11() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "0.88";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 1.14;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 1.14);
      
    }
    //We'll going to test currency conversion from gbp to euro
    @Test
    public void testMultiply12() {
        System.out.println("multiply");
        String Principle_currency = "1";
        String Other_currency = "1.14";
        CurrencyTest instance = new CurrencyTest();
        double expResult = 0.88;
        double result = instance.multiply(Principle_currency, Other_currency);
        assertEquals(expResult, result, 0.88);
      
    }
    
}
