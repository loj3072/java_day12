package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest2 implements ActionListener{ // EventTest2가 직접 상속받고 오버라이드※
	Frame f; //변수선언
	Button b;
	TextField tf; //세 개의 UI 객체

	public EventTest2() {//생성자
		createGUI();
	}
	public void actionPerformed(ActionEvent e) { //오버라이딩. 반드시 구현※
		tf.setText("버튼이 클릭되었습니다."); //왜 에러가 안나는가! tf는 클래스에 선언된 멤버변수로, 이 클래스가 EventTest 클래스 안에 있기 때문에.			
	}
	
	public void createGUI() {
		f=new Frame("Event Test"); //창의 타이틀로 텍스트가 들어감.
		f.addWindowListener(new MyHandler3());
		b=new Button("버튼을 클릭해 주세요."); // 버튼에 텍스트가 들어감
		b.addActionListener(this);//EventTest2(자신)가 직접 상속받았으므로 this로 표시.※

		tf=new TextField();
		//default는 Border Layout
		//f.setLayout(new FlowLayout()); 		

		f.add(b, "Center");
		f.add(tf, "South");
		f.setSize(300, 300);//크기랑
		f.setVisible(true);//visible설정 반드시 해야 보임.
	}
	
	public static void main(String[] args) {
		new EventTest2(); //주소값이 필요없으니까 변수생성을 하지 않아도 됨.
	}
	//Inner class
	//Member Nested class (클래스 안에 클래스. 클래스 안의 변수를 멤버변수, 클래스의 구성원으로 만들어졌다 해서 member nested class라고 한다. 멤버변수에 접근하기 위해서. 밖에 있어봤자 다른 클래스가 쓸 이유가 없음.)

	//Inner class
	//Member Nested class (클래스 안에 클래스. 클래스 안의 변수를 멤버변수, 클래스의 구성원으로 만들어졌다 해서 member nested class라고 한다.)
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
	
}//end class
