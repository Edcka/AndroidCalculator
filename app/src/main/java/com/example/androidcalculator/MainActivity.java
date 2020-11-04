package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonChange, buttonDel, buttonClear,
            buttonSqr, buttonDiv, buttonMult, buttonPlus, buttonMinus, buttonDot, buttonRez;

    EditText textCalculation, textRezult;
    Calculator  calculator = new Calculator();
    float x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonChange = (Button) findViewById(R.id.buttonChange);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonSqr = (Button) findViewById(R.id.buttonSqr);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonRez = (Button) findViewById(R.id.buttonRez);

        textCalculation = (EditText) findViewById(R.id.textCalculation);
        textRezult = (EditText) findViewById(R.id.textRezult);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText(textCalculation.getText() + "0");
            }
        });
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable temp = textCalculation.getText();

                if (temp.toString().charAt(0) == ('-')) {
                    temp.delete(0, 1);
                    textCalculation.setText(temp);
                } else {
                    textCalculation.setText("-" + temp);
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalculation.setText("");
                textRezult.setText("");
                x=0;
                y=0;
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonRez.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y = Float.parseFloat(textCalculation.getText().toString());
                        textRezult.append(y + "=" + calculator.Addition(x, y));
                        x = calculator.Addition(x, y);
                        y = 0;
                        textCalculation.setText("");
                    }
                });
                    if(!(textRezult.getText().equals(""))){
                        textRezult.setText(x + "+");

                    }

                    if ((!(textCalculation.getText().equals(""))) && x == 0) {
                        x = Float.parseFloat(textCalculation.getText().toString());
                        textRezult.setText(x + "+");
                        textCalculation.setText("");
                    }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonRez.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y = Float.parseFloat(textCalculation.getText().toString());
                        textRezult.append(y + "=" + calculator.Subraction(x, y));
                        x = calculator.Subraction(x, y);
                        y = 0;
                        textCalculation.setText("");
                    }
                });
                if(!(textRezult.getText().equals(""))){
                    textRezult.setText(x + "-");

                }

                if ((!(textCalculation.getText().equals(""))) && x == 0) {
                    x = Float.parseFloat(textCalculation.getText().toString());
                    textRezult.setText(x + "-");
                    textCalculation.setText("");
                }
            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonRez.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y = Float.parseFloat(textCalculation.getText().toString());
                        textRezult.append(y + "=" + calculator.Multiplication(x, y));
                        x = calculator.Multiplication(x, y);
                        y = 0;
                        textCalculation.setText("");
                    }
                });
                if(!(textRezult.getText().equals(""))){
                    textRezult.setText(x + "*");

                }

                if ((!(textCalculation.getText().equals(""))) && x == 0) {
                    x = Float.parseFloat(textCalculation.getText().toString());
                    textRezult.setText(x + "*");
                    textCalculation.setText("");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonRez.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        y = Float.parseFloat(textCalculation.getText().toString());
                        textRezult.append(y + "=" + calculator.Division(x, y));
                        x = calculator.Division(x, y);
                        y = 0;
                        textCalculation.setText("");
                    }
                });
                if(!(textRezult.getText().equals(""))){
                    textRezult.setText(x + "/");

                }

                if ((!(textCalculation.getText().equals(""))) && x == 0) {
                    x = Float.parseFloat(textCalculation.getText().toString());
                    textRezult.setText(x + "/");
                    textCalculation.setText("");
                }
            }
        });
    }}