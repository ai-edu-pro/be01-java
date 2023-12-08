//*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerMain {  // Outer class
			
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//2.
		btn.addActionListener(new ActionListener() {  // 익명(무명) 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("이것은 지금 만든 익명 클래스 이벤트 처리");
			}
		}); // 버튼에 액션이벤트 추가
		
		frame.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {  // 닫기
				System.exit(0);
			}
		} );
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
//*/

/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {  // Outer class
			
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//2.
		btn.addActionListener(new ActionListener() {  // 익명(무명) 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("이것은 지금 만든 익명 클래스 이벤트 처리");
			}
		}); // 버튼에 액션이벤트 추가
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}

}
//*/


/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {  // Outer class
	
	class EventHandler implements ActionListener { // Inner Class

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생했습니다.");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler); // 버튼에 액션이벤트 추가
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}

}
//*/