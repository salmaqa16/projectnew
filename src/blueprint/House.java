package blueprint;

public class House {
	//declaring variables
	
	public int address = 10;
	public String houseName;
	
	//constructor1
	public House(){
	}
	
	//constructor2
	public House(String houseName){
		this.houseName = houseName;
	}
	
	public void setHouseName(String housename){
		this.houseName = houseName;
	}
	public void watchTVShows(){
		System.out.println("Watching Jeopardy");
	}
	
	public void playing(){
		System.out.println("Playing in the backyards");
	}
	
	public int addHouseSize(int length, int height){
		int totalSize = length + height;
		System.out.println("The total size of the house is: " + totalSize);
		return totalSize;
		
		
	}
}