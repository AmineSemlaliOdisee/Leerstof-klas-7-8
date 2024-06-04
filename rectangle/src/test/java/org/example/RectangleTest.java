package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {

    @Test
    public void getArea_withWidthChanged_AreaAlsoChanged(){
        // Arrange
        Rectangle rectangle = new Rectangle(20, 10);
        // Act
        rectangle.setWidth(20);
        double area = rectangle.getArea();
        // Assert
        assertEquals(400, area);
    }

}