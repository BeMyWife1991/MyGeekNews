package com.smile.mygeeknews.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.smile.mygeeknews.R;

import me.yokeyword.fragmentation.SupportActivity;

public class WelcomeActivity extends SupportActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView tvMvp = (TextView) findViewById(R.id.tv_mvp);
        TextView tvRitrofit = (TextView) findViewById(R.id.tv_ritrofit);
        TextView tvRxJava = (TextView) findViewById(R.id.tv_rxJava);

        tvMvp.setOnClickListener(this);
        tvRitrofit.setOnClickListener(this);
        tvRxJava.setOnClickListener(this);

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
        }
    }
}