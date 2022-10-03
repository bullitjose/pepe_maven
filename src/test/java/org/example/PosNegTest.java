package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosNegTest {
PosNeg pn=null;
    @BeforeEach
    void setUp() {
        pn=new PosNeg();


    }

    @Test
    void posNegOneNegativeOneFalse(){
    assertEquals(true,pn.posNeg(1,-1,false));

    }

    @Test
    void posNegNegativeOneOneFalse(){
        assertEquals(true,pn.posNeg(-1,1,false));

    }

    @Test
    void posNegNegativeFourNegativeFiveTrue(){
        assertEquals(true,pn.posNeg(-4,-5,true));

    }
}