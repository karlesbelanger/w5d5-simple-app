package ca.kgb.simpleapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = MyService.class.getSimpleName();
    private AppLibu mAppLibu;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppLibu = ((AppLibu) getApplication());
        mAppLibu.incrementCounter();
        Log.d(TAG, "onCreate: ");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mAppLibu = ((AppLibu) getApplication());
        Log.d(TAG, "onStartCommand: ");
        mAppLibu.incrementCounter();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mAppLibu = ((AppLibu) getApplication());
        mAppLibu.incrementCounter();
        Log.d(TAG, "onDestroy: ");
    }
}
