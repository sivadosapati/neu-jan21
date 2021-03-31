package class17;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstUIApplication {

	// Create a Container
	// Set the Layout to container
	// Create the Components
	// Add the components to the Container
	// Create Listeners and attach to components
	// Make the container visible

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("My First Application");

		FlowLayout layout = new FlowLayout();

		frame.setLayout(layout);
		// frame.setLayout(new GridLayout(2, 1));

		JButton blue = new JButton("Blue");
		JButton red = new JButton("Red");
		JLabel clicker = new JLabel("Clicked 0 times");

		frame.add(blue);
		frame.add(red);
		frame.add(clicker);

		ButtonActionListener bal = new ButtonActionListener(frame, clicker);
		blue.addActionListener(bal);
		red.addActionListener(bal);

		red.addActionListener((ae) -> incrementCounterAndUpdateLabel(clicker));
		blue.addActionListener((ae) -> incrementCounterAndUpdateLabel(clicker));
		frame.setSize(500, 1000);
		frame.setVisible(true);

	}

	static int counter = 0;

	public static void incrementCounterAndUpdateLabel(JLabel label) {
		counter++;
		label.setText("Buttons are clicked " + counter + " times");
	}

	static class ButtonActionListener implements ActionListener {

		JFrame frame;
		int counter = 0;
		JLabel label;

		ButtonActionListener(JFrame frame, JLabel label) {
			this.frame = frame;
			this.label = label;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			counter++;
			System.out.println("Button clicked");
			String c = e.getActionCommand();
			System.out.println(e.getActionCommand());
			if (c.equals("Red")) {
				frame.getContentPane().setBackground(Color.red);
			} else {
				frame.getContentPane().setBackground(Color.blue);
			}
			// label.setText("Buttons are clicked " + counter + " times");

		}

	}

}
