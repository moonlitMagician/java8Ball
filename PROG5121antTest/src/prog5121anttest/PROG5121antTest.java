package prog5121anttest;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ST10440499/Daniel Da Silva
 */
public class PROG5121antTest {

    public static void main(String[] args) {

        //calling the function to create the ui in the main method
        setUpGui();

    }

    //method to create the window of the project
    public static void setUpGui() {
        JFrame frame = new JFrame("Magic 8-Ball");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

    }

    //method to create and place the components needed
    public static void placeComponents(JPanel panel) {
        
        //defaulting panel layout
        panel.setLayout(null);

        //creating text telling the user to think of their question
        JLabel mainText = new JLabel("Think your question...");
        mainText.setBounds(125, 100, 140, 40);
        panel.add(mainText);

        //creating the button to have the 8-ball give an answer
        JButton button = new JButton("Ask the oracle");
        button.setBounds(125, 150, 140, 40);
        panel.add(button);
        
        //using anon inner class to track user input
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //invoking the function to give the user output
                JOptionPane.showMessageDialog(null, finalAns(), "The Oracle Answers... ", JOptionPane.INFORMATION_MESSAGE);
            }
         });
        


    }

    //randomly allocating the 8-ball and its output
    public static String finalAns() {
       
        int ranAns = (int) (Math.random() * 12);
        String finalAns;
        finalAns = switch (ranAns) {
            case 0 ->
                "It is certain";
            case 1 ->
                "Absolutely";
            case 2 ->
                "No Doubt";
            case 3 -> 
                "Yes, Definetly";
            case 4 ->
                "You may rely on it";
            case 5 ->
                "Signs point to yes";
            case 6 ->
                "Cannot predict now";
            case 7 ->
                "Don't count on it";
            case 8 ->
                "My sources say no";
            case 9 ->
                "Outlook not so good";
            case 10 ->
                "Very Doubtful";
            case 11 ->
                "My reply is no";
            case 12 ->
                "Signs point to no";
            default ->
                "Ask again later";
        };
        System.out.println(ranAns);
        return finalAns;
    }

}

