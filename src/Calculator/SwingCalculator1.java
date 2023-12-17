package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class SwingCalculator1 {

	private JFrame frame;
    private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingCalculator1 window = new SwingCalculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingCalculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout springLayout = new SpringLayout();
        frame.getContentPane().setLayout(springLayout);
        JButton btnNewButton = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 82, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 25, SpringLayout.WEST, frame.getContentPane());
        frame.getContentPane().add(btnNewButton);

        textField = new JTextField();
        springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, textField, 25, SpringLayout.WEST, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, textField, 71, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, textField, 424, SpringLayout.WEST, frame.getContentPane());
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 82, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 124, SpringLayout.WEST, frame.getContentPane());
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 82, SpringLayout.NORTH,
                frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 223, SpringLayout.WEST, frame.getContentPane());
        frame.getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1, 82, SpringLayout.NORTH,
                frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_1, 322, SpringLayout.WEST,
                frame.getContentPane());
        frame.getContentPane().add(btnNewButton_1_1_1);

        JButton btnNewButton_2 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, btnNewButton);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_1_2 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_2, 0, SpringLayout.NORTH, btnNewButton_2);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_2, 6, SpringLayout.EAST, btnNewButton_2);
        frame.getContentPane().add(btnNewButton_1_2);

        JButton btnNewButton_1_1_2 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2, 0, SpringLayout.EAST, btnNewButton_1_1);
        frame.getContentPane().add(btnNewButton_1_1_2);

        JButton btnNewButton_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2, 0, SpringLayout.NORTH, btnNewButton_1_1_1_1);
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1_1, 12, SpringLayout.SOUTH,
                btnNewButton_1_1_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_1_1, 0, SpringLayout.WEST, btnNewButton_1_1_1);
        frame.getContentPane().add(btnNewButton_1_1_1_1);

        JButton btnNewButton_2_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1, 0, SpringLayout.EAST, btnNewButton_1_1_1);
        frame.getContentPane().add(btnNewButton_2_1);

        JButton btnNewButton_2_2 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_2, 6, SpringLayout.SOUTH, btnNewButton_1_1_1_1);
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_2, 0, SpringLayout.EAST, btnNewButton_1_1_1);
        frame.getContentPane().add(btnNewButton_2_2);

        JButton btnNewButton_2_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_1, 0, SpringLayout.NORTH, btnNewButton_2_2);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_1, 0, SpringLayout.WEST, btnNewButton);
        frame.getContentPane().add(btnNewButton_2_1_1);

        JButton btnNewButton_2_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_1_1, 0, SpringLayout.NORTH, btnNewButton_2_2);
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1_1_1, 0, SpringLayout.EAST, btnNewButton_1);
        frame.getContentPane().add(btnNewButton_2_1_1_1);

        JButton btnNewButton_2_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2_1_1_1_1, 0, SpringLayout.SOUTH, btnNewButton_2_2);
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1_1_1_1, 0, SpringLayout.EAST, btnNewButton_1_1);
        frame.getContentPane().add(btnNewButton_2_1_1_1_1);

        JButton btnNewButton_2_1_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_1_1_1_1, 10, SpringLayout.SOUTH,
                btnNewButton_2_1_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_1_1_1_1, 0, SpringLayout.WEST, btnNewButton);
        frame.getContentPane().add(btnNewButton_2_1_1_1_1_1);

        JButton btnNewButton_2_1_1_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_1_1_1_1_1, 6, SpringLayout.SOUTH,
                btnNewButton_2_1_1_1);
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1_1_1_1_1_1, 0, SpringLayout.EAST, btnNewButton_1);
        frame.getContentPane().add(btnNewButton_2_1_1_1_1_1_1);

        JButton btnNewButton_2_1_1_1_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_1_1_1_1_1_1, 6, SpringLayout.SOUTH,
                btnNewButton_2_1_1_1_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_1_1_1_1_1_1, 0, SpringLayout.WEST,
                btnNewButton_1_1);
        frame.getContentPane().add(btnNewButton_2_1_1_1_1_1_1_1);

        JButton btnNewButton_2_1_1_1_1_1_1_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1, 6, SpringLayout.SOUTH,
                btnNewButton_2_1_1_1_1_1_1_1_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_1_1_1_1_1_1_1, 0, SpringLayout.WEST,
                btnNewButton_1_1_1);
        springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2_1_1_1_1_1_1_1_1, 0, SpringLayout.SOUTH,
                btnNewButton_2_1_1_1_1_1);
        frame.getContentPane().add(btnNewButton_2_1_1_1_1_1_1_1_1);

        JButton btnNewButton_2_1_2 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_2, 8, SpringLayout.SOUTH,
                btnNewButton_2_1_1_1_1_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_2, 0, SpringLayout.WEST, btnNewButton);
        frame.getContentPane().add(btnNewButton_2_1_2);

        JButton btnNewButton_2_1_2_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1_2_1, 0, SpringLayout.NORTH, btnNewButton_2_1);
        springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1_2_1, 0, SpringLayout.WEST, btnNewButton_1);
        frame.getContentPane().add(btnNewButton_2_1_2_1);

        JButton btnNewButton_2_1_2_1_1 = new JButton("New button");
        springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2_1_2_1_1, 0, SpringLayout.SOUTH, btnNewButton_2_1);
        springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1_2_1_1, 0, SpringLayout.EAST, btnNewButton_1_1);
        frame.getContentPane().add(btnNewButton_2_1_2_1_1);

	}
}

