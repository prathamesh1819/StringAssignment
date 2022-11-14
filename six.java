//WAP check String  is pangram or not


public class six {

	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		s1.toLowerCase();
	    boolean r=ispanagram(s1);
		System.out.println(r);

	}

	private static boolean ispanagram(String s) {
		if (s.length() < 26) 
		{ 
			return false;
		} 
		else 
		{
			for (char i = 'a'; i <= 'z'; i++) {
				if (s.indexOf(i) == -1) 
				{
					return false;

				}
			}
			
		}
		return true;
	
		

	}
}
