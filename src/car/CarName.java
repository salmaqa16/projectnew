package car;

public class CarName {
	
	public String carname = "Audi";
	public int yearbuilt =2016;
	
	public void whatCar(){
		System.out.println("I want an Audi ");
	}
	
	public void howToGetDreamCar(){
		System.out.println("I have to get an Automation Engineer job to get my dream car");
	}
	
	public int howManyCar(int Toyota, int Nissan){
		int totalCar = Toyota+Nissan;
		System.out.println("So far I own these many car: " + totalCar );
		return totalCar;
		
		
				
	}

}
