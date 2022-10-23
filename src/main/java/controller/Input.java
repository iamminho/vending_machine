package controller;

import java.util.Scanner;

import view.InputView;

public class Input {
	static InputView inputView = new InputView();
	static Scanner sc = new Scanner(System.in);

	public void SumOfCoinsInput() {
		inputView.SumOfCoinsInputMention();

	}
}
