package rentcar;

import java.util.Scanner;

public class Master {
 public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	System.out.println("请选择要租的车类型（1.轿车2.客车）：");
	int choose=input.nextInt();
	int rentType;
	int rentDay;
	switch(choose){
	case 1://租轿车
		Car car=new Car();
		rentType=car.chooseType(3);//选择轿车的型号
	    rentDay=car.chooseDay();//选择租赁的天数
	    car.rentCar(rentType, rentDay);//租车
	    break;
	
	case 2:
		Bus bus=new Bus();
		rentType=bus.chooseType(2);//选择轿车的型号
	    rentDay=bus.chooseDay();//选择租赁的天数
	    bus.rentCar(rentType, rentDay);//租车
	    break;
	    default:
	    	break;

 }	
	}
     
}
