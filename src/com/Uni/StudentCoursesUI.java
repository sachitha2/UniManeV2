package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentCoursesUI {
    private JButton backToStudentButton;
    private JPanel panel1;

    StudentCoursesUI(signUpObj o) {
        JFrame frame = new JFrame("StudentCoursesUI");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
        backToStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentUI studentUI = new StudentUI(o);
                frame.setVisible(false);
            }
        });
    }
}
