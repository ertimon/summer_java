package visual;

import java.util.Arrays;
import algo.*;
import core.SortAlgorithm;


/**
 * The main class for the sort demo desktop GUI application.
 */
public final class SortDemo {
	
	// Run with no command line arguments.
	public static void main(String[] args) {
		// Set up list of algorithms and go
		SortAlgorithm[] algos = {
			QuickSortDoubleEnded.INSTANCE,
			QuickSortSliding.INSTANCE
		};
		new LaunchFrame(Arrays.asList(algos));
	}
	
}
