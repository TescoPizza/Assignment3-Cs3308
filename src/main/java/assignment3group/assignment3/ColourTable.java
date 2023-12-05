package assignment3group.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    // Stores Size of palette
    private int paletteSize;

    //List storing all the colours in the palette
    private List<Integer> palette;


    public ColourTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new IllegalArgumentException("Invalid Palette Size");
        }
        this.paletteSize = paletteSize;
        this.palette = new ArrayList<Integer>();


    }
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
    private boolean isValidPaletteSize(int paletteSize) {
        return paletteSize > 1 && paletteSize <= 1024 && (paletteSize & (paletteSize - 1)) == 0;

    }

    private boolean checkNotExceedingTableSize() {
        return this.palette.size() >= paletteSize;

    }

    public boolean checkValidRgb(int colour) {
        return colour >= 0 && colour <= 0xFFFFFF;

    }
    public boolean checkIfContainsColour(int colour) {
        return this.palette.contains(colour);
    }




}