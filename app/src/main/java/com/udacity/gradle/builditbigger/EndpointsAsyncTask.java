package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.support.v4.util.Pair;

import com.example.lucas.myapplication.backend.myApi.MyApi;
import com.example.lucas.myapplication.backend.myApi.model.MyBean;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by lucas on 19/02/17.
 */

public class EndpointsAsyncTask extends AsyncTask<Pair<OnTaskCompleted, String>, Void, String> {
    private static MyApi myApiService = null;
    private OnTaskCompleted listener;

    @Override
    protected String doInBackground(Pair<OnTaskCompleted, String>... params) {

        listener = params[0].first;

        if(myApiService == null) {  // Only do this once

            MyApi.Builder builder =  new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://192.168.0.18:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            myApiService = builder.build();


        }

        String result = null;

        try {
            result = myApiService.getJokes().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        listener.onTaskCompleted(s);
    }
}
