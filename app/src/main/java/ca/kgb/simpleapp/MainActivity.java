package ca.kgb.simpleapp;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private AppLibu mAppLibu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAppLibu = ((AppLibu) getApplication());
        mAppLibu.incrementCounter();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAppLibu.incrementCounter();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAppLibu.incrementCounter();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mAppLibu.incrementCounter();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAppLibu.incrementCounter();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAppLibu.incrementCounter();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mAppLibu.incrementCounter();
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mAppLibu.incrementCounter();
        Log.d(TAG, "onRestoreInstanceState: ");
    }

    public void startMainService(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void printCounter(View view) {
        Log.d(TAG, "printCounter: " +  mAppLibu.getCounter());
    }

    public void stopMainService(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}
