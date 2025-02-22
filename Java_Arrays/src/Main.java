public class Main {
	
	public static void main(String agrs) {
		// Array = used to store multiple value in a single variable
		
//		String[] cars = {"Camaro","Toyota","Tesla","Peuguet"};
//		
//		cars[0] = "Lambogini";
//		
//		System.out.println(cars[3]);
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "Toyota";
		cars[2] = "Tesla";
		cars[3] = "Peuguet";
		
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}
}