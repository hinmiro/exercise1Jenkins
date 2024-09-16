package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();

    @Test
    public void addMeTest(){
        assertEquals(10, app.addME(5, 5), 0.1);
    }

    @Test
    public void subMeTest() {
        assertEquals(10, app.subMe(12, 2), 0.1);
    }

}