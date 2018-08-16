package com.kakondey701.kd.kcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    private EditText textArea;
    private Button Clear, Delete, Divide, Multiply, Subtract, Addition, Equal;
    private Button Nine, Eight, Seven, Six, Five, Four, Three, Two, One, Decimal, Zero, Percentage;

    private String enterNumber;
    private double FirstNumber, secondNumber, result;
    String operations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);

        //not letting the keyboard to appear.
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        textArea = (EditText)findViewById(R.id.textField);

        addListenerOnButtons();
    }

    private void addListenerOnButtons()
    {
        Clear = (Button)findViewById(R.id.clear);
        Clear.setOnClickListener(this);

        Delete = (Button)findViewById(R.id.delete);
        Delete.setOnClickListener(this);

        Divide = (Button)findViewById(R.id.divide);
        Divide.setOnClickListener(this);

        Multiply = (Button)findViewById(R.id.multiply);
        Multiply.setOnClickListener(this);

        Subtract = (Button)findViewById(R.id.subtract);
        Subtract.setOnClickListener(this);

        Addition = (Button)findViewById(R.id.addition);
        Addition.setOnClickListener(this);

        Equal = (Button)findViewById(R.id.equal);
        Equal.setOnClickListener(this);

        Nine = (Button)findViewById(R.id.nine);
        Nine.setOnClickListener(this);

        Eight = (Button)findViewById(R.id.eight);
        Eight.setOnClickListener(this);

        Seven = (Button)findViewById(R.id.seven);
        Seven.setOnClickListener(this);

        Six = (Button)findViewById(R.id.six);
        Six.setOnClickListener(this);

        Five = (Button)findViewById(R.id.five);
        Five.setOnClickListener(this);

        Four = (Button)findViewById(R.id.four);
        Four.setOnClickListener(this);

        Three = (Button)findViewById(R.id.three);
        Three.setOnClickListener(this);

        Two = (Button)findViewById(R.id.two);
        Two.setOnClickListener(this);

        One = (Button)findViewById(R.id.one);
        One.setOnClickListener(this);

        Decimal = (Button)findViewById(R.id.decimal);
        Decimal.setOnClickListener(this);

        Zero = (Button)findViewById(R.id.zero);
        Zero.setOnClickListener(this);

        Percentage = (Button)findViewById(R.id.percentage);
        Percentage.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.decimal:
                enterNumber = textArea.getText() + Decimal.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.clear:
                textArea.setText("");
                break;

            case R.id.delete:
                int length = textArea.getText().length();
                if(length > 0)
                {
                    textArea.getText().delete(length-1, length);
                }
                break;

            case R.id.nine:
                enterNumber = textArea.getText() + Nine.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.eight:
                enterNumber = textArea.getText() + Eight.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.seven:
                enterNumber = textArea.getText() + Seven.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.six:
                enterNumber = textArea.getText() + Six.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.five:
                enterNumber = textArea.getText() + Five.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.four:
                enterNumber = textArea.getText() + Four.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.three:
                enterNumber = textArea.getText() + Three.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.two:
                enterNumber = textArea.getText() + Two.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.one:
                enterNumber = textArea.getText() + One.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.zero:
                enterNumber = textArea.getText() + Zero.getText().toString();
                textArea.setText(enterNumber);
                break;

            case R.id.addition:
            FirstNumber = Double.parseDouble(textArea.getText().toString());
            textArea.setText("");
            operations="+";
            break;

            case R.id.multiply:
                FirstNumber = Double.parseDouble(textArea.getText().toString());
                textArea.setText("");
                operations="*";
                break;

            case R.id.subtract:
                FirstNumber = Double.parseDouble(textArea.getText().toString());
                textArea.setText("");
                operations="-";
                break;

            case R.id.divide:
                FirstNumber = Double.parseDouble(textArea.getText().toString());
                textArea.setText("");
                operations="/";
                break;

            case R.id.percentage:
                FirstNumber = Double.parseDouble(textArea.getText().toString());
                textArea.setText("");
                operations="%";
                break;

            case R.id.equal:
                String answer;
                secondNumber = Double.parseDouble(textArea.getText().toString());

                if(operations == "+")
                {
                    result = FirstNumber + secondNumber;
                    answer = String.format("%.0f",result);
                    textArea.setText(answer);
                }
                else if(operations == "-")
                {
                    result = FirstNumber - secondNumber;
                    answer = String.format("%.0f",result);
                    textArea.setText(answer);
                }
                else if(operations == "*")
                {
                    result = FirstNumber * secondNumber;
                    answer = String.format("%.0f",result);
                    textArea.setText(answer);
                }
                else if(operations == "/")
                {
                    if(secondNumber == 0)
                    {
                        Toast.makeText(getApplicationContext(),"Divide Bt Zero! Error!!!",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        result = FirstNumber / secondNumber;
                        answer = String.format("%.0f",result);
                        textArea.setText(answer);
                    }
                }
                else if(operations == "%")
                {
                    result = FirstNumber % secondNumber;
                    answer = String.format("%.0f",result);
                    textArea.setText(answer);
                }
        }
    }
}
