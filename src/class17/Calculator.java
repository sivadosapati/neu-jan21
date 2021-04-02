package class17;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JTextField result;
	private JButton clear, delete;
	private JButton add, subtract, multiply, divide, compute;
	private JButton[] numbers = new JButton[10];
	private JButton decimal;

	public Calculator() {
		createComponents();
		addComponents();
		setListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		setSize(1000, 1000);
		pack();
		setVisible(true);

	}

	private void setListeners() {
		delete.addActionListener((e) -> deleteLastCharacter());
		clear.addActionListener((e) -> clearText());
		for (JButton n : numbers) {
			n.addActionListener((e) -> appendCharacterToResult(e));
		}
		decimal.addActionListener((e) -> appendCharacterToResult(e));
		add.addActionListener((e) -> appendCharacterToResult(e));
		subtract.addActionListener((e) -> appendCharacterToResult(e));
		multiply.addActionListener((e) -> appendCharacterToResult(e));
		divide.addActionListener((e) -> appendCharacterToResult(e));
		//compute.addActionListener((e) -> appendCharacterToResult(e));
		compute.addActionListener((e) -> compute());
		result.addActionListener((e) -> compute());
	}

	private void compute() {
		String text = result.getText();
		
		StringTokenizer st = new StringTokenizer(text, "+-x/=", true);
		String firstNumber = st.nextToken();
		String operation = st.nextToken();
		String secondNumber = st.nextToken();
		double a = Double.parseDouble(firstNumber);
		double b = Double.parseDouble(secondNumber);
		if (operation.equals("+")) {
			result.setText(text + "=" + (a + b));
		}
		if (operation.equals("-")) {
			result.setText(text + "=" + (a - b));
		}
		if (operation.equals("x")) {
			result.setText(text + "=" + (a * b));
		}
		if (operation.equals("/")) {
			result.setText(text + "=" + (a / b));
		}
	}

	private void appendCharacterToResult(ActionEvent ae) {
		String x = ae.getActionCommand();
		String text = result.getText();
		result.setText(text + x);
	}

	private void deleteLastCharacter() {
		String text = result.getText();
		String newText = text.substring(0, text.length() - 1);
		result.setText(newText);
	}

	private void clearText() {
		result.setText("");
	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(result, "North");
		JPanel panel = new JPanel();
		panel.add(delete);
		panel.add(clear);
		con.add(panel, "South");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4));
		p.add(numbers[7]);
		p.add(numbers[8]);
		p.add(numbers[9]);
		p.add(divide);
		p.add(numbers[4]);
		p.add(numbers[5]);
		p.add(numbers[6]);
		p.add(multiply);
		p.add(numbers[1]);
		p.add(numbers[2]);
		p.add(numbers[3]);
		p.add(subtract);
		p.add(decimal);
		p.add(numbers[0]);
		p.add(compute);
		p.add(add);
		con.add(p, "Center");

	}

	private void createComponents() {
		result = new JTextField(25);
		clear = new JButton("Clear");
		delete = new JButton("Delete");
		decimal = new JButton(".");
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
		}

		add = new JButton("+");
		subtract = new JButton("-");
		multiply = new JButton("x");
		divide = new JButton("/");
		compute = new JButton("=");

	}

	public static void main(String[] args) {
		new Calculator();

	}

}
