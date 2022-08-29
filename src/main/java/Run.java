import sorting.Sorting;
import sortingalgorithms.BubbleSort;
import sortingalgorithms.InsertionSort;
import sortingalgorithms.MergeSort;
import sortingalgorithms.QuickSort;


/**
 * This class runs the example.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Run {

    /**
     * Main method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        int[] numbersToSort = { 1, -3, 6, 4, 19, 12, 34, 8 };
        Sorting sorting = new Sorting ( new BubbleSort () );
        sorting.sortArray ( numbersToSort );

        sorting = new Sorting ( new QuickSort () );
        sorting.sortArray ( numbersToSort );

        sorting = new Sorting ( new InsertionSort () );
        sorting.sortArray ( numbersToSort );

        sorting = new Sorting ( new MergeSort () );
        sorting.sortArray ( numbersToSort );
    }
}
