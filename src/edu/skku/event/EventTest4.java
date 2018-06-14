package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest4 {
	Frame f; //��������
	Button b;
	TextField tf; //�� ���� UI ��ü

	public EventTest4() {//������
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test"); //â�� Ÿ��Ʋ�� �ؽ�Ʈ�� ��.
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { //�ݱ�(x)��ư�� ������ ����.
				System.exit(0);//0�� �ָ� ���������� �ý��� ����. 0�� �ƴ� �ٸ� ���� �ָ� ������ ���� ����Ǿ��ٴ� �ǹ�
			}
		});
		b=new Button("��ư�� Ŭ���� �ּ���."); // ��ư�� �ؽ�Ʈ�� ��
		b.addActionListener(new ActionListener() { //ActionListener�� interface���� new�� �ȵǴµ�..? (�������� ���� �޼��尡 �����ϱ�, �̿ϼ��̶�)->�׷� �����ϸ� ����! �׷� �ؿ� MyHandler�� �ʿ������(�����)
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("��ư�� Ŭ���Ǿ����ϴ�."); 
			}
		}); //h�� �� �ѹ��ۿ� ������ �����ϱ� ��ȣ �ȿ� ���� �����ؼ� ����ִ� ���. �������� �ſ� ������.�� �ȵ���̵� ���� ��쿡.. ������ ���� �Ϸ��� ������.

		tf=new TextField();
		//default�� Border Layout
		//f.setLayout(new FlowLayout()); 		

		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300, 300);//ũ���
		f.setVisible(true);//visible���� �ݵ�� �ؾ� ����.
	}
	
	public static void main(String[] args) {
		new EventTest4(); //�ּҰ��� �ʿ�����ϱ� ���������� ���� �ʾƵ� ��.
	}

	//Inner class
	//Member Nested class
	//abstract class WindowAdapter implements WindowListener{
	//	public void windowOpened(WindowEvent e) {}
	//	public void windowClosing(WindowEvent e) {}
	//	public void windowClosed(WindowEvent e) {}
	//	public void windowIconified(WindowEvent e) {}
	//	public void windowDeiconified(WindowEvent e) {}
	//	public void windowActivated(WindowEvent e) {}
	//	public void windowDeactivated(WindowEvent e) {}
	//}
	//7�� �� �ϱ�� �������ϱ�
	//abstract class WindowAdapter��� Ŭ������ �̸� ����� �� ���� ����ؼ� �������̵� ����. �ڵ� �ȿ� �� �ʿ�� ����
	
}