package com.udacity.gradle.builditbigger;

import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

public class NonEmptyStringTest extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyStringTest";
    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        // You can test this from androidTest -> Run 'All Tests'
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        final String[] result = {null};
        new EndpointsAsyncTask().execute(new Pair<OnTaskCompleted, String>(new OnTaskCompleted() {
            @Override
            public void onTaskCompleted(String s) {
                result[0] = s;
            }
        }, "Manfred"));
        assertNotNull(result[0]);
    }
} 
