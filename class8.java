package hw3;



public class class8 {
    public static void main(String[] args) {
        
    	car8 c1 = new car8();
        c1.setnumgas(1234,20.5);
        int number=c1.getnum();;
        double gasoline=c1.getgas();;
        System.out.println("�լd�˫~���ɱo��");
        System.out.println("�����O"+number+"�A�T�o�q�O"+gasoline);
       
        
    }

}

class car8{
	int num;
	double gas;
	
	int getnum() {
		System.out.println("�ծt����");
		return num;
	}
	
	double getgas() {
		
		System.out.println("�լd�T�o�q");
		return gas;
		}
	void setnumgas(int n, double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		
				
	}
	}
	


