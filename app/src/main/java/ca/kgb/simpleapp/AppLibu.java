package ca.kgb.simpleapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 8/19/2016.
 */
public class AppLibu extends Application {
    private static final String TAG = AppLibu.class.getSimpleName();

    private int counter = 0;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
    public void incrementCounter(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }

}
