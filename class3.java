package hw3;


public class class3 {
    public static void main(String[] args) {
        
    	Car3 c1 = new Car3();
        
        c1.num = 1234;
        c1.gas = 20.5;
        
        Car3 c2 = new Car3();
        
        c2.num = 2345;
        c2.gas = 30.5;
        
        System.out.println("car1車號是 " + c1.num);
        System.out.println("car1汽油量是 " + c1.gas);
        System.out.println("");
        System.out.println("car2車號是 " + c2.num);
        System.out.println("car2汽油量是 " + c2.gas);
        
    }

}

class Car3 {

	
	int num;
    double gas;


}

