package model;

public class Vehicle {
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private EnergyType etype;
	
	private static int counter = 0;
	
	public int getId() {
		return id;
		
	
	}
	
	public void setPrice(float inputPrice) {
		if(inputPrice > 0 && inputPrice <=100000) {
			price = inputPrice;
		}
		else
		{
			
			
			price = 1;
		}
	}

public void setEType(EnergyType inputEType) {
	if(inputEType != null) {
		etype = inputEType;
	}
	else
	{
		etype = EnergyType.not_specified;
	}
}
}
