package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite{
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbers= new OddNumbersExterminator();
       ArrayList<Integer>empty = new ArrayList<Integer>();
        ArrayList<Integer> result = oddNumbers.exterminate(empty);
        Assert.assertEquals(result.size(),0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator normalOddNumber = new OddNumbersExterminator();
        ArrayList<Integer>full = new ArrayList<Integer>();
        full.add(4);
        full.add(6);
        full.add(7);
        full.add(9);
        ArrayList<Integer> result1 = normalOddNumber.exterminate(full);
        Assert.assertEquals(result1.get(0),Integer.valueOf(4));
        Assert.assertEquals(result1.get(1),Integer.valueOf(6));
        Assert.assertEquals(result1.size(),2);
    }
}
