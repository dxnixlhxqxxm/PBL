/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlinebookingappgui;

/**
 *
 * @author Daniel Haqeem
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Flight {
    String flightNumber;
    String airline;
    String origin;
    String destination;
    String departureTime;
    String arrivalTime;
    double pricePerSeat;

    Flight(String flightNumber, String airline, String origin, String destination, double pricePerSeat, String departureTime,
                  String arrivalTime) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.pricePerSeat = pricePerSeat;
    }
}

class Booking {
    String bookingID;
    List<String> selectedSeats;
    List<String> passengerNames;
    String flightNumber;
    String departureTime;
    String arrivalTime;
    double totalCost;

    Booking(String bookingID, List<String> selectedSeats, List<String> passengerNames, String flightNumber, String departureTime,
                  String arrivalTime, double totalCost) {
        this.bookingID = bookingID;
        this.flightNumber = flightNumber;
        this.selectedSeats = selectedSeats;
        this.passengerNames = passengerNames;
        this.totalCost = totalCost;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}

public class AirlineBookingApp {
    static List<Flight> availableFlights = new ArrayList<>();
    static Map<String, Booking> bookings = new HashMap<>();
    static Map<String, Boolean> seatAvailability = new HashMap<>();

    public static void main(String[] args) {
        initializeFlights();
        
        int choice = 0;

        do {
            String[] options = {"View Available Flights", "Book a Flight", "Cancel a Reservation", "Check Booking Status", "Exit"};
            choice = JOptionPane.showOptionDialog(null, "Welcome to the Airline Ticket Booking Application",
                    "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    viewAvailableFlights();
                    break;
                case 1:
                    bookFlight();
                    break;
                case 2:
                    cancelReservation();
                    break;
                case 3:
                    checkBookingStatus();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Thank you for using the Airline Ticket Booking Application. Goodbye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }

    public static void initializeFlights() {
        availableFlights.add(new Flight("MH123", "Malaysia Airlines", "Kuala Lumpur", "New York", 150.00, "2024-10-30 10:00", "2024-10-30 22:00"));
        availableFlights.add(new Flight("QR123", "Qatar Airways", "Kuala Lumpur", "New York", 180.00, "2024-10-30 18:00", "2024-10-31 06:00"));
        availableFlights.add(new Flight("EK123", "Emirates", "Kuala Lumpur", "New York", 200.00, "2024-10-30 21:00", "2024-10-31 12:00"));
        availableFlights.add(new Flight("BA234", "British Airways", "Kuala Lumpur", "London", 200.00, "2024-10-30 17:00", "2024-10-31 05:00"));
        availableFlights.add(new Flight("QR234", "Qatar Airways", "Kuala Lumpur", "London", 230.00, "2024-10-30 15:00", "2024-10-31 02:00"));
        availableFlights.add(new Flight("AF234", "Air France", "Kuala Lumpur", "London", 250.00, "2024-10-30 09:00", "2024-10-30 20:00"));
        availableFlights.add(new Flight("MH345", "Malaysia Airlines", "Kuala Lumpur", "Paris", 180.00, "2024-10-30 12:00", "2024-10-30 20:00"));
        availableFlights.add(new Flight("QR345", "Qatar Airways", "Kuala Lumpur", "Paris", 210.00, "2024-10-30 13:00", "2024-10-30 23:00"));
        availableFlights.add(new Flight("KL345", "KLM", "Kuala Lumpur", "Paris", 230.00, "2024-10-30 11:00", "2024-10-30 19:00"));
        availableFlights.add(new Flight("NH456", "All Nippon Airways", "Kuala Lumpur", "Tokyo", 300.00, "2024-10-30 14:00", "2024-10-30 22:00"));
        availableFlights.add(new Flight("QR456", "Qatar Airways", "Kuala Lumpur", "Tokyo", 330.00, "2024-10-30 16:00", "2024-10-30 23:00"));
        availableFlights.add(new Flight("JL456", "Japan Airlines", "Kuala Lumpur", "Tokyo", 350.00, "2024-10-30 15:00", "2024-10-30 23:00"));
        availableFlights.add(new Flight("MH789", "Malaysia Airlines", "New York", "Kuala Lumpur", 150.00, "2024-11-05 23:00", "2024-11-07 06:00"));
        availableFlights.add(new Flight("QR789", "Qatar Airways", "New York", "Kuala Lumpur", 180.00, "2024-11-05 20:00", "2024-11-06 05:00"));
        availableFlights.add(new Flight("EK789", "Emirates", "New York", "Kuala Lumpur", 200.00, "2024-11-05 19:00", "2024-11-06 06:00"));
        availableFlights.add(new Flight("BA213", "British Airways", "London", "Kuala Lumpur", 200.00, "2024-11-01 18:00", "2024-11-02 08:00"));
        availableFlights.add(new Flight("QR213", "Qatar Airways", "London", "Kuala Lumpur", 230.00, "2024-11-01 15:00", "2024-11-02 01:00"));
        availableFlights.add(new Flight("AF213", "Air France", "London", "Kuala Lumpur", 250.00, "2024-11-01 10:00", "2024-11-01 20:00"));
        availableFlights.add(new Flight("MH645", "Malaysia Airlines", "Paris", "Kuala Lumpur", 180.00, "2024-11-02 12:00", "2024-11-02 20:00"));
        availableFlights.add(new Flight("QR645", "Qatar Airways", "Paris", "Kuala Lumpur", 210.00, "2024-11-02 13:00", "2024-11-02 23:00"));
        availableFlights.add(new Flight("KL645", "KLM", "Paris", "Kuala Lumpur", 230.00, "2024-11-02 11:00", "2024-11-02 19:00"));
        availableFlights.add(new Flight("NH876", "All Nippon Airways", "Tokyo", "Kuala Lumpur", 300.00, "2024-11-03 14:00", "2024-11-03 22:00"));
        availableFlights.add(new Flight("QR876", "Qatar Airways", "Tokyo", "Kuala Lumpur", 330.00, "2024-11-03 16:00", "2024-11-03 23:00"));
        availableFlights.add(new Flight("JL876", "Japan Airlines", "Tokyo", "Kuala Lumpur", 350.00, "2024-11-03 15:00", "2024-11-03 23:00"));
    }
    
    public static void viewAvailableFlights() {
        String[] origin = {"Kuala Lumpur", "New York", "London", "Paris", "Tokyo"};
        String chosenOrigin = (String) JOptionPane.showInputDialog(null, "Origin...",
                "Choose your origin", JOptionPane.QUESTION_MESSAGE, null, origin, origin[0]);

        if (chosenOrigin == null) {
            JOptionPane.showMessageDialog(null, "No origin selected.");
            return;
        }

        // Get available destinations based on chosen origin
        Set<String> availableDestinations = new HashSet<>();
        for (Flight flight : availableFlights) {
            if (flight.origin.equals(chosenOrigin)) {
                availableDestinations.add(flight.destination);
            }
        }

        // Convert the set to an array for the dialog
        String[] destinations = availableDestinations.toArray(new String[0]);
        if (destinations.length == 0) {
            JOptionPane.showMessageDialog(null, "No available destinations from the selected origin.", "Available Flights", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String chosenDestination = (String) JOptionPane.showInputDialog(null, "Destination...",
                "Choose your destination", JOptionPane.QUESTION_MESSAGE, null, destinations, destinations[0]);

        if (chosenDestination == null) {
            JOptionPane.showMessageDialog(null, "No destination selected.");
            return;
        }

        // Map for destination images
        Map<String, String> destinationImages = new HashMap<>();
        destinationImages.put("Kuala Lumpur", "kl.jpg");
        destinationImages.put("New York", "new york.jpg");
        destinationImages.put("London", "london.webp");
        destinationImages.put("Paris", "paris.jpg");
        destinationImages.put("Tokyo", "tokyo.jpg");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Load the image for the chosen destination once
        String imagePath = destinationImages.get(chosenDestination);
        ImageIcon destinationImage = new ImageIcon(AirlineBookingApp.class.getClassLoader().getResource(imagePath));

        // Create a JLabel for the destination image and add it to the panel
        Image image = destinationImage.getImage();
        Image scaledImage = image.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        panel.add(imageLabel); // Add the image label to the panel

        boolean flightAvailable = false;

        // Now iterate over available flights for the chosen destination
        for (Flight flight : availableFlights) {
            if (flight.destination.equals(chosenDestination) && flight.origin.equals(chosenOrigin)) {
                flightAvailable = true; // Mark that at least one flight is available

                // Create a label for the flight information with non-breaking spaces
                JLabel flightInfo = new JLabel("<html>Flight Number:&nbsp;&nbsp;" + flight.flightNumber +
                        "<br>Airline:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + flight.airline +
                        "<br>Departure:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + flight.departureTime +
                        "<br>Arrival:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + flight.arrivalTime +
                        "<br>Price per Seat:&nbsp;&nbsp;$" + flight.pricePerSeat + "</html>");

                // Add a margin to the flight info label for better spacing
                flightInfo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Adds margin around the label

                // Add the flight information to the panel
                panel.add(flightInfo);
            }
        }

        if (!flightAvailable) {
            JOptionPane.showMessageDialog(null, "No flights available for the selected destination.", "Available Flights", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Display the panel in a dialog
            JOptionPane.showMessageDialog(null, panel, "Available Flights", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void bookFlight() {
        String[] origin = {"Kuala Lumpur", "New York", "London", "Paris", "Tokyo"};
        String chosenOrigin = (String) JOptionPane.showInputDialog(null, "Origin...",
                "Choose your origin", JOptionPane.QUESTION_MESSAGE, null, origin, origin[0]);

        if (chosenOrigin == null) {
            JOptionPane.showMessageDialog(null, "No origin selected.");
            return;
        }

        // Get available destinations based on chosen origin
        Set<String> availableDestinations = new HashSet<>();
        for (Flight flight : availableFlights) {
            if (flight.origin.equals(chosenOrigin)) {
                availableDestinations.add(flight.destination);
            }
        }

        // Convert the set to an array for the dialog
        String[] destinations = availableDestinations.toArray(new String[0]);
        if (destinations.length == 0) {
            JOptionPane.showMessageDialog(null, "No available destinations from the selected origin.");
            return;
        }

        String chosenDestination = (String) JOptionPane.showInputDialog(null, "Choose your destination...",
                "Destination", JOptionPane.QUESTION_MESSAGE, null, destinations, destinations[0]);

        if (chosenDestination == null) {
            JOptionPane.showMessageDialog(null, "No destination selected.");
            return;
        }

        List<Flight> filteredFlights = new ArrayList<>();
        for (Flight flight : availableFlights) {
            if (flight.destination.equals(chosenDestination)) {
                filteredFlights.add(flight);
            }
        }

        if (filteredFlights.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No flights available for the selected destination.");
            return;
        }

        String[] airlines = filteredFlights.stream().map(f -> f.airline).distinct().toArray(String[]::new);
        String chosenAirline = (String) JOptionPane.showInputDialog(null, "Choose your airline...",
                "Airline", JOptionPane.QUESTION_MESSAGE, null, airlines, airlines[0]);

        if (chosenAirline == null) {
            JOptionPane.showMessageDialog(null, "No airline selected.");
            return;
        }
        
  
        String seatsText;
        int seats = 0;

        // Loop until user input the correct input
        while (true) {
            // Display form for passenger details
            JPanel bookingPanel = new JPanel();
            bookingPanel.setLayout(new BoxLayout(bookingPanel, BoxLayout.Y_AXIS));

            JTextField seatsField = new JTextField(5);

            bookingPanel.add(new JLabel("Number of Seats (1-6):"));
            bookingPanel.add(seatsField);

            int result = JOptionPane.showConfirmDialog(null, bookingPanel, "Enter Booking Details", JOptionPane.OK_CANCEL_OPTION);
            if (result != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Booking canceled.");
                return;
            }

            seatsText = seatsField.getText();
        
            try {
                seats = Integer.parseInt(seatsText);
                if (seats < 1 || seats > 6) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number of seats (1-6).");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of seats.");
                continue;
            }
            break;
        }

        // Find the chosen flight based on the destination and airline
        Flight selectedFlight = null;
        for (Flight flight : filteredFlights) {
            if (flight.airline.equals(chosenAirline)) {
                selectedFlight = flight;
                break;
            }
        }

        if (selectedFlight == null) {
            JOptionPane.showMessageDialog(null, "No matching flight found. Please try again.");
            return;
        }
        
        List<String> selectedSeats = showSeatSelectionFrame(seats);
        if (selectedSeats.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No seats selected. Booking canceled.");
            return;
        }
        
        List<String> passengerNames = new ArrayList<>();
        for (int i = 0; i < seats; i++) {
            String passengerName = JOptionPane.showInputDialog("Enter name for Passenger " + (i + 1) + ":");
            if (passengerName != null && !passengerName.trim().isEmpty()) {
                passengerNames.add(passengerName.trim());
            } else {
                JOptionPane.showMessageDialog(null, "Invalid name entered.");
                return;
            }
        }
 

        // Calculate total cost based on the selected flight and number of seats
        double tax = 0.5;
        double totalCost = selectedSeats.size() * selectedFlight.pricePerSeat * tax;

        // Generate a unique booking ID
        String bookingID = UUID.randomUUID().toString().substring(0, 6).toUpperCase();

        // Create a new booking and store it
        Booking newBooking = new Booking(bookingID, selectedSeats, passengerNames, selectedFlight.flightNumber, selectedFlight.departureTime, selectedFlight.arrivalTime, totalCost);
        bookings.put(bookingID, newBooking);

        // Show confirmation message
        JOptionPane.showMessageDialog(null, "Booking successful!\n" +
                "Booking ID: " + bookingID + "\n" +
                "Purchaser Name: " + String.join(", ", passengerNames) + "\n" +
                "Seats booked: " + String.join(", ", selectedSeats) + "\n" +
                "Price per Seat: $" + selectedFlight.pricePerSeat + "\n" +
                "Tax (5%): $" + selectedFlight.pricePerSeat * tax + "\n" +
                "Total Cost: $" + totalCost);

    }

    public static List<String> showSeatSelectionFrame(int maxSeats) {
        JFrame frame = new JFrame("Select Seats");
        frame.setLayout(new GridLayout(26, 1)); // 32 rows (31 for seats, 1 for the button)
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        List<String> selectedSeats = new ArrayList<>(); // To store selected seats

        // Set preferred size for buttons
        Dimension buttonSize = new Dimension(60, 25); // Width: 60px, Height: 40px

        // Create panels for each row of seats
        for (int row = 1; row <= 25; row++) { // 31 rows of seats
            JPanel seatRowPanel = new JPanel();
            seatRowPanel.setLayout(new FlowLayout()); // Layout for individual row

            // Group A, B, C
            for (char col = 'A'; col <= 'C'; col++) { // Columns A to C
                String seatLabel = row + "" + col; // e.g., "1A", "1B", ...
                JButton seatButton = new JButton(seatLabel);
                seatButton.setPreferredSize(buttonSize); // Set the preferred size

                // Set color based on availability
                seatButton.setBackground(seatAvailability.getOrDefault(seatLabel, true) ? Color.WHITE : Color.RED);

                // Add action listener to handle seat selection
                seatButton.addActionListener(e -> {
                    if (seatButton.getBackground() == Color.WHITE && selectedSeats.size() < maxSeats) { // If seat is available and within limit
                        selectedSeats.add(seatLabel);
                        seatButton.setBackground(Color.YELLOW); // Change color to indicate selection
                        seatAvailability.put(seatLabel, false); // Mark as booked
                    } else if (seatButton.getBackground() == Color.YELLOW) { // If already selected
                        selectedSeats.remove(seatLabel);
                        seatButton.setBackground(Color.WHITE); // Change back to available
                        seatAvailability.put(seatLabel, true); // Mark as available
                    } else if (selectedSeats.size() >= maxSeats) {
                        JOptionPane.showMessageDialog(frame, "You have reached the maximum number of seats: " + maxSeats);
                    }
                });

                seatRowPanel.add(seatButton); // Add the button to the row panel
            }

            // Add aisle between A-C and D-F
            seatRowPanel.add(Box.createRigidArea(new Dimension(35, 0)));

            // Group D, E, F
            for (char col = 'D'; col <= 'F'; col++) {
                String seatLabel = row + "" + col; // e.g., "1D", "1E", ...
                JButton seatButton = new JButton(seatLabel);
                seatButton.setPreferredSize(buttonSize); // Set the preferred size

                // Set color based on availability
                seatButton.setBackground(seatAvailability.getOrDefault(seatLabel, true) ? Color.WHITE : Color.RED);

                // Add action listener to handle seat selection
                seatButton.addActionListener(e -> {
                    if (seatButton.getBackground() == Color.WHITE && selectedSeats.size() < maxSeats) { // If seat is available and within limit
                        selectedSeats.add(seatLabel);
                        seatButton.setBackground(Color.YELLOW); // Change color to indicate selection
                        seatAvailability.put(seatLabel, false); // Mark as booked
                    } else if (seatButton.getBackground() == Color.YELLOW) { // If already selected
                        selectedSeats.remove(seatLabel);
                        seatButton.setBackground(Color.WHITE); // Change back to available
                        seatAvailability.put(seatLabel, true); // Mark as available
                    } else if (selectedSeats.size() >= maxSeats) {
                        JOptionPane.showMessageDialog(frame, "You have reached the maximum number of seats: " + maxSeats);
                    }
                });

                seatRowPanel.add(seatButton); // Add the button to the row panel
            }

            frame.add(seatRowPanel); // Add the row panel to the frame
        }

        JButton confirmButton = new JButton("Confirm Seats");
        confirmButton.setPreferredSize(buttonSize); // Set the preferred size for the confirm button
        confirmButton.addActionListener(e -> {
            // Check if the number of selected seats matches the requested number
            if (selectedSeats.size() == maxSeats) {
                frame.dispose(); // Close the frame if seats are correctly selected
            } else {
                JOptionPane.showMessageDialog(frame, "Please select exactly " + maxSeats + " seat(s). You selected: " + selectedSeats.size());
            }
        });

        frame.add(confirmButton); // Add the confirm button to the frame
        frame.pack();
        frame.setVisible(true);
        
        // Wait for the user to complete their seat selection
        while (frame.isVisible()) {
            try {
                Thread.sleep(100); // Sleep briefly to allow for UI updates
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return selectedSeats; // Return the list of selected seats.
    }

    // Cancel a reservation
    public static void cancelReservation() {
        String bookingID = JOptionPane.showInputDialog("Enter your booking ID to cancel:");

        if (bookings.containsKey(bookingID)) {
            Booking booking = bookings.get(bookingID);
            // Update seat availability based on the canceled booking
            for (String seat : booking.selectedSeats) {
                seatAvailability.put(seat, true); // Mark seats as available
            }
            bookings.remove(bookingID);
            JOptionPane.showMessageDialog(null, "Reservation with ID " + bookingID + " has been successfully canceled.");
        } else {
            JOptionPane.showMessageDialog(null, "Booking ID not found. Please try again.");
        }
    }
    
    public static void checkBookingStatus() {
        String bookingID = JOptionPane.showInputDialog("Enter your booking ID to check the status:");

        if (bookings.containsKey(bookingID)) {
            Booking booking = bookings.get(bookingID);
            JOptionPane.showMessageDialog(null, "Booking ID: " + booking.bookingID +
                                                "\nPassenger Name: " + booking.passengerNames +
                                                "\nFlight Number: " + booking.flightNumber +
                                                "\nDeparture Time: " + booking.departureTime +
                                                "\nArrival Time: " + booking.arrivalTime +
                                                "\nSeats Booked: " + booking.selectedSeats +
                                                "\nTotal Cost: $" + booking.totalCost,
                                                "Booking Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Booking ID not found. Please try again.");
        }
    }
}





