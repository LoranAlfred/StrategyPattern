package sorting;

/**
 * This class represents the sorting.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Sorting {

    private final SortingStrategy sortingStrategy;

    /**
     * Constructor.
     *
     * @param sortingStrategy The {@link SortingStrategy} to set.
     * @since 1.0
     */
    public Sorting ( SortingStrategy sortingStrategy ) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * Sorts the given array.
     *
     * @param arrayToSort The array to sort.
     * @since 1.0
     */
    public void sortArray ( int[] arrayToSort ) {
        sortingStrategy.sort ( arrayToSort );
    }
}
