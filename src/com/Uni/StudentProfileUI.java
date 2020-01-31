package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentProfileUI {
    private JButton backToStudentButton;
    private JTextField uName;
    private JTextField name;
    private JPanel panel1;
    private JPasswordField pass;
    private JPasswordField pass2;
    private JButton saveButton;

    StudentProfileUI(signUpObj o) {
        JFrame frame = new JFrame("StudentProfileUI");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);


        uName.setText(o.getUsername());

        backToStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);

                StudentUI studentUI = new StudentUI(o);
            }
        });
    }
}
