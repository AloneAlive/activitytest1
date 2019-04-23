package com.example.ts.activitytest1;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
    管理Activity
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    /*
    添加activity到list
     */
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    /*
    從list移除activity
     */
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    /*
    銷燬所有activity，並且清空list
     */
    public static void finishAll() {
        for (Activity activity : activities) {
            activity.finish();
        }
        activities.clear();
    }
}
