package test.com.databindingdemo;

import android.app.Application;

/**
 * Created by yubo on 2018/11/13
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MyApplication getInstance() {
        return instance;
    }
}
