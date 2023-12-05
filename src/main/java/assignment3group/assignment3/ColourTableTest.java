package assignment3group.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTest {
    @Test
    public void TestValidPaletteSize(){
        assertDoesNotThrow(() -> new ColourTable(32));

    }
    @Test
    public void testInvalidPaletteSizes() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(65536));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1023));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));


    }
        }



