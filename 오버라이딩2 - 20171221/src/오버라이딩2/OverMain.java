package �������̵�2;

class CObj{
	void Obj() {
		System.out.println("�θ��Լ�");
	}
	void Init() {
		System.out.println("Obj");
	}
}

class CPlayer extends CObj{
	void Player() {
		System.out.println("�ڽ��Լ�");
	}
	void Init() {
		System.out.println("Player");
	}
}

class CWizard extends CPlayer{
	void Wizard() {
		System.out.println("�����Լ�");
	}
	void Init() {
		System.out.println("Wizard");
	}
}

public class OverMain {

	public static void main(String[] args) {
//		CObj pObj = new CObj();
//		pObj.Init(); // Obj
//		pObj.Obj();
//		
//		CObj pObj2 = new CPlayer();
//		pObj2.Init(); // Player
//		
//		CObj pObj3 = new CWizard();
//		pObj3.Init(); // Wizard
		
//		CObj pObj = new CObj();
//		pObj.Obj();
//		pObj.Init();
//		
//		CPlayer pObj2 = new CPlayer();
//		pObj2.Player();
//		pObj2.Obj();
//		pObj2.Init();
		
		CWizard pObj3 = new CWizard();
		pObj3.Obj();
		pObj3.Player();
		pObj3.Wizard();
		pObj3.Init();
		
		//��ĳ����
		CPlayer cp = pObj3;
		cp.Obj();
		cp.Player();
		cp.Init();

	}

}
