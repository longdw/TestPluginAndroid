package com.david.testpluginandroid;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

/**
 * @author longdw
 * 2019-08-28 15:31
 * www.longdw.com
 */
public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.other_activity);

        FrameLayout rootView = findViewById(R.id.container);


        FlutterView flutterView = Flutter.createView(this, getLifecycle(), "route");

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        rootView.addView(flutterView, layoutParams);
    }
}
