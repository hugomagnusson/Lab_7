package pair;

import java.util.Random;

public class PairSet {

	private int n;
	private Pair[] pairs;
	private static Random rand = new Random();
	
	/** Skapar en mängd av alla talpar (a,b) sådana att
        0 <= a < rows  och  0 <= b < cols */
	public PairSet(int rows, int cols) {
		
		n = rows * cols;
		pairs = new Pair[n];
		int color;
		int value;
		
		pairs[0] = new Pair(rand.nextInt(rows), rand.nextInt(cols));
		
		int i = 1;
		
		while(i < n){
			//System.out.println("i= " + i);
			
			color = rand.nextInt(rows);
			value = rand.nextInt(cols);
			boolean found = false;
			
			for(int c = 0; c < i; c++){
				
				if(color == pairs[c].first() && value == pairs[c].second()){
					found = true;
					break;
				}
				
			}
			
			if (!found) {
				pairs[i] = new Pair(color, value);
				i++;
			}
		}
		
	}

	/** Undersöker om det finns fler par i mängden. */
	public boolean more() {
		/**for(int i = 0; i < n; i++){
			if(pairs[i] != null){
				return true;
			}
		}
		return false;
		**/
		if (n > 0){
			return true;
		}
		else{
			return false;
		}
	}

	/** Hämtar ett slumpmässigt valt talpar ur mängden. Mängden
	 	blir ett element mindre. Om mängden är tom returneras null. */
	public Pair pick() {
		
		if (more()) {
		int element = rand.nextInt(n);
		Pair pick = pairs[element];
		pairs[element] = pairs[n - 1];
		n--;
		return pick;
		}
		else {
			return null;
		}
	}
	
	public String check() {
		String check = "Antal kort: " + n + "  Första element: " + pairs[0] + "  Sista element: " + pairs[n - 1];
		return check;
	}
}
