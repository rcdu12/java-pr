/* Java Program to demonstrate the event actions associated with a keyboard */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Keyboard_Event implements KeyListener,ActionListener
{
    static JFrame frame;
    static JTextField output;
    static JTextField input;
    //Driver function
    public static void main(String args[])
    {
        //Create a frame
        frame=new JFrame("Keyboard Event");
        frame.setBackground(Color.white);
        frame.setSize(500,500);
        frame.setLayout(null);
        //Create a text field for output
        output=new JTextField();
        output.setBounds(0,0,500,50);
        frame.add(output);
        //Create a text field for input
        input=new JTextField();
        input.setBounds(0,400,500,50);
        frame.add(input);
        //Create an exit button
        JButton exit=new JButton("Exit");
        exit.setBounds(220,200,60,30);
        frame.add(exit);
        //Create an object of the class
        Keyboard_Event obj=new Keyboard_Event();
        //Associate KeyListener with input
        input.addKeyListener(obj);
        //Associate ActionListener with exit
        exit.addActionListener(obj);
        frame.setVisible(true);
    }
    //function to dispose the frame when exit button is clicked
    @Override
    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }
    /*function to display the unicode of key released 
      and the character if it is a letter or a digit*/
    @Override
    public void keyReleased(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Released : "+e.getKeyCode());
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }
    /*function to display the unicode of key pressed 
      and the character if it is a letter or a digit*/
    @Override
    public void keyPressed(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Pressed : "+e.getKeyCode());
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }
    //function to display the character of the key typed
    @Override
    public void keyTyped(KeyEvent e)
    {
        output.setText("");
        output.setText("Key Typed : "+e.getKeyChar());
    }
}