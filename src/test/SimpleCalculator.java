package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SimpleCalculator {
    private final JTextField firstNumberField = new JTextField();
    private final JTextField secondNumberField = new JTextField();
    private final JLabel resultLabel = new JLabel("Result: ");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator().show());
    }

    private void show() {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(8, 8));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 8, 8));
        inputPanel.add(new JLabel("First number"));
        inputPanel.add(firstNumberField);
        inputPanel.add(new JLabel("Second number"));
        inputPanel.add(secondNumberField);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 8, 8));
        buttonPanel.add(createOperationButton("+"));
        buttonPanel.add(createOperationButton("-"));
        buttonPanel.add(createOperationButton("*"));
        buttonPanel.add(createOperationButton("/"));

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        frame.setSize(360, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JButton createOperationButton(String operator) {
        JButton button = new JButton(operator);
        button.addActionListener(event -> calculate(operator));
        return button;
    }

    private void calculate(String operator) {
        try {
            double firstNumber = Double.parseDouble(firstNumberField.getText());
            double secondNumber = Double.parseDouble(secondNumberField.getText());
            double result;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero.");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operator: " + operator);
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
        }
    }
}
