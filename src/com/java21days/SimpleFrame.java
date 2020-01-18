package com.java21days;

import javax.swing.*;

public class SimpleFrame extends JFrame {

    // Po rozszerzeniu tworze konstruktor
    public SimpleFrame() {
        super("Moja pierwsza aplikacja okienkowa");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setVisible(true);

    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            // nic nie rob
        }

    }

    public static void main(String[] arguments) {
        setLookAndFeel();
        SimpleFrame sf=new SimpleFrame();
    }
}
