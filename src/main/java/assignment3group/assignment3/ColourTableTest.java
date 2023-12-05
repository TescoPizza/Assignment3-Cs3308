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
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1023));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));
    }
    @Test
    public void testNotExceedingTables() {
        ColourTable ColourTable = new ColourTable(2);
        assertDoesNotThrow(() -> ColourTable.add(10));

    }
    @Test
    public void testExceedingTables() {
        ColourTable ColourTable = new ColourTable(2);
        ColourTable.add(10);
        ColourTable.add(11);
        assertThrows(IllegalStateException.class, () -> ColourTable.add(12));

    }

    @Test
    public void testValidRgbColours(){
        ColourTable ColourTable = new ColourTable(2);
        assertDoesNotThrow(() ->  ColourTable.add(111));
        assertDoesNotThrow(() -> ColourTable.add(0x00000A));
    }
    @Test
    public void testInValidRgbColours(){
        ColourTable ColourTable = new ColourTable(2);
        assertThrows(IllegalArgumentException.class, () -> ColourTable.add(-10));
        assertThrows(IllegalArgumentException.class, () -> ColourTable.add(0x1000000));
    }
    @Test
    public void testIfAddsColourTwice(){
        ColourTable ColourTable = new ColourTable(2);
        ColourTable.add(10);
        ColourTable.add(10);
        ColourTable.add(10);
        ColourTable.add(10);
        assertDoesNotThrow(() -> ColourTable.add(10)); // It does not throw error, as there is only one colour in the pallete



    }

        }



