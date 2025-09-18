package com.project.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class CalculatorController {

    private String equation=" ";// this is an attribute of a class






    @FXML
    private Label Answer;
    @FXML
   private TextField Sum;
    @FXML
    private Label Pre_Sum;



    @FXML protected void on7(){
       equation=equation+7;// to output the number 7 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on8(){
        equation=equation+8;// to output the number 8 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on9(){
        equation=equation+9;// to output the number 9 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on4(){
        equation=equation+4;// to output the number 4 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on5(){
        equation=equation+5;// to output the number 5 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on6(){
        equation=equation+6;// to output the number 6 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on3(){
        equation=equation+3;// to output the number 3 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on2(){
        equation=equation+2;// to output the number 2 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on1(){
        equation=equation+1;// to output the number 1 on the screen

        Sum.setText(equation);
    }
    @FXML protected void on0(){
        equation=equation+0;// to output the number 0 on the screen

        Sum.setText(equation);
    }
    @FXML protected void onDivide(){
     equation=equation+"/";
        Sum.setText(equation);

    }
    @FXML protected void onMultiply(){
        equation=equation+"x";
        Sum.setText(equation);

    }
    @FXML protected void onSubtract(){
        equation=equation+"-";
        Sum.setText(equation);
    }
    @FXML protected void onPlus(){
        equation=equation+"+";
        Sum.setText(equation);// to show on text field
    }
    @FXML protected void onEquals(){

            String Before_operator;
            String After_operator;
              double base_sum;// the calculation before adding to the total variable
              double total=0;// the total must be within this method , do not make it an attribute

          for (int i=0;i<equation.length();i++){// to search the length of the array
              char operator= equation.charAt(i);// to get the individual characters in the string
               switch (operator){// switch statement to make code easier to read
                   case '+':{
                      Before_operator=equation.substring(0,i);// getting the number before the plus sign
                       After_operator=equation.substring(i+1);// getting the number after the plus sign
                       base_sum=(Double.parseDouble(Before_operator)+Double.parseDouble(After_operator));
                       total=total+base_sum;
                       // add the strings together in a double equation

                   }
                   break;
                   case '-':{
                       Before_operator=equation.substring(0,i);// getting the number before the minus sign
                       After_operator=equation.substring(i+1);// getting the number after the minus sign
                       base_sum=(Double.parseDouble(Before_operator)-Double.parseDouble(After_operator));
                       total=total+base_sum;
                       // to subtract the numbers in the equation

                   }
                   break;
                   case '/':{
                       Before_operator=equation.substring(0,i);// getting the number before the division sign
                       After_operator=equation.substring(i+1);// getting the number after the division sign

                       base_sum=(Double.parseDouble(Before_operator)/Double.parseDouble(After_operator));
                       total=total+base_sum;
                       // to divide the numbers in the equation
                       if (After_operator.equalsIgnoreCase("0")){// cannot divide by 0

                           total=0;
                           // JavaFX version of JOptionPane show message dialogs
                           Alert divide0= new Alert(Alert.AlertType.ERROR);
                           divide0.setTitle("Error");// set the title of the alert
                           divide0.setContentText("Cannot divide by 0");// to write the content in the pane
                           divide0.showAndWait();// to show and freeze the program so the user can see the error


                       }


                   }
                   break;
                   case 'x':{
                       Before_operator=equation.substring(0,i);// getting the number before the multiply sign
                       After_operator=equation.substring(i+1);// getting the number after the multiply sign
                       base_sum=(Double.parseDouble(Before_operator)*Double.parseDouble(After_operator));
                       total=total+base_sum;
                       // to multiply the numbers in the equation
                   }
                   break;

               }


          }

          //total= Math.round(total*100.0)/100.0;// round of decimals
        Pre_Sum.setText(equation);// the previous equation must show here
        Answer.setText("= "+total);
        equation= Double.toString(total) ;// converting a double to a string

        Sum.setText(equation);// to change the output

    }

    @FXML protected void onClear(){ // clearing everything out
      equation="";
      Sum.setText("");

       Answer.setText("");
       Pre_Sum.setText("");
    }
    @FXML protected void onDelete(){
     equation=equation.substring(0,equation.length()-1);// to delete the last character in the string
        Sum.setText(equation);// output the new deleted value
    }
    @FXML protected void onDot(){
        equation=equation+".";
        Sum.setText(equation);
    }


}





