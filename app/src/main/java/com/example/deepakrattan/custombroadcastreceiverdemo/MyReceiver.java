package com.example.deepakrattan.custombroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by deepak.rattan on 1/18/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Custom Broadcast", Toast.LENGTH_LONG).show();

        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String message = bundle.getString("message");
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }
}
