package assignment3group.assignment3;

import java.util.Set;

public class ColourTable {
    private int paletteSize;
    private Set<Integer> colors;

    private int[] palette;


    public ColourTable(int paletteSize) {
        // TODO: Validate that paletteSize is a power of two and between 2 and 1024.
        if (isValidPaletteSize(paletteSize)) {
            this.paletteSize = paletteSize;
        }

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

    // TODO: Implement other methods and functionalities as per your assignment.
}