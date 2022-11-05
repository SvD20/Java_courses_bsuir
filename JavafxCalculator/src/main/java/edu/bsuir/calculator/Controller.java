package edu.bsuir.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {

    private  Operations operation;
    private int result1;
    private int result2;
    private String message = "ERROR";

    private Calculator calculator = new Calculator();

    @FXML
    private TextField field_for_first_number;

    @FXML
    private TextField field_for_second_number;

    @FXML
    private TextArea area_for_result;

    @FXML
    private RadioButton plus_button;

    @FXML
    private RadioButton minus_button;

    @FXML
    public RadioButton umnozhit_button;

    @FXML
    public RadioButton delit_button;

    @FXML
    public RadioButton sqrt_button;

    @FXML
    public Button calculate_button;


    public void initialize(){


        plus_button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
             operation = Operations.ADDITION;
        });

        minus_button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            operation = Operations.SUBTRACTION;
        });

        umnozhit_button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            operation = Operations.MULTIPLICATION;
        });

        sqrt_button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            operation = Operations.SQRT;
        });

        delit_button.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            operation = Operations.DIVISION;
        });


        calculate_button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            switch(operation){
                case ADDITION:
                    result1 = calculator.addition(Integer.parseInt(field_for_first_number.getText()),Integer.parseInt(field_for_second_number.getText()));
                    area_for_result.setText(String.valueOf(result1));
                    break;
                case SUBTRACTION:
                    result1 = calculator.substraction(Integer.parseInt(field_for_first_number.getText()),Integer.parseInt(field_for_second_number.getText()));
                    area_for_result.setText(String.valueOf(result1));
                    break;
                case MULTIPLICATION:
                    result1 = calculator.multiplication(Integer.parseInt(field_for_first_number.getText()),Integer.parseInt(field_for_second_number.getText()));
                    area_for_result.setText(String.valueOf(result1));
                    break;
                case SQRT:
                    int firstnumber = Integer.parseInt(field_for_first_number.getText());
                    int secondnumber = Integer.parseInt(field_for_second_number.getText());
                    StringBuilder stringBuilder = new StringBuilder();

                    if (firstnumber < 0 ){
                        stringBuilder.append(this.message + " ");
                    }
                    else{
                        result1 = calculator.sqrt(firstnumber);
                        stringBuilder.append(result1 + " ");
                    }

                    if (secondnumber < 0 ){
                        stringBuilder.append(this.message);
                    }
                    else{
                        result2 = calculator.sqrt(secondnumber);
                        stringBuilder.append(result2);
                    }

                    area_for_result.setText(String.valueOf(stringBuilder));
                    break;
                case DIVISION:
                    result1 = calculator.division(Integer.parseInt(field_for_first_number.getText()),Integer.parseInt(field_for_second_number.getText()));

                    if(result1!=0){
                        area_for_result.setText(String.valueOf(result1));
                    }
                    else {
                        area_for_result.setText(this.message);
                    }

                    break;
            }
        });


    }



}
