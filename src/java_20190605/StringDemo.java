package java_20190605;

public class StringDemo {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "java";
		String str4 = "java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String ssn = "234567-8923456";
		//charAt(int index) �޼���� ���ڿ��߿��� Ư�� index�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		char c = ssn.charAt(6);
		System.out.println(c);
		//concat(String msg) �޼���� ���ڿ� ����
		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);
		
		//endsWith(String temp) �޼���� temp ���ڿ��� ������ true, �׷��� ������ false
		String fileName = "test.doc";
		if(fileName.endsWith("zip")){
			System.out.println("�������� �Դϴ�.");
		}else if(fileName.endsWith("doc")){
			System.out.println("Office ���� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
		
		//startsWith(String temp) �޼���� temp ���ڿ��� �����ϸ� true, �׷��� ������ false
		String url = "http://www.naver.com/";
		String uri = "sports/";
		if(uri.startsWith("sports")){
			System.out.println("������ �޴� �Դϴ�.");
		}else if(uri.startsWith("news")){
			System.out.println("���� �޴��Դϴ�.");
		}else {
			System.out.println("404 ������ �Դϴ�.");
		}
		
		String s1 = "Java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String str = String.format("%1$,20.2f%2$,20.2f%3$,20.2f", 111111.111111,222222.222222,33333.33333);
		
		System.out.println(str);
	}
}
