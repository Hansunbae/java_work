package SwingTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	private JButton button;
	private JLabel label;
	private JTextField textField;
	private JPasswordField passwordField;
	private FlowLayout flowLayout;
	
	public MyComponents() {
		initData();
		setInitLayout();
	}
	public void initData() {
		setTitle("컴포넌트 만들기 연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("무한 반복");
		label = new JLabel("뭐라고 뜨는지 한 번 보자");
		textField = new JTextField("무엇을 입력합니까", 10);
		passwordField = new JPasswordField("비밀번호를 입력하시오", 10);
	}
	public void setInitLayout() {
		add(label);
		add(button);
		add(textField);
		add(passwordField);
		
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyComponents();
	}
}
