package com.wl.mathviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity {

    MathView formula_two;
    MathView formula_one;
    String tex = "This come from string. You can insert inline formula:" +
            " \\(ax^2 + bx + c = 0\\) " +
            "or displayed formula: $$\\sum_{i=0}^n i^2 = \\frac{(n^2+n)(2n+1)}{6}$$";

    String t = "When \\(a \\ne 0\\), there are two solutions to \\(ax^2 + bx + c = 0\\)\n" +
            "        and they are $$x = {-b \\pm \\sqrt{b^2-4ac} \\over 2a}.$$ " +
            "<p>哈哈哈哈 </p><div style='display:none;'>答复对方</div> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formula_one = (MathView) findViewById(R.id.formula_one);
        formula_two = (MathView) findViewById(R.id.formula_two);

        formula_one.setText(t);
    }

    @Override
    protected void onResume() {
        super.onResume();

        formula_two.setText(tex);

    }
}
