package java_20190604;

public class Triangle extends Shape{
	String dot;
	double angleDegree;
	
	//Shape Ŭ���� draw �޼ҵ� �������̵�(overriding)
	//�������̵� �ۼ���Ģ
	//1. �޼ҵ� �̸� ���ƾ���.
	//2. �Ű����� ������ �ڷ����� ��ġ�ؾ���.
	//3. ��ȯ���� ���ƾ���.
	//4. ���� �����ڴ� �θ𺸴� ũ�ų� ���ƾ���.
	public void draw(){
		System.out.println("Trianle - draw()");
	}
	
	public void drawCoordinate(){
		System.out.println("Triangle - drawCoordinate()");
	}
	
}




