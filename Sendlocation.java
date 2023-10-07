package com.example.anti_ragging;
import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class sendlocation extends Activity {
EditText mobileno,message;
ImageButton sendsms;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_sendlocation);
mobileno=(EditText)findViewById(R.id.editText2);
message=(EditText)findViewById(R.id.editText3);
sendsms=(ImageButton)findViewById(R.id.btnSend);
//Performing action on button click
sendsms.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
String no=mobileno.getText().toString();
String msg=message.getText().toString();
//Getting intent and PendingIntent instance
//getApplicationContext() returns context for entire
application(return the process all the activities running inside of)
Intent intent=new Intent(getApplicationContext(),MainActivity.class);
PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0,
intent,0);
//pendingIntent is used to communicate with other applications like
camera,contacts
//Get the SmsManager instance and call the sendTextMessage method to
send message
SmsManager sms=SmsManager.getDefault();
sms.sendTextMessage(no, null, msg, pi,null);
Toast.makeText(getApplicationContext(), "Message Sent successfully!",
Toast.LENGTH_LONG).show();
}
});
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.activity_sendlocation, menu);
return true;
}
}
