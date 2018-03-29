package pair;

public class Patiens {

	private static PairSet set;
	
	public static void main(String []args){
		set = new PairSet(3,12);
		set.more();
		System.out.println(set.pick().first() + " " + set.pick().second());
	}
	
	
}
