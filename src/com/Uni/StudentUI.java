package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentUI {
    private JPanel panel1;
    private JButton studentCoursesButton;
    private JButton studentProfileButton;


    StudentUI(signUpObj o) {
        JFrame frame = new JFrame("StudentUI");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
        studentProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);

                StudentProfileUI studentProfileUI = new StudentProfileUI(o);
            }
        });
    }
}
