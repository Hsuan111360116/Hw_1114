package hw3;



public class class5 {
    public static void main(String[] args) {
        
    	car5 c1 = new car5();
        
        c1.num = 1234;
        c1.gas = 20.5;
        
       
       c1.showcar();
        
        
        
        
       
        
    }

}

class car5{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O " + num);
        System.out.println("�T�o�q�O " + gas);
	}
	
	void showcar() {
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
	}
	


