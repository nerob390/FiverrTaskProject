package com.app.fiverrtaskproject.utils

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class SendCloudMessage(
    private val context: Context,
) {

    fun send(token: String, title: String, body: String) {
        val queue = Volley.newRequestQueue(context)
        val url = "https://fcm.googleapis.com/fcm/send"

        val jsonObject = JSONObject()
        jsonObject.put("to", token)

        val data = JSONObject()
        data.put("title", title)
        data.put("body", body)
        jsonObject.put("data", data)

        val request = object : JsonObjectRequest(
            Request.Method.POST, url, jsonObject,
            { response ->
                // Message sent successfully
            },
            { error ->
                // Error sending message
            }) {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["Authorization"] =
                    "Bearer AAAAxVudQv0:APA91bHNEej0ZnZSZfrcgXX7cWOS1B6ucHRk-_GpY-NfnzNzVobcOadLWxwabw4Ra49wahwEPJOZF6eeTtYDMkIrcXiTP2ooDGpsEDQGUbclHXtZUZuDGzFxMRtcPdaK_aq4diddNJOS"
                headers["Content-Type"] = "application/json"
                return headers
            }
        }

        queue.add(request)
    }
}