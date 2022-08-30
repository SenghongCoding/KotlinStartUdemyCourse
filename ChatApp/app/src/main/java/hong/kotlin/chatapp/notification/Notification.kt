package hong.kotlin.chatapp.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import hong.kotlin.chatapp.Login
import hong.kotlin.chatapp.MainActivity
import hong.kotlin.chatapp.R

class Notification : AppCompatActivity() {

    private val CHANNEL_ID = "Channel_id_example_01"
    private val notificationId = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        var no_btn = findViewById<Button>(R.id.notification)
        createNotificationChannel()

        no_btn.setOnClickListener {
            sendNotification()
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "notification Title"
            val descriptionText = "notification Description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val Channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(Channel)
        }
    }

    private fun sendNotification() {

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        val bitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.notification)
        val bitmapLargIcon =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.account)

        var builder: NotificationCompat.Builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.send)
            .setContentTitle("Example Notification")
            .setContentText("Example Content text")
            .setLargeIcon(bitmapLargIcon)
            .setStyle(
                NotificationCompat.BigTextStyle()
                    .bigText("Hello I am  SENGHONG I want to invite you in meeting this evening ,\nThank you!")
            )
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)) {
            notify(notificationId, builder.build())
        }
    }
}