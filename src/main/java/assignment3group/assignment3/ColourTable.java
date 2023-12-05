package assignment3group.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    // Stores Size of palette
    private int paletteSize;

    //List storing all the colours in the palette
    private List<Integer> palette;


    /**
     * The ColourTable function is used to create a new ColourTable object.
     * @param paletteSize Determine the size of the palette
     * @docauthor Trelent
     */
    public ColourTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new IllegalArgumentException("Invalid Palette Size");
        }
        this.paletteSize = paletteSize;
        this.palette = new ArrayList<Integer>();


    }
    /**
     * The add function adds a colour to the ColourTable.
     * @param colour Add a colour to the palette
     * @docauthor Trelent
     */
    public void add(int colour) {
        if (checkNotExceedingTableSize()){
            throw new IllegalStateException("Exceeding capacity of ColourTable");
        }
        if (checkValidRgb(colour) == false) {
            throw new IllegalArgumentException("Invalid 24-bit RGB value");
        }
        if (checkIfContainsColour(colour)) {
            return;
        }

        palette.add(colour);
    }
    /**
     * The isValidPaletteSize function checks to see if the paletteSize is a power of 2.
     * @param paletteSize Check if the palette size is greater than 1 and less than 1024
     * @return True if palettesize is greater than 1, less than or equal to 1024, and a power of 2
     * @docauthor Trelent
     */
    private boolean isValidPaletteSize(int paletteSize) {
        return paletteSize > 1 && paletteSize <= 1024 && (paletteSize & (paletteSize - 1)) == 0;

    }

    /**
     * The checkNotExceedingTableSize function checks if the size of the palette is greater than or equal to
     * the maximum number of colors allowed in a GIF image. If it is, then we return true and stop adding more
     * colors to our palette. Otherwise, we return false and continue adding more colors to our palette.
     * @return A boolean value
     * @docauthor Trelent
     */
    private boolean checkNotExceedingTableSize() {
        return this.palette.size() >= paletteSize;

    }

    /**
     * The checkValidRgb function checks if the colour is valid.
     * @param colour Check if the value is between 0 and 16777215
     * @return True if the colour is between 0 and 0xffffff (inclusive),
     * @docauthor Trelent
     */
    public boolean checkValidRgb(int colour) {
        return colour >= 0 && colour <= 0xFFFFFF;

    }
    /**
     * The checkIfContainsColour function checks if the colour is in the palette.
     * @param colour Check if the colour is in the palette
     * @return True if the palette contains a given colour, and false otherwise
     * @docauthor Trelent
     */
    public boolean checkIfContainsColour(int colour) {
        return this.palette.contains(colour);
    }




}