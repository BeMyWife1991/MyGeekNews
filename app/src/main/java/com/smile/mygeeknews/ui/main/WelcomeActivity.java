package com.smile.mygeeknews.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.smile.mygeeknews.R;

import me.yokeyword.fragmentation.SupportActivity;

public class WelcomeActivity extends SupportActivity {

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            jumpMain();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        handler.sendEmptyMessageDelayed(1, 2000);
    }


    private void jumpMain() {
//        startActivity(new Intent(this, MainForRitrofitActivity.class));
//        startActivity(new Intent(this, MainForRxJavaActivity.class));
        startActivity(new Intent(this, MainForMvpActivity.class));
        finish();
    }

}