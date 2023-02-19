package com.example.h1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    View view2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, enter, add, sub, mul, div, clear, del, perc, dec;
    Button Ans; ImageButton history, swap;
    TextView txt, txt1, txt2;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, substract = false, multiply = false, divide = false, percent = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);
        del = findViewById(R.id.delete);
        perc = findViewById(R.id.percent);
        div = findViewById(R.id.divine);
        b7 = findViewById(R.id.num7);
        b8 = findViewById(R.id.num8);
        b9 = findViewById(R.id.num9);
        mul = findViewById(R.id.multiply);
        b4 = findViewById(R.id.num4);
        b5 = findViewById(R.id.num5);
        b6 = findViewById(R.id.num6);
        sub = findViewById(R.id.minus);
        b1 = findViewById(R.id.num1);
        b2 = findViewById(R.id.num2);
        b3 = findViewById(R.id.num3);
        add = findViewById(R.id.add);
        Ans = findViewById(R.id.btans);
        b0 = findViewById(R.id.num0);
        dec = findViewById(R.id.decimal);
        enter = findViewById(R.id.equal);

        txt = findViewById(R.id.txt);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        history = findViewById(R.id.history);
        swap = findViewById(R.id.swap);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "1");
                txt1.setText(txt1.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "2");
                txt1.setText(txt1.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "3");
                txt1.setText(txt1.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "4");
                txt1.setText(txt1.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "5");
                txt1.setText(txt1.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "6");
                txt1.setText(txt1.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "7");
                txt1.setText(txt1.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "8");
                txt1.setText(txt1.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "9");
                txt1.setText(txt1.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "0");
                txt1.setText(txt1.getText() + "0");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + ".");
                txt1.setText(txt1.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "+");
                setVar1();
                addition = true;
                txt1.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "-");
                setVar1();
                substract = true;
                txt1.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "*");
                setVar1();
                multiply = true;
                txt1.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "/");
                setVar1();
                divide = true;
                txt1.setText("");
            }
        });

        perc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                txt.setText(txt.getText() + "%");
                percent = true;
                txt1.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
            }
        });

        Ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt2.getText());
                txt.setText(txt.getText() + "" + txt1.getText());
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Double.parseDouble(txt1.getText().toString());
                if (addition) {
                    ans = var1 + var2;
                } else if (substract) {
                    ans = var1 - var2;
                } else if (multiply) {
                    ans = var1 * var2;
                } else if (divide) {
                    ans = var1 / var2;
                } else if (percent) {
                    ans = var1 * 0.01;
                } else {
                    ans = ans + 0;
                }
                txt2.setText(ans.toString());
                txt.setText(txt.getText() + "=" + txt2.getText() + ";  ");
                txt1.setText("");
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentOrientation = getResources().getConfiguration().orientation;
                if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                } else {
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String cal = txt.getText().toString();
                Intent intent = new Intent(getApplicationContext(), History.class);
                intent.putExtra("cal1", cal + ";  ");
                startActivity(intent);
            }
        });
    }


    public void setVar1() {
        var1 = Double.parseDouble(txt1.getText().toString());
    }

    public void allReset() {
        txt1.setText("");
        txt2.setText("");
        txt.setText("");
    }

}

