package com.example.new_gof_design_pattern._02_observer._observer_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("그냥 저질러 버렷~~!");
    }
}
