package org.ruben.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcularTest {

    @Test 
    public void test_round() {
    	Calcular calcular = new Calcular();	
    	assertEquals(2,  calcular.redondeo(2.3));
    }

}
