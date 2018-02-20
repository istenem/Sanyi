package com.company;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Button> buttons;

    public Controller() {
        buttons = new ArrayList<Button>();
    }

    public void addButton(Button b) {
        buttons.add(b);
    }

    public void pressAll() {
        for (Button b : buttons) {
            b.setState(true);
        }
    }
    public void releaseAll() {
        for (Button b : buttons) {
            b.setState(false);
        }
    }

    public int getNumOfPressedBtns() {
        int countNum = 0;
        for (Button b : buttons) {
            if (b.getState() == true) {
                countNum++;
            }
        }
        return countNum;
    }
}