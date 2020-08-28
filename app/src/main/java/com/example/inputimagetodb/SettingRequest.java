package com.example.inputimagetodb;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SettingRequest extends StringRequest {
    final static private String URL = "http://lincsy.cafe24.com/InputImage.php";

    private Map<String, String> parameters;

    public SettingRequest(String image, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Request", error.getMessage());
            }
        });
        parameters = new HashMap<>();
        parameters.put("image",image);
        parameters.put("id","2");
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}

