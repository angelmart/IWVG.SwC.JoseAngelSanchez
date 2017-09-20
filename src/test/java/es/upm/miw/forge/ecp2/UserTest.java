package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;
    
    @Before
    public void before() {
        user = new User(1, "angel", "angel");
    }

    @Test
    public void testUser() {
        user = new User(2, "soraya", "liz"); 
        assertEquals(2,user.getNumber());
        assertEquals("Soraya",user.getName());
        assertEquals("Liz",user.getFamilyName());
    }

    @Test
    public void testFullName() {
        user = new User(3, "fernando", "grand"); 
        assertEquals("Fernando Grand",user.fullName());
    }

    @Test
    public void testInitials() {
        user = new User(4, "laura", "zeira"); 
        assertEquals("L.",user.initials());
    }
    
    @Test
    public void testFullNameMayusFamily() {
        user = new User(3, "fernando", "grand"); 
        assertEquals("Fernando GRAND",user.fullNameMayusFamily());
    }

}
