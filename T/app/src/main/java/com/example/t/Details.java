package com.example.t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle b= getIntent().getExtras();
        Pet temp = (Pet) b.getSerializable("from adapter to detail");

        ImageView petLogo = findViewById(R.id.iv1);

        TextView brief = findViewById(R.id.tv2);

        TextView name = findViewById(R.id.tv4);

        LinearLayout phoneLay = findViewById(R.id.lay3);
        TextView phone = findViewById(R.id.tv6);

        LinearLayout emailLay = findViewById(R.id.lay2);
        TextView email = findViewById(R.id.tv8);

        LinearLayout locLay = findViewById(R.id.lay1);
        TextView location = findViewById(R.id.tv10);

        petLogo.setImageResource(temp.getLogo());
        brief.setText(temp.getDescription());
        name.setText(temp.getAnnouncerName());
        phone.setText(temp.getAnnouncerPhone());
        email.setText(temp.getAnnouncerEmail());
        location.setText(temp.getLocation());

        phoneLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+temp.getAnnouncerPhone()));
                startActivity(callIntent);
            }
        });

        emailLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e_mail= new Intent(Intent.ACTION_SENDTO);
                e_mail.putExtra(Intent.EXTRA_EMAIL, temp.getAnnouncerEmail());
                e_mail.putExtra(Intent.EXTRA_SUBJECT, "طلب تبني");
                String body= "يرغب أحدهم بتبني الحيوان الذي عرضته، وسيتواصل معك على الهاتف قريبًا. ";
                e_mail.putExtra(Intent.EXTRA_TEXT, body);
                e_mail.setType("text/plain");
                startActivity(Intent.createChooser(e_mail,"Send email:"));
            }
        });

        locLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+Uri.encode(temp.getLocation()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }
}