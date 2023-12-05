package assignment3group.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTest {
    /**
     * The TestValidPaletteSize function tests the ColourTable constructor to ensure that it throws an exception when
     * a palette size is passed in that is not a power of 2.
     * @docauthor Trelent
     */
    @Test
    public void TestValidPaletteSize(){
        assertDoesNotThrow(() -> new ColourTable(32));

    }
    /**
     * The testInvalidPaletteSizes function tests the ColourTable constructor to ensure that it throws an IllegalArgumentException when given a palette size of 1023, - 1 or 1.
     * @docauthor Trelent
     */
    @Test
    public void testInvalidPaletteSizes() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1023));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));
    }
    /**
     * The testNotExceedingTables function tests the ColourTable class to see if it can add a value that is less than or equal to the maximum number of tables.
     * @docauthor Trelent
     */
    @Test
    public void testNotExceedingTables() {
        ColourTable ColourTable = new ColourTable(2);
        assertDoesNotThrow(() -> ColourTable.add(10));

    }
    /**
     * The testExceedingTables function tests the add function to see if it throws an IllegalStateException when
     * the number of elements in the table exceeds its capacity.
     * @docauthor Trelent
     */
    @Test
    public void testExceedingTables() {
        ColourTable ColourTable = new ColourTable(2);
        ColourTable.add(10);
        ColourTable.add(11);
        assertThrows(IllegalStateException.class, () -> ColourTable.add(12));

    }

    /**
     * The testValidRgbColours function tests the add function in ColourTable.java to ensure that it can handle
     * valid RGB colours, which are integers between 0 and 255 inclusive. The testValidRgbColours function does this by
     * calling the assertDoesNotThrow method from JUnit 5, which checks if an exception is thrown when a given lambda expression is executed.
     * @docauthor Trelent
     */
    @Test
    public void testValidRgbColours(){
        ColourTable ColourTable = new ColourTable(2);
        assertDoesNotThrow(() ->  ColourTable.add(111));
        assertDoesNotThrow(() -> ColourTable.add(0x00000A));
    }
    /**
     * The testInValidRgbColours function tests the add function in ColourTable.java to ensure that it throws an IllegalArgumentException when given a value less than 0 or greater than 16777215 (0xFFFFFF).
     * @docauthor Trelent
     */
    @Test
    public void testInValidRgbColours(){
        ColourTable ColourTable = new ColourTable(2);
        assertThrows(IllegalArgumentException.class, () -> ColourTable.add(-10));
        assertThrows(IllegalArgumentException.class, () -> ColourTable.add(0x1000000));
    }
    /**
     * The testIfAddsColourTwice function tests if the add function adds a colour twice.
     * It does this by creating a new ColourTable object with 2 colours, and then adding 10 to it 4 times.
     * The assertDoesNotThrow statement checks that there is no error thrown when adding 10 to the ColourTable object, as there is only one colour in the pallete.
     */
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



