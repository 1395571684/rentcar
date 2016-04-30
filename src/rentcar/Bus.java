package rentcar;

public class Bus extends Vehicle{
	String[] busType={"<=16座",">16座"};
	int[] busPrice={800,1500};
	public Bus(){
		setType(busType);
		setPrice(busPrice);
		}
	

}
