package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import static java.lang.String.valueOf;

public class Controller {
	public Button btnTopLeft;
	public Button btnTopRight;
	public Button btnBottomLeft;
	public Button btnBottomRight;

	private int numberTopLeft;
	private int numberTopRight;
	private int numberBottomLeft;
	private int numberBottomRight;

	private Field field;

	public Controller() {
		field = new Field();

	}

	public void initialize() {
		Tile[][] array = field.getTiles();
		btnTopLeft.setText(valueOf(array[0][0].getValue()));
		btnTopRight.setText(valueOf(array[0][1].getValue()));
		btnBottomLeft.setText(valueOf(array[1][0].getValue()));
		btnBottomRight.setText(valueOf(array[1][1].getValue()));
		initializeNumbers();
	}

	private void initializeNumbers() {
		numberTopLeft = Integer.parseInt(btnTopLeft.getText());
		numberTopRight = Integer.parseInt(btnTopRight.getText());
		numberBottomLeft = Integer.parseInt(btnBottomLeft.getText());
		numberBottomRight = Integer.parseInt(btnBottomRight.getText());
	}

	public void clickBtnTopLeft(ActionEvent actionEvent) {
		Tile[][] array = field.getTiles();
		if (numberTopLeft > 0) {
			numberTopLeft = numberTopLeft - 1;
			btnTopLeft.setText(valueOf(numberTopLeft));
			numberBottomLeft = numberBottomLeft + 1;
			numberTopRight = numberTopRight + 1;
			btnBottomLeft.setText(valueOf(numberBottomLeft));
			btnTopRight.setText(valueOf(numberTopRight));

			array[0][0].setValue(numberTopLeft);
			array[1][0].setValue(numberBottomLeft);
			array[0][1].setValue(numberTopRight);
		}

	}

	public void clickBtnTopRight(ActionEvent actionEvent) {
		Tile[][] array = field.getTiles();
		if (numberTopRight > 0) {
			numberTopRight = numberTopRight - 1;
			btnTopRight.setText(valueOf(numberTopRight));
			numberTopLeft = numberTopLeft + 1;
			numberBottomRight = numberBottomRight + 1;
			btnTopLeft.setText(valueOf(numberTopLeft));
			btnBottomRight.setText(valueOf(numberBottomRight));

			array[0][0].setValue(numberTopLeft);
			array[1][1].setValue(numberBottomRight);
			array[0][1].setValue(numberTopRight);
		}
	}


	public void clickBtnBottomLeft(ActionEvent actionEvent) {
		Tile[][] array = field.getTiles();
		if (numberBottomLeft > 0) {
			numberBottomLeft = numberBottomLeft - 1;
			btnBottomLeft.setText(valueOf(numberBottomLeft));
			numberBottomRight = numberBottomRight + 1;
			numberTopLeft = numberTopLeft + 1;
			btnBottomRight.setText(valueOf(numberBottomRight));
			btnTopLeft.setText(valueOf(numberTopLeft));

			array[0][0].setValue(numberTopLeft);
			array[1][0].setValue(numberBottomLeft);
			array[1][1].setValue(numberBottomRight);
		}
	}

	public void clickBtnBottomRight(ActionEvent actionEvent) {
		Tile[][] array = field.getTiles();
		if (numberBottomRight > 0) {
			numberBottomRight = numberBottomRight - 1;
			btnBottomRight.setText(valueOf(numberBottomRight));
			numberBottomLeft = numberBottomLeft + 1;
			btnBottomLeft.setText(valueOf(numberBottomLeft));
			numberTopRight = numberTopRight + 1;
			btnTopRight.setText(valueOf(numberTopRight));

			array[1][1].setValue(numberBottomRight);
			array[1][0].setValue(numberBottomLeft);
			array[0][1].setValue(numberTopRight);
		}
	}
}

