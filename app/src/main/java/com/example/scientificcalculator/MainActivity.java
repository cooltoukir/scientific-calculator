package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button btn_sinh, btn_cosh, btn_tanh, btn_log, btn_ln, btn_sin, btn_cos, btn_tan, btn_root, btn_power, btn_7, btn_8, btn_9, btn_del, btn_ac, btn_4, btn_5, btn_6, btn_add, btn_sub, btn_1, btn_2, btn_3, btn_mul, btn_div, btn_0, btn_point, btn_equal;

    double a, numone, numtwo;

    boolean msinh, mcosh, mtanh, msin, mcos, mtan, mpower, mArithmetic, madd, msub, mmul, mdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);

        btn_sinh = (Button)findViewById(R.id.btn_sinh);
        btn_cosh = (Button)findViewById(R.id.btn_cosh);
        btn_tanh = (Button)findViewById(R.id.btn_tanh);
        btn_log = (Button)findViewById(R.id.btn_log);
        btn_ln = (Button)findViewById(R.id.btn_ln);
        btn_sin = (Button)findViewById(R.id.btn_sin);
        btn_cos = (Button)findViewById(R.id.btn_cos);
        btn_tan = (Button)findViewById(R.id.btn_tan);
        btn_root = (Button)findViewById(R.id.btn_root);
        btn_power = (Button)findViewById(R.id.btn_power);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_del = (Button)findViewById(R.id.btn_del);
        btn_ac = (Button)findViewById(R.id.btn_ac);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_mul = (Button)findViewById(R.id.btn_mul);
        btn_div = (Button)findViewById(R.id.btn_div);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_point = (Button)findViewById(R.id.btn_point);
        btn_equal = (Button)findViewById(R.id.btn_equal);


    }

    public void method_sinh(View view) {
        try {
            a = Math.sinh(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("sin⁻¹");
        msinh = true;
    }


    public void method_cosh(View view) {
        try {
            a = Math.cosh(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("Cos⁻¹");
        mcosh = true;
    }

    public void method_tanh(View view) {
        try {
            a = Math.tanh(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("Tan⁻¹");
        mtanh = true;
    }

    public void method_log(View view) {
        try {
            a = Math.log(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_ln(View view) {
        try {
            a = Double.parseDouble(display.getText().toString());
            double result = (-Math.log(1-a))/a;
            display.setText("");
            display.setText(display.getText().toString() + result);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_sin(View view) {
        try {
            a = Math.sin(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("Sin");
        msin = true;
    }

    public void method_cos(View view) {
        try {
            a = Math.cos(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("Cos");
        mcos = true;
    }

    public void method_tan(View view) {
        try {
            a = Math.tan(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
        display.setText("Tan");
        mtan = true;
    }

    public void method_root(View view) {
        try {
            a = Math.sqrt(Double.parseDouble(display.getText().toString()));
            display.setText("");
            display.setText(display.getText().toString() + a);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_power(View view) {
        try {
            numone = Double.parseDouble(display.getText() + "");
            mpower = true;
            display.setText(null);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_7(View view) {
        display.setText(display.getText() + "7");
        mArithmetic = true;
    }

    public void method_8(View view) {
        display.setText(display.getText() + "8");
        mArithmetic = true;
    }

    public void method_9(View view) {
        display.setText(display.getText() + "9");
        mArithmetic = true;
    }

    public void method_del(View view) {
        try {
            String str;
            str = display.getText().toString();
            str = str.substring(0, str.length()-1);
            display.setText(str);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_ac(View view) {
        display.setText("");
    }

    public void method_4(View view) {
        display.setText(display.getText() + "4");
        mArithmetic = true;
    }

    public void method_5(View view) {
        display.setText(display.getText() + "5");
        mArithmetic = true;
    }

    public void method_6(View view) {
        display.setText(display.getText() + "6");
        mArithmetic = true;
    }

    public void method_add(View view) {
        try {
            numone = Double.parseDouble(display.getText() + "");
            madd = true;
            display.setText(null);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_sub(View view) {
        try {
            numone = Double.parseDouble(display.getText() + "");
            msub = true;
            display.setText(null);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_1(View view) {
        display.setText(display.getText() + "1");
        mArithmetic = true;
    }

    public void method_2(View view) {
        display.setText(display.getText() + "2");
        mArithmetic = true;
    }

    public void method_3(View view) {
        display.setText(display.getText() + "3");
        mArithmetic = true;
    }

    public void method_mul(View view) {
        try {
            numone = Double.parseDouble(display.getText() + "");
            mmul = true;
            display.setText(null);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_div(View view) {
        try {
            numone = Double.parseDouble(display.getText() + "");
            mdiv = true;
            display.setText(null);
        }
        catch (Exception e)
        {
            display.setText("Scientific error");
        }
    }

    public void method_0(View view) {
        display.setText(display.getText() + "0");
        mArithmetic = true;
    }

    public void method_point(View view) {
        display.setText(display.getText() + ".");
    }

    public void method_equal(View view) {
        if (msin == true) {
            if (mArithmetic == true) {
                String str;
                str = display.getText().toString();
                str = str.substring(3);
                a = Math.sin(Double.parseDouble(str));
                display.setText(a + "");
                mArithmetic = false;
                msin = false;
            }
        }
        if (mcos == true) {
            if (mArithmetic == true) {
                String str;
                str = display.getText().toString();
                str = str.substring(3);
                a = Math.cos(Double.parseDouble(str));
                display.setText(a + "");
                mArithmetic = false;
                mcos = false;
            }
        }
        if (mtan == true) {
            if (mArithmetic == true) {
                String str;
                str = display.getText().toString();
                str = str.substring(3);
                a = Math.sin(Double.parseDouble(str));
                display.setText(a + "");
                mArithmetic = false;
                mtan = false;
            }
        }
        if (msinh == true) {
            if (mArithmetic == true) {
                String str;
                str = display.getText().toString();
                str = str.substring(5);
                a = Math.sinh(Double.parseDouble(str));
                display.setText(a + "");
                mArithmetic = false;
                msinh = false;
            }

        }
        if(mcosh==true){
            if(mArithmetic==true){
                String str;
                str = display.getText().toString();
                str = str.substring(5);
                a = Math.cosh(Double.parseDouble(str));
                display.setText(a+"");
                mArithmetic=false;
                mcosh=false;
            }

        }
        if(mtanh==true){
            if(mArithmetic==true){
                String str;
                str = display.getText().toString();
                str = str.substring(5);
                a = Math.cosh(Double.parseDouble(str));
                display.setText(a+"");
                mArithmetic=false;
                mtanh=false;
            }
        }
        if (mpower == true){
            numtwo = Double.parseDouble(display.getText() + "");
            int exp = (int) Math.pow(numone, numtwo);
            display.setText(exp+"");
            mpower=false;
        }
        if (madd == true){
            numtwo = Double.parseDouble(display.getText() + "");
            display.setText(numone + numtwo +"");
            madd=false;
        }
        if (msub == true){
            numtwo = Double.parseDouble(display.getText() + "");
            display.setText(numone - numtwo+"");
            msub=false;
        }
        if (mmul == true){
            numtwo = Double.parseDouble(display.getText() + "");
            display.setText(numone * numtwo+"");
            mmul=false;
        }
        if (mdiv == true){
            numtwo = Double.parseDouble(display.getText() + "");
            display.setText(numone / numtwo+"");
            mdiv=false;
        }
    }
}
