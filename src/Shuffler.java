/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	public static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	public static final int VALUE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
	}
	
	/**
	 * Simulate a flip of a weighted coin by returning either "heads" or "tails" 
	 * each time it is called. The coin is twice as likely to turn up heads as tails.
	 * Thus, flip should return "heads" about twice as often as it returns "tails"
	 * @return either "heads" or "tails", with "heads" occuring twice as often as "tails".
	 */
	public static String flip() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		return "I have not done my homework.";
	}
	
	/**
	 * Given two int arrays of the same length but with no duplicate elements, returns true if 
	 * one array is a permutation of the other (i.e., the arrays differ only in how their contents 
	 * are arranged). Otherwise, it should return false.
	 * @param arr1 -- an integer array with no duplicate elements
	 * @param arr2 -- an integer array with no duplicate elements that is the same length as arr1
	 * @return true if arr1 is a permutation of arr2, false otherwise
	 */
	public static boolean arePermutations(int arr1[], int[] arr2) {
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		// It is assumed that arr1.length == arr2.length
		// and there are no duplicates in arr1 or arr2
		// These situations will not be tested
		return false;
	}
	
	
}