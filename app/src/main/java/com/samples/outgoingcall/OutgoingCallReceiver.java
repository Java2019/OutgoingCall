package com.samples.outgoingcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by use on 26.06.17.
 */
public class OutgoingCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL)){
            String phoneNumber = intent.getExtras().getString(Intent.EXTRA_PHONE_NUMBER);
            Toast.makeText(context, "Outgoing number: " + phoneNumber, Toast.LENGTH_SHORT).show();
        }
    }
}
