package rentcar;

import java.util.Scanner;

public class Vehicle {
	   private String[] type=new String[10];//记录车的种类
       private int[] price=new int[10];//记录车的价格
	public void getType(int num) {
		for (int i = 0; i < num; i++) 
			System.out.println(i+1+"."+type[i]+"\t"+price[i]);	
	
	}

	public void rentCar(int rentType,int rentDay){//传入的参数为选择的租车种类以及要组的天数
		Scanner input=new Scanner(System.in);
		int cost=price[rentType-1]*rentDay;//cost计算租车的总费用
		System.out.println("请核对以下信息");
		System.out.println("您要租的车为："+type[rentType-1]+"    租的天数为："+rentDay+"天    价格共计:"+cost);
		System.out.println("确定[y/n]：");
		if(input.next().equals("y")){
			System.out.println("租赁成功！");
			System.out.println("您租的车为："+type[rentType-1]+"\t车牌号为:"+(int)(Math.random()*10000)+" \t租的天数为："+rentDay+"天 \t价格共计:"+cost);
		}
		else
			System.out.println("租赁失败");
			
	}
	public int chooseType(int choose){//选择要租的车型号,choose为用户选择的汽车种类
		getType(choose);
		System.out.println("请选择要租的车型号:");
		Scanner input=new Scanner(System.in);
		int rentType=input.nextInt();
		return rentType;
	}
	public int chooseDay(){//选择要租天数
		System.out.println("请选择要租的天数:");
		Scanner input=new Scanner(System.in);
		int rentDay=input.nextInt();
		return rentDay;
		
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}
	
	
}
