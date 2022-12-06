package at.fthw.practicalexamic20b058.test;

import at.fthw.practicalexamic20b058.service.ColorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorsServiceTest {

    private final ColorService colorService = new ColorService();

    @Test
    void testColorRed() {
        // Given/Arrange
        String colorRed = "Red";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorRed());
    }

    @Test
    void testColorOrange() {
        // Given/Arrange
        String colorRed = "Orange";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorOrange());
    }

    @Test
    void testColorYellow() {
        // Given/Arrange
        String colorRed = "Yellow";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorYellow());
    }

    @Test
    void testColorGreen() {
        // Given/Arrange
        String colorRed = "Green";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorGreen());
    }

    @Test
    void testColorBlue() {
        // Given/Arrange
        String colorRed = "Blue";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorBlue());
    }

    @Test
    void testColorPurple() {
        // Given/Arrange
        String colorRed = "Purple";

        // Then/Assert
        assertEquals(colorRed, colorService.getColorPurple());
    }



}
