package com.app.fiverrtaskproject.utils

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.app.fiverrtaskproject.R

class ShowNotification(
    private val context: Context,
) {

    // Notification channel ID.
    private val CHANNEL_ID = "fiver_task_project"

    // Notification ID.
    private val NOTIFICATION_ID = 1

    fun show(title: String, message: String) {
        // Create the notification channel (required for Android Oreo and above).
        createNotificationChannel(context)

        // Build the notification.
        val notificationBuilder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher) // Set the small icon for the notification.
            .setContentTitle(title) // Set the title of the notification.
            .setContentText(message) // Set the content text of the notification.
            .setPriority(NotificationCompat.PRIORITY_DEFAULT) // Set the priority for the notification.

        // Show the notification.
        val notificationManager = NotificationManagerCompat.from(context)
        if (ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build())
    }

    private fun createNotificationChannel(context: Context) {
        // Check if the device is running Android Oreo or higher.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelName = "fiver_task_channel"
            val importance =
                NotificationManager.IMPORTANCE_DEFAULT // Importance level of the notification channel.
            val notificationChannel =
                NotificationChannel(CHANNEL_ID, channelName, importance).apply {
                    description =
                        "My Channel Description" // Description of the notification channel.
                    enableLights(true) // Enable notification light.
                    lightColor = Color.RED // Set notification light color.
                }

            // Register the notification channel with the system.
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(notificationChannel)
        }
    }
}