package ua.bookstore;

import org.junit.*;

import static org.junit.Assert.*;

public class BookTest {
    private Book testbook = new Book();

    @Test
    public void testIsBookEmpty(){
        Assert.assertNotNull(testbook);
    }

    @Test
    public void testSetTitle(){
        String expected = "Test title";

        testbook.setTitle("Test title");

        Assert.assertEquals(expected, testbook.getTitle());
    }


}
