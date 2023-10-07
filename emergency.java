package com.example.anti_ragging;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.util.Log;
import android.Manifest;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.Toast;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
public class Emergency extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_emergency);
ImageButton ib = findViewById(R.id.imageButton2);
Button bw = findViewById(R.id.button10);
bw=(Button)findViewById(R.id.button10);
bw.setOnClickListener(new View.OnClickListener(){
@Override

public void onClick(View v) {

Intent
i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
  startActivity(i);
}
}
);
ib.setOnClickListener(new View.OnClickListener() {
@RequiresApi(api = Build.VERSION_CODES.M)
@Override
public void onClick(View v) {
Intent intent0 = new Intent(Intent.ACTION_CALL);
intent0.setData(Uri.parse("tel:8379******"));
if (checkSelfPermission(Manifest.permission.CALL_PHONE) !=
PackageManager.PERMISSION_GRANTED) {
// TODO: Consider calling
// Activity#requestPermissions
// here to request the missing permissions, and then overriding
// public void onRequestPermissionsResult(int requestCode,

String[] permissions,
// int[] grantResults)
// to handle the case where the user grants the permission. See

the documentation
// for Activity#requestPermissions for more details.

return;

}
startActivity(intent0);
}
});
}
}
