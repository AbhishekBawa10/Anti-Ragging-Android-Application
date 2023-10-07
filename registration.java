package com.example.anti_ragging;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.nio.BufferUnderflowException;
public class registration extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_registration);
Button b3 = (Button) findViewById(R.id.button8);
Button b4 = (Button) findViewById(R.id.button6);
Button b5 = (Button) findViewById(R.id.button7);
Button b6 = (Button) findViewById(R.id.button5);
b3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent int3 = new Intent(registration.this, aboutus.class);
startActivity(int3);
}
});
b4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent browserIntent=new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.antiragging.in/site/affidavits_registration.aspx"));
startActivity(browserIntent);
}
});
b5.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent browserIntent=new Intent(Intent.ACTION_VIEW,
Uri.parse("https://amanmovement.org/registration/public/amanmovement/Affidavit.php#"))
;
startActivity(browserIntent);
}
});
b6.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent browserIntent=new Intent(Intent.ACTION_VIEW,
Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd82Z6n3SvLZLtrXJDIQ-r1LRn6M8-
ha9ln8y5FX1izKQ5K1w/viewform"));
startActivity(browserIntent);
}
});
}
}
