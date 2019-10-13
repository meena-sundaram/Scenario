package tamilnadu.chennai;



public class CommonManInChennai implements TrafficRulesChennai {

	@Override
	public void goByDieselVehicle() {                                     //TrafficRulesChennai Interface goByDieselVehicle() implementation	
		System.out.println("go By Diesel Vehicle in chennai");	
	}

	@Override
	public void goByBicycle() {                                          //TrafficRulesChennai Interface goByBicycle() implementation	
		System.out.println("go By Bicycle in chennai");
		
	}
	public static void main(String[] args) {
		CommonManInChennai ch=new CommonManInChennai();
		ch.goByDieselVehicle();
		ch.goByBicycle();
	}
}
