package org.example;

import org.junit.jupiter.api.Assertions;

class DebugSampleTest {
    DebugSample mp=null;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        mp=new DebugSample();
    }
    @org.junit.jupiter.api.Test
    void sayYourName(){
        Assertions.assertEquals("DebugSample", mp.sayYourName());


    }
    @org.junit.jupiter.api.Test
    void addTwoNumbers(){
        Assertions.assertEquals(5,mp.addTwoNumbers(3, 2));

    }
}