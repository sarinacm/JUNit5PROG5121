/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit5prog5121poe;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author ctill
 */
public class MessagesTest {
    
     
    Messages testMessages = new Messages();
    
    public MessagesTest() 
    {
        
    }

    @Test
    public void testGoodStudent() 
    {
        boolean actual = testMessages.goodStudent("good");
        assertTrue(actual);
    }
    @Test
    public void testBadStudent()
    { 
        boolean actual = testMessages.goodStudent("bad");
        assertFalse(actual);
    }

    @Test
    public void testPrintMessage() 
    {
        String expected = "Well done you passed!";
        String actual = testMessages.printMessage("good");
        assertEquals(expected,actual);
    }

    @Test
    public void testCeckValue() 
    {
        
    }
    
    
}
