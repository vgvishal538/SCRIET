package app.com.vishal.scriet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Button vc = (Button)findViewById(R.id.button);
        vc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),VcActivity.class);
                startActivityForResult(myIntent,0);
            }
        });
        Button dir =(Button)findViewById(R.id.button2);
        dir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             Intent myIntent = new Intent(v.getContext(),DirectorActivity.class);
               startActivityForResult(myIntent,0);
            }
        });
    }





}
