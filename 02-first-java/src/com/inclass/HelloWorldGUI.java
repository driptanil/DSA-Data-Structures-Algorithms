package com.inclass;

import javax.swing.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, World!");
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
