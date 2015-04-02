package app.com.vishal.scriet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abt =(Button)findViewById(R.id.button_about);
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),AboutActivity.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button dep =(Button)findViewById(R.id.button_departments);
        dep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),DepartmentActivity.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button result =(Button)findViewById(R.id.button_result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),ResultsActivity.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button admission =(Button)findViewById(R.id.button_admission);
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),AdmissionActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button contact = (Button)findViewById(R.id.button_contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),ContactActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button gallery = (Button)findViewById(R.id.button_gallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),GalleryActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button adm = (Button)findViewById(R.id.button_general);
        adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),GeneralActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button mess =(Button)findViewById(R.id.button_message);
        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),MessageActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button notice =(Button)findViewById(R.id.button_notice);
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),NoticeActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
    }



}
