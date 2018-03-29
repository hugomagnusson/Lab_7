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
		
		int i = 0;
		
		while(i < n){
			
			color = rand.nextInt(3);
			value = rand.nextInt(12);
			
			for(int c = 0; c <= i - 1; c++){
				
				if(color == pairs[i].first() && value == pairs[i].second()){
					break;
				}
				else{
					pairs[i] = new Pair(color, value);
					i++;
					break;
				}
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
		int element = rand.nextInt(n);
		Pair temp = pairs[element];
		pairs[element] = pairs[n - 1];
		n--;
		return temp;
	}
}
