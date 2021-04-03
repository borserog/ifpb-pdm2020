package br.com.borserog.ifpb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class IfpbReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val activityIntent = Intent(context, MainActivity::class.java)
        context.startActivity(activityIntent)
    }
}