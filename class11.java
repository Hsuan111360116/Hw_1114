package hw3;



public class class11 {
    public static void main(String[] args) {
        
    	car11 c1 = new car11();
        
    	c1.setcar(1234,20.5);
        c1.show();
       
        System.out.println("�ܧ󨮸�");
        c1.setcar(2345);
        c1.show();
        
        
        System.out.println("�ܧ�T�o�q");
        c1.setcar(30.5);
        c1.show();
    }

}

class car11{
	private int num;
	private double gas;
	
	public void setcar(int n) {
		num=n;
		System.out.println("�N�����]��"+num);
	}
	public void setcar(double g) {
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);
	}
	
	public void show() {
		
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);		
	
	}
	}


