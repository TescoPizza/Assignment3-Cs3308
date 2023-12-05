package assignment3group.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTest {
    @Test
    public void TestValidPaletteSize(){
        assertDoesNotThrow(() -> new ColourTable(1023));

    }
    @Test
    public void testInvalidPaletteSizes() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1099));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));


    }
        }



