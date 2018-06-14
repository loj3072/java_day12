package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest2 implements ActionListener{ // EventTest2�� ���� ��ӹް� �������̵��
	Frame f; //��������
	Button b;
	TextField tf; //�� ���� UI ��ü

	public EventTest2() {//������
		createGUI();
	}
	public void actionPerformed(ActionEvent e) { //�������̵�. �ݵ�� ������
		tf.setText("��ư�� Ŭ���Ǿ����ϴ�."); //�� ������ �ȳ��°�! tf�� Ŭ������ ����� ���������, �� Ŭ������ EventTest Ŭ���� �ȿ� �ֱ� ������.			
	}
	
	public void createGUI() {
		f=new Frame("Event Test"); //â�� Ÿ��Ʋ�� �ؽ�Ʈ�� ��.
		f.addWindowListener(new MyHandler3());
		b=new Button("��ư�� Ŭ���� �ּ���."); // ��ư�� �ؽ�Ʈ�� ��
		b.addActionListener(this);//EventTest2(�ڽ�)�� ���� ��ӹ޾����Ƿ� this�� ǥ��.��

		tf=new TextField();
		//default�� Border Layout
		//f.setLayout(new FlowLayout()); 		

		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300, 300);//ũ���
		f.setVisible(true);//visible���� �ݵ�� �ؾ� ����.
	}
	
	public static void main(String[] args) {
		new EventTest2(); //�ּҰ��� �ʿ�����ϱ� ���������� ���� �ʾƵ� ��.
	}
	//Inner class
	//Member Nested class (Ŭ���� �ȿ� Ŭ����. Ŭ���� ���� ������ �������, Ŭ������ ���������� ��������� �ؼ� member nested class��� �Ѵ�. ��������� �����ϱ� ���ؼ�. �ۿ� �־���� �ٸ� Ŭ������ �� ������ ����.)

	//Inner class
	//Member Nested class (Ŭ���� �ȿ� Ŭ����. Ŭ���� ���� ������ �������, Ŭ������ ���������� ��������� �ؼ� member nested class��� �Ѵ�.)
	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) { //�ݱ�(x)��ư�� ������ ����.
			System.exit(0);//0�� �ָ� ���������� �ý��� ����. 0�� �ƴ� �ٸ� ���� �ָ� ������ ���� ����Ǿ��ٴ� �ǹ�
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}
	
}//end class
