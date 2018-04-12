package com.android.anhnt.demoviewpager;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by hihi on 4/12/2018.
 */

public class DemoFragment extends Fragment {

    public static final String KEY_COLOR = "key_color";
    public static final String TAG = DemoFragment.class.getSimpleName();

    private View view;
    private LinearLayout linearDemo;

    public DemoFragment() {

    }

    public static DemoFragment getInstance(int color) {
        DemoFragment demoFragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_COLOR, color);
        demoFragment.setArguments(args);
        return demoFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_demo, container, false);
        linearDemo = view.findViewById(R.id.linear_demo);
        ((TextView) view.findViewById(R.id.txt_demo)).setText(R.string.txt_demo);
        view.findViewById(R.id.btn_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: "+ getArguments());
            }
        });

        switch (getArguments().getInt(KEY_COLOR)) {
            case 0:
                linearDemo.setBackgroundColor(Color.CYAN);
                break;
            case 1:
                linearDemo.setBackgroundColor(0xFFFF4081);
                break;
            case 2:
                linearDemo.setBackgroundColor(Color.YELLOW);
                break;
            default:
                break;
        }

        return view;
    }


}
