package hw3;

public class class23 {

	public static void main(String[] args) {
		car23 c1 =new car23();
		
		c1.show();
		
		int num = 1234;
		double gas =20.5;
		String str="1����";
		
		c1.setcar(num,gas);
		c1.setname(str);
		
		c1.show();
	}

}

class car23{
	private int num;
	private double gas;
	private String name;
	
	public car23()
	 {
	  num=0;
	  gas=0.0;
	  name = "�S���W��";
	  System.out.println("�Ͳ��F���l");
	  
	 }
	public void setcar(int n , double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	 
	 public void setname(String nm)
	 {
	  
	  name=nm;
	 System.out.println("�N���W�]��"+name);
	 }
	 public void show()
	 {
	  System.out.println("�����O"+num);
	  System.out.println("�T�o�q�O"+gas);
	  System.out.println("���W�O"+name);
	 }
}
