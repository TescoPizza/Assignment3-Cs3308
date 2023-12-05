package assignment3group.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    // Stores Size of palette
    private int paletteSize;

    //List storing all the colours in the palette
    private List<Integer> palette;


    public ColourTable(int paletteSize) {
        if (isValidPaletteSize(paletteSize)) {
            this.paletteSize = paletteSize;
            this.palette = new ArrayList<Integer>();
        }

    }
    public void add(int colour) {
        if (checkNotExceedingTableSize()){
            throw new IllegalStateException("Exceeding capacity of ColourTable");
        }
        if (checkValidRgb(colour) == false) {
            throw new IllegalArgumentException("Invalid 24-bit RGB value");
        }

        palette.add(colour);
    }
    private boolean isValidPaletteSize(int paletteSize) {
        if (paletteSize > 1024) {
            throw new IllegalArgumentException("Palette size must be less than 1025");
        }
        if ((paletteSize & (paletteSize - 1)) == 0 && paletteSize > 1) {
            return true;
        } else {
            throw new IllegalArgumentException("Palette size must be a power of two and greater than 1.");
        }

    }

    private boolean checkNotExceedingTableSize() {
        if (paletteSize < this.palette.size()) {
            return false;
        }
        else{
            return true;
        }
    }

    private boolean checkValidRgb(int colour) {
        if ((colour >= 0 && colour <= 0xFFFFFF)) {
            return true;
        }
        else {
            return false;
        }
    }




}