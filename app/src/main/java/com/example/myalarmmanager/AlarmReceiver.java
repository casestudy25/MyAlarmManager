package com.example.myalarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class AlarmReceiver extends BroadcastReceiver {
    private final static String TAG = AlarmReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive() call.");

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "myChannel")
                .setSmallIcon(R.mipmap.ic_launcher_round)  // 알람 아이콘
                .setContentTitle("커스텀 알람 제목")  //알람 제목
                .setContentText("응, 여긴 내용이야~")  //알람 내용
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);  //알람 중요도

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(1001, builder.build()); //알람 생성

        Log.i(TAG, "onReceive(): 새로 만들어본 노티피케이션이야.");
    }
}
