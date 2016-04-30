package rentcar;

import java.util.function.Supplier;

public class Car extends Vehicle {
	String[] carType ={"奔驰","宝马","别克商务"};
	int[] carPrice={300,500,1000};
	public Car(){
		setType(carType);
		setPrice(carPrice);
	}
}
