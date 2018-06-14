package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 {
	Frame f; //��������
	Button b;
	TextField tf; //�� ���� UI ��ü

	public EventTest1() {//������
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test"); //â�� Ÿ��Ʋ�� �ؽ�Ʈ�� ��.
		f.addWindowListener(new MyHandler3());
		b=new Button("��ư�� Ŭ���� �ּ���."); // ��ư�� �ؽ�Ʈ�� ��
		b.addActionListener(new MyHandler());//ActionListener�ڸ��� �ڵ鷯�� ����. �ڵ鷯�� super�� ActionListener�� �����Ƿ� ����.

		tf=new TextField();
		//default�� Border Layout
		//f.setLayout(new FlowLayout()); 		

		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300, 300);//ũ���
		f.setVisible(true);//visible���� �ݵ�� �ؾ� ����.
	}
	
	public static void main(String[] args) {
		new EventTest1(); //�ּҰ��� �ʿ�����ϱ� ���������� ���� �ʾƵ� ��.
	}
	//Inner class
	//Member Nested class(Ŭ���� �ȿ� Ŭ����. Ŭ���� ���� ������ �������, Ŭ������ ���������� ��������� �ؼ� member nested class��� �Ѵ�. ��������� �����ϱ� ���ؼ�. �ۿ� �־���� �ٸ� Ŭ������ �� ������ ����.)
	class MyHandler implements ActionListener{ //Enter�� click�� ����.
		public void actionPerformed(ActionEvent e) { //�������̵�. �ݵ�� ����
			tf.setText("��ư�� Ŭ���Ǿ����ϴ�."); //�� ������ �ȳ��°�! tf�� Ŭ������ ����� ���������, �� Ŭ������ EventTest Ŭ���� �ȿ� �ֱ� ������.			
		}
	}
	//Inner class
	//Member Nested class
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
	
}
