package Ŭ������ӿ���;

class SmartPhone{
	private String name;
	private int price;
	
	//this.name
	//this Ŭ���� ������
	//�ڱ�����������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

//public ������ ������ �����ϰ� ���ش�.
//private �ڽŹۿ� ������. �ܺο��� ���Ұ�

public class Example2 {

	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.setName("ȫ�浿");
		System.out.println(galaxy.getName());

	}

}
