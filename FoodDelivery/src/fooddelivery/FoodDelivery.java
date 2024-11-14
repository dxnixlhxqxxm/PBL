/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fooddelivery;

/**
 *
 * @author Daniel Haqeem
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FoodDelivery {
    private JFrame frame;
    private SubMenu subMenu;
    private Calculator calculator;
    private Display display;
    private AddressPayment addressPayment;
    private ArrayList<Restaurant> restaurants;

    public FoodDelivery() {
    // Set Look and Feel for the entire application
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        // Set the default background and foreground for Swing components
        UIManager.put("Panel.background", new Color(97, 98, 71)); // #616247FF - dark olive green background
        UIManager.put("Label.foreground", new Color(218, 160, 61)); // #DAA03DFF - golden text
        UIManager.put("Button.background", new Color(97, 98, 71)); // Dark olive green background for buttons
        UIManager.put("Button.foreground", new Color(218, 160, 61)); // Golden text for buttons
        UIManager.put("OptionPane.background", new Color(97, 98, 71)); // #616247FF - dark olive green background for JOptionPane
        UIManager.put("OptionPane.foreground", new Color(218, 160, 61)); // Golden text for JOptionPane
        UIManager.put("OptionPane.messageForeground", new Color(218, 160, 61)); // Golden text for message in JOptionPane
        UIManager.put("OptionPane.buttonBackground", new Color(97, 98, 71)); // Dark olive green background for buttons in JOptionPane
        UIManager.put("OptionPane.buttonForeground", new Color(218, 160, 61)); // Golden text for buttons in JOptionPane
    } catch (Exception e) {
        e.printStackTrace();
    }

    calculator = new Calculator();
    display = new Display();
    addressPayment = new AddressPayment();
    restaurants = new ArrayList<>();
    initializeRestaurants();

    frame = new JFrame("Food Delivery System");
    frame.setSize(365, 295); // Increased size to fit everything
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    // Set the background color of the frame to dark olive green
    frame.getContentPane().setBackground(new Color(97, 98, 71)); // #616247FF - dark olive green background

    // Welcome message displayed in the frame
    JLabel welcomeLabel = new JLabel("Welcome To Food Delivery", SwingConstants.CENTER);
    welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 18)); // Bold font for header
    welcomeLabel.setForeground(new Color(218, 160, 61)); // #DAA03DFF - golden text
    welcomeLabel.setBounds(25, 20, 300, 30);
    frame.add(welcomeLabel);

    JButton selectRestaurantButton = new JButton("Select Restaurant");
    selectRestaurantButton.setBounds(20, 80, 150, 25);
    selectRestaurantButton.setBackground(new Color(97, 98, 71)); // Dark olive green background for button
    selectRestaurantButton.setForeground(new Color(218, 160, 61)); // Golden text for buttons
    frame.add(selectRestaurantButton);

    JButton previewItemsButton = new JButton("Preview Items");
    previewItemsButton.setBounds(180, 80, 150, 25);
    previewItemsButton.setBackground(new Color(97, 98, 71)); // Dark olive green background for button
    previewItemsButton.setForeground(new Color(218, 160, 61)); // Golden text for buttons
    frame.add(previewItemsButton);

    JButton finalizeButton = new JButton("Finalize Order");
    finalizeButton.setBounds(20, 120, 150, 25);
    finalizeButton.setBackground(new Color(97, 98, 71)); // Dark olive green background for button
    finalizeButton.setForeground(new Color(218, 160, 61)); // Golden text for buttons
    frame.add(finalizeButton);

    JButton exitButton = new JButton("Exit");
    exitButton.setBounds(180, 120, 150, 25);
    exitButton.setBackground(new Color(97, 98, 71)); // Dark olive green background for button
    exitButton.setForeground(new Color(218, 160, 61)); // Golden text for button
    frame.add(exitButton);

    // Adjust the buttons' sizes for better alignment
    selectRestaurantButton.setPreferredSize(new Dimension(150, 30));
    previewItemsButton.setPreferredSize(new Dimension(150, 30));
    finalizeButton.setPreferredSize(new Dimension(150, 30));
    exitButton.setPreferredSize(new Dimension(150, 30));

    selectRestaurantButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectRestaurant();
        }
    });

    previewItemsButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            previewItems();
        }
    });

    finalizeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (calculator.getSelectedItems().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "No items selected! Please add items before finalizing.");
            } else {
                enterAddressAndPayment();
            }
        }
    });

    exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            exitSystem();
        }
    });

    frame.setVisible(true);
}
    
    private void initializeRestaurants() {
    // Updated to include image paths
    Restaurant italianRestaurant = new Restaurant("Italian Bistro", "itali.png");
    italianRestaurant.addMenuItem("Pizza - RM15.00");
    italianRestaurant.addMenuItem("Pasta - RM10.00");
    italianRestaurant.addMenuItem("Lasagna - RM18.00");

    Restaurant burgerJoint = new Restaurant("Burger Joint", "burger.png");
    burgerJoint.addMenuItem("Burger - RM6.00");
    burgerJoint.addMenuItem("Fries - RM4.00");
    burgerJoint.addMenuItem("Milkshake - RM5.00");

    Restaurant saladBar = new Restaurant("Salad Bar", "vegan.png");
    saladBar.addMenuItem("Caesar Salad - RM9.00");
    saladBar.addMenuItem("Greek Salad - RM8.00");
    saladBar.addMenuItem("Fruit Salad - RM6.00");

    // New restaurants added
    Restaurant sushiPlace = new Restaurant("Sushi Place", "sushi.png");
    sushiPlace.addMenuItem("Sushi Rolls - RM15.00");
    sushiPlace.addMenuItem("Sashimi - RM18.00");
    sushiPlace.addMenuItem("Miso Soup - RM5.00");

    Restaurant chineseTakeaway = new Restaurant("Chinese Takeaway", "chinese.png");
    chineseTakeaway.addMenuItem("Sweet and Sour Chicken - RM14.00");
    chineseTakeaway.addMenuItem("Fried Rice - RM8.00");
    chineseTakeaway.addMenuItem("Spring Rolls - RM6.00");

    Restaurant mexicanFiesta = new Restaurant("Mexican Fiesta", "mexican.png");
    mexicanFiesta.addMenuItem("Tacos - RM9.00");
    mexicanFiesta.addMenuItem("Burritos - RM12.00");
    mexicanFiesta.addMenuItem("Quesadillas - RM10.00");

    Restaurant indianSpice = new Restaurant("Indian Spice", "indian.png");
    indianSpice.addMenuItem("Butter Chicken - RM16.00");
    indianSpice.addMenuItem("Naan Bread - RM4.00");
    indianSpice.addMenuItem("Samosas - RM5.00");

    // Add new restaurants to the list
    restaurants.add(italianRestaurant);
    restaurants.add(burgerJoint);
    restaurants.add(saladBar);
    restaurants.add(sushiPlace);
    restaurants.add(chineseTakeaway);
    restaurants.add(mexicanFiesta);
    restaurants.add(indianSpice);
}
    private void selectRestaurant() {
        String[] restaurantNames = restaurants.stream().map(Restaurant::getName).toArray(String[]::new);

        // Load your custom icon for the dialog
        ImageIcon customIcon = new ImageIcon("fd.png"); // Replace with your image path

        String selectedRestaurant = (String) JOptionPane.showInputDialog(
                frame,
                "Select a restaurant:",
                "Restaurant Selection",
                JOptionPane.QUESTION_MESSAGE,
                customIcon, // Use the custom icon here
                restaurantNames,
                restaurantNames[0]
        );

        if (selectedRestaurant != null) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equals(selectedRestaurant)) {
                    // Show restaurant logo in dialog
                    ImageIcon restaurantLogo = new ImageIcon(restaurant.getImagePath());
                    JOptionPane.showMessageDialog(frame, "You selected: " + restaurant.getName(), "Restaurant Selected", JOptionPane.INFORMATION_MESSAGE, restaurantLogo);
                    subMenu = new SubMenu(calculator, this, restaurant);
                    subMenu.displayMenu();
                    break;
                }
            }
        }
    }

    // Method to preview selected items
    private void previewItems() {
        ArrayList<String> selectedItems = calculator.getSelectedItems();
        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No items selected. Please select some items first.");
        } else {
            StringBuilder previewMessage = new StringBuilder("Selected Items:\n");
            for (String item : selectedItems) {
                previewMessage.append(item).append("\n");
            }
            // Custom icon for preview
            ImageIcon customIcon = new ImageIcon("fd.png"); // Replace with your image path
            JOptionPane.showMessageDialog(frame, previewMessage.toString(), "Preview Items", JOptionPane.INFORMATION_MESSAGE, customIcon);
        }
    }

    public void enterAddressAndPayment() {
    // Ensure address is provided
    addressPayment.inputAddress();
    if (addressPayment.getAddress() == null || addressPayment.getAddress().isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Address is required to finalize the order. Operation canceled.");
        return;  // Exit the method if no address is provided
    }

    // Ensure payment method is selected
    addressPayment.selectPaymentMethod();
    if (addressPayment.getPaymentMethod() == null || addressPayment.getPaymentMethod().isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Payment method is required to finalize the order. Operation canceled.");
        return;  // Exit the method if no payment method is selected
    }

    // Display order summary
    StringBuilder orderSummary = new StringBuilder("Order Summary:\n\n");

    // Get selected items and their prices
    ArrayList<String> selectedItems = calculator.getSelectedItems();
    for (String item : selectedItems) {
        orderSummary.append(item).append("\n");
    }

    // Add address and payment method to the summary
    orderSummary.append("\nAddress: ").append(addressPayment.getAddress());
    orderSummary.append("\nPayment Method: ").append(addressPayment.getPaymentMethod());

    // Get the total cost and format it to two decimal places
    double totalCost = calculator.calculateTotal();
    String formattedTotalCost = String.format("%.2f", totalCost); // Format to 2 decimal places
    orderSummary.append("\nTotal Cost: RM").append(formattedTotalCost);

    // Custom icon for order summary
    ImageIcon customIcon = new ImageIcon("fd.png"); // Replace with your image path
    JOptionPane.showMessageDialog(frame, orderSummary.toString(), "Order Summary", JOptionPane.INFORMATION_MESSAGE, customIcon);

    calculator.clearItems();
}

    private void exitSystem() {
    try {
        // First confirmation dialog
        ImageIcon customIcon = new ImageIcon("fd.png"); // Replace with your image path
        int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, customIcon);

        // If the user clicked "Yes", dispose the frame
        if (confirm == JOptionPane.YES_OPTION) {
            frame.dispose(); // Close the application without showing "Thank you" message
        }
        // No need for any action or message if the user clicked "No"
    } catch (Exception e) {
        JOptionPane.showMessageDialog(frame, "An error occurred while exiting: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public static void main(String[] args) {
        new FoodDelivery();
    }
}

