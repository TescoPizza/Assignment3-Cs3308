package assignment3group.assignment3;

import java.util.HashSet;
import java.util.Set;

public class ColourTable {
    // Stores Size of palette
    private int paletteSize;

    //Hash map storing all the colours
    private Set<Integer> colours;

    private int[] palette;


    public ColourTable(int paletteSize) {
        if (isValidPaletteSize(paletteSize)) {
            this.paletteSize = paletteSize;
            this.colours = new HashSet<>();
        }

    }
    public void add(int colour) {
        if (CheckExceedingTableSize()){
            throw new IllegalStateException("Exceeding capacity of ColourTable");
        }
        colours.add(colour);


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

    private boolean CheckExceedingTableSize() {
        if (paletteSize < this.colours.size()) {
            return false;
        }
        else{
            return true;
        }
    }




}