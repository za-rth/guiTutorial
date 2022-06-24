import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiTutorial implements ActionListener {
    private static JLabel userText;
    private static JTextField userLabel;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[]args){


        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        //username text
        userText = new JLabel("Username");
        userText.setBounds(12,24,80,25);
        panel.add(userText);

        //username label
        userLabel = new JTextField();
        userLabel.setBounds(100,20,165,25);
        panel.add(userLabel);

        //password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(12 ,50 ,80, 25);
        panel.add(passwordLabel);
        //password box
        passwordText = new JTextField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        //login button
        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new guiTutorial());
        panel.add(button);


        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println("Did It WORK?");

        if (user.equals("default") && password.equals("default")){
            success.setText("You FINISHED IT!");
        }
    }
}
