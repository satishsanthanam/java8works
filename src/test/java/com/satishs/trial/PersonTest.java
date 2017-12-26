package com.satishs.trial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {    
  
  @Test    
  public void testNameConcat() {        
    Person p = new Person("Ian", "Darwin");        
    String f = p.getFullName();        
    assertEquals("Name concatenation", "Ian Darwin", f);    
  }
}