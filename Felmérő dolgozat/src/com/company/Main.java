package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller ctrl = new Controller();

        Button A = new Button("A",true);
        ctrl.addButton(A);

        Button B = new Button("B",false);
        ctrl.addButton(B);

        Button X = new Button("X",false);
        ctrl.addButton(X);

        Button Y = new Button("Y",true);
        ctrl.addButton(Y);

        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());

        ctrl.pressAll();

        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());

        ctrl.releaseAll();

        System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
    }
}
