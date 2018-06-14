package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest3 {
	Frame f; //변수선언
	Button b;
	TextField tf; //세 개의 UI 객체

	public EventTest3() {//생성자
		createGUI();
	}
	
	public void createGUI() {
		f=new Frame("Event Test"); //창의 타이틀로 텍스트가 들어감.
		f.addWindowListener(new MyHandler3());
		b=new Button("버튼을 클릭해 주세요."); // 버튼에 텍스트가 들어감
		ActionListener h=new ActionListener() { //ActionListener는 interface여서 new가 안되는데..? (구현되지 않은 메서드가 있으니까, 미완성이라서)->그럼 구현하면 되지! 그럼 밑에 MyHandler는 필요없으짐(지우기)※
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼이 클릭되었습니다."); 
			}
		}; //세미콜론 지우면 안됨!!
		b.addActionListener(h);

		tf=new TextField();
		//default는 Border Layout
		//f.setLayout(new FlowLayout()); 		

		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300, 300);//크기랑
		f.setVisible(true);//visible설정 반드시 해야 보임.
	}
	
	public static void main(String[] args) {
		new EventTest3(); //주소값이 필요없으니까 변수생성을 하지 않아도 됨.
	}

	//Inner class
	//Member Nested class
	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) { //닫기(x)버튼을 눌러서 종료.
			System.exit(0);//0을 주면 정상적으로 시스템 종료. 0이 아닌 다름 값을 주면 에러가 나서 종료되었다는 의미
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}
	
}
