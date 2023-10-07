package com.example.anti_ragging;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity
{
@Override
protected void onCreate(Bundle savedInstanceState) {
//saved instance state is used to save and restore the state of an activity
//bundle is used to pass data between activities
//onCreate is used to initialize activity
//saved instance state is a reference to bundle object that passed into
onCreate
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button b1 = (Button) findViewById(R.id.button);
Button b2 = (Button) findViewById(R.id.button2);
Button b3 = (Button) findViewById(R.id.button8);
Button b7 = (Button) findViewById(R.id.button3);
Button b8 = (Button) findViewById(R.id.button4);
Button b9 = (Button) findViewById(R.id.button9);
b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent int1 = new Intent(MainActivity.this, sendlocation.class);
startActivity(int1);
}
});
b2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent int2 = new Intent(MainActivity.this, registration.class);
startActivity(int2);
}
});
b7.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent browserIntent=new Intent(Intent.ACTION_VIEW,

Uri.parse("https://m.facebook.com/SNJH-HHJB-Polytechnic-Anti_Ragging-
103138601289725/?ref=bookmarks"));

startActivity(browserIntent);
}
});
b8.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
  Intent browserIntent1=new Intent(Intent.ACTION_VIEW,
Uri.parse("https://www.instagram.com/?hl=en"));
startActivity(browserIntent1);
}
});
b9.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent int3 = new Intent(MainActivity.this, Emergency.class);
startActivity(int3);
}
});
}
}
