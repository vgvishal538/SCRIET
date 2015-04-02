package app.com.vishal.scriet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class GeneralActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);


        Button info =(Button)findViewById(R.id.button_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),InformationActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button hostel =(Button)findViewById(R.id.button_hostel);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),HostelActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
    }



}
