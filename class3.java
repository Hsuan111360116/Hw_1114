package hw3;


public class class3 {
    public static void main(String[] args) {
        
    	Car3 c1 = new Car3();
        
        c1.num = 1234;
        c1.gas = 20.5;
        
        Car3 c2 = new Car3();
        
        c2.num = 2345;
        c2.gas = 30.5;
        
        System.out.println("car1�����O " + c1.num);
        System.out.println("car1�T�o�q�O " + c1.gas);
        System.out.println("");
        System.out.println("car2�����O " + c2.num);
        System.out.println("car2�T�o�q�O " + c2.gas);
        
    }

}

class Car3 {

	
	int num;
    double gas;


}

