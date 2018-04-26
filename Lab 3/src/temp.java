
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float fahrenheit;
		float centigrade;
		
		//fahrenheit = 98.6f;
		
			System.out.println("Fahhrenheit           Centigrade");
		for(int i=0; i<=40;i+=5) {
			centigrade=(5f/9)*(i-32);
			System.out.println("    "+i+"                "+centigrade);
		}
		System.out.println();
		System.out.println("Fahhrenheit           Centigrade");
		int j=0;
		while(j<=40) {
			centigrade=(5f/9)*(j-32);
			System.out.println("    "+j+"                "+centigrade);
			j+=5;
		}
	}

}
