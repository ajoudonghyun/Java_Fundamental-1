package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "������";
		c.cphone = "010-9090-1234";
		System.out.println("�̸� : "+c.name);
		System.out.println("�ڵ��� : "+c.cphone);
		
		Alba a = new Alba();
		a.name = "�˹ٻ�";
		a.cphone = "010-9876-3456";
		a.address = "����";
		System.out.println("�̸� : "+a.name);
		System.out.println("�ڵ��� : "+a.cphone);
		System.out.println("�ּ� : "+a.address);
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone = "010-6789-4543";
		m.address = "��⵵";
		m.id = "syh1011";
		m.password = "123123";
		System.out.println("�̸� : "+m.name);
		System.out.println("�ڵ��� : "+m.cphone);
		System.out.println("�ּ� : "+m.address);
		System.out.println("���̵� : "+m.id);
		System.out.println("��� : "+m.password);
		
	}
}




