package com.smile.mygeeknews.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.smile.mygeeknews.R;

import me.yokeyword.fragmentation.SupportActivity;

public class WelcomeActivity extends SupportActivity implements View.OnClickListener {

    private TextView tvResult;

    /**
     * 如果你的native方法报错，没关系，配置完成自然会编译通过
     *
     * @param num
     * @return
     */
    public static native int calculate(int num);

    static {
        System.loadLibrary("JniDemo");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button tvMvp = (Button) findViewById(R.id.tv_mvp);
        Button tvRitrofit = (Button) findViewById(R.id.tv_ritrofit);
        Button tvRxJava = (Button) findViewById(R.id.tv_rxJava);
        Button btnJni = (Button) findViewById(R.id.btn_jni);
        tvResult = (TextView) findViewById(R.id.tv_show_jni_result);

        tvMvp.setOnClickListener(this);
        tvRitrofit.setOnClickListener(this);
        tvRxJava.setOnClickListener(this);
        btnJni.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_mvp:
                startActivity(new Intent(this, MainForMvpActivity.class));
                break;
            case R.id.tv_ritrofit:
                startActivity(new Intent(this, MainForRitrofitActivity.class));
                break;
            case R.id.tv_rxJava:
                startActivity(new Intent(this, MainForRxJavaActivity.class));
                break;
            case R.id.btn_jni:
                int calculate = calculate(10);
                tvResult.setText("result: " + calculate);
                break;
        }
    }
}