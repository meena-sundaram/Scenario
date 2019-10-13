package india.newDelhi;

import tamilnadu.chennai.TrafficRulesChennai;

public class CommonManInDelhi implements TrafficRulesDelhi, TrafficRulesChennai{

	@Override
	public void dontGoByDieselVehicle() {                                  //TrafficRulesDelhi Interface dontGoByDieselVehicle() implementation	
		System.out.println("Dont go by diesel vehicle in Delhi");        
	}

	public void goByBicycle() {                                            //TrafficRulesDelhi Interface goByBicycle() implementation and method is overridden	
		System.out.println("Delhi bicycle");
	}

	public void goByDieselVehicle() {
		System.out.println("go By Diesel Vehicle in delhi");	
	}
	public static void main(String[] args) {
		CommonManInDelhi delhi=new CommonManInDelhi();
		delhi.dontGoByDieselVehicle();
		delhi.goByBicycle();
		delhi.goByDieselVehicle();
	}
}
