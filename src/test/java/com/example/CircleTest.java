package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    Circle circle = new Circle();

    @Test
    public void testCalculateAreaWithPositiveRadius() {
        double radius = 5.0;
        double expectedArea = Math.PI * 5.0 * 5.0;
        double actualArea = circle.calculateArea(radius);
        
        Assert.assertEquals(actualArea, expectedArea, 0.0001, "Area calculation is incorrect for radius 5.0");
    }

    @Test
    public void testCalculateAreaWithZeroRadius() {
        double radius = 0.0;
        double actualArea = circle.calculateArea(radius);
        
        Assert.assertEquals(actualArea, 0.0, 0.0001, "Area should be 0 when radius is 0");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeRadius() {
        double radius = -3.0;
        circle.calculateArea(radius);
    }
}