package hw3;



public class class10 {
    public static void main(String[] args) {
        
    	car10 c1 = new car10();
        
    	c1.setnumgas(1234,20.5);
        c1.show();
       
        System.out.println("���w�����T���T�o�q(-10.0)�ݬ�");
        
        c1.setnumgas(1234,-10.0);
        c1.show();
    }

}

class car10{
	private int num;
	private double gas;
	
	public void setnumgas(int n,double g) {
		
	
	if(g>0 && g<100) {
		num=n;
		gas=g;
		System.out.println("�N�����]�� " + num+"�A�T�o�q�]��"+gas);
	}
	else {
		System.out.println(g+"���O���T���T�o�q");
		System.out.println("�L�k�ܧ�T�o�q");
		
	}
	}
	
	public void show() {
		
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);		
	
	}
	}


