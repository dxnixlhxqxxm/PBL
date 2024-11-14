/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labeltest;

/**
 *
 * @author Daniel Haqeem
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelTest extends JFrame {
    private JLabel label1, batmanPictureLabel;
    private JTextArea smallTextArea;
    private JRadioButton batmanRadio, robinRadio, jokerRadio;
    private ButtonGroup characterGroup;
    private JButton continueButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem showBatmanMenuItem;
    private JPanel topPanel, centerPanel, bottomPanel;

    public LabelTest() {
        super("Batman Universe");

        // Set layout and theme colors
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.setBackground(Color.BLACK);
        setSize(600, 500);

        // Menu bar for options
        menuBar = new JMenuBar();
        menu = new JMenu("Options");
        menu.setForeground(Color.YELLOW);

        // Menu item to show Batman picture
        showBatmanMenuItem = new JMenuItem("Show Batman Picture");
        showBatmanMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showBatmanPicture();
            }
        });

        // Add menu item to menu and set menu bar
        menu.add(showBatmanMenuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Top panel for Batman picture (initially hidden)
        topPanel = new JPanel();
        topPanel.setBackground(Color.BLACK);
        Icon batmanIcon = new ImageIcon("C:\\Users\\Daniel Haqeem\\Downloads\\batfamily.jpg"); // Replace with actual image path
        batmanPictureLabel = new JLabel(batmanIcon, SwingConstants.CENTER);
        topPanel.add(batmanPictureLabel);
        container.add(topPanel, BorderLayout.NORTH);

        // Center panel for text area and radio buttons
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(Color.BLACK);

        // Small text area
        smallTextArea = new JTextArea(2, 20); // Smaller text area with 2 rows
        smallTextArea.setText("Welcome to Gotham City!");
        smallTextArea.setBackground(Color.DARK_GRAY);
        smallTextArea.setForeground(Color.YELLOW);
        smallTextArea.setFont(new Font("Bookman", Font.PLAIN, 16));
        centerPanel.add(smallTextArea);

        // Radio buttons for characters
        batmanRadio = new JRadioButton("Batman");
        robinRadio = new JRadioButton("Robin");
        jokerRadio = new JRadioButton("Joker");

        batmanRadio.setForeground(Color.YELLOW);
        robinRadio.setForeground(Color.YELLOW);
        jokerRadio.setForeground(Color.YELLOW);

        batmanRadio.setBackground(Color.BLACK);
        robinRadio.setBackground(Color.BLACK);
        jokerRadio.setBackground(Color.BLACK);

        // Group radio buttons
        characterGroup = new ButtonGroup();
        characterGroup.add(batmanRadio);
        characterGroup.add(robinRadio);
        characterGroup.add(jokerRadio);

        // Add radio buttons to the center panel
        centerPanel.add(batmanRadio);
        centerPanel.add(robinRadio);
        centerPanel.add(jokerRadio);

        container.add(centerPanel, BorderLayout.CENTER);

        // Bottom panel for the "Continue" button with Batman logo
        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.BLACK);
        Icon continueIcon = new ImageIcon("path_to_batman_continue_logo.png"); // Replace with actual image path
        continueButton = new JButton("Continue", continueIcon);
        continueButton.setForeground(Color.YELLOW);
        continueButton.setBackground(Color.DARK_GRAY);

        // Add action listener to the continue button
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showSelectedCharacter();
            }
        });

        bottomPanel.add(continueButton);
        container.add(bottomPanel, BorderLayout.SOUTH);

        // Set JFrame properties
        setVisible(true);
    }

    // Method to show Batman picture
    private void showBatmanPicture() {
        batmanPictureLabel.setVisible(true);
        revalidate(); // Refresh the layout to show the picture
        repaint();
    }

    // Method to show selected character from the radio buttons
    private void showSelectedCharacter() {
        String selectedCharacter = "";
        if (batmanRadio.isSelected()) {
            selectedCharacter = "Batman: The Dark Knight of Gotham!";
        } else if (robinRadio.isSelected()) {
            selectedCharacter = "Robin: Batman’s loyal sidekick.";
        } else if (jokerRadio.isSelected()) {
            selectedCharacter = "Joker: The Clown Prince of Crime.";
        } else {
            selectedCharacter = "No character selected.";
        }

        // Show a dialog with the selected character
        JOptionPane.showMessageDialog(this, selectedCharacter);
    }

    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




