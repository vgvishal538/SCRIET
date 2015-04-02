package app.com.vishal.scriet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DepartmentActivity extends ActionBarActivity {
 ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] {"COMPUTER SCIENCE",
                "INFORMATION TECHNOLOGY",
                "CHEMICAL ENGINEERING",
                "ELECTRONICS & COMMUNICATION",
                "ELECTRONICS & INSTRUMENTATION",
                "MECHANICAL ENGINEERING",
                "AGRICULTURAL ENGINEERING",
                "APPLIED SCIENCE",
                "M.B.A & M.C.A",



        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
             if (position==0) {
                 Intent myIntent = new Intent(view.getContext(), CsActivity.class);
                 startActivityForResult(myIntent, 0);
             }
             if (position==1){
                 Intent myIntent = new Intent(view.getContext(),ItActivity.class);
                 startActivityForResult(myIntent,0);
             }
               if (position==2) {
                   Intent myIntent = new Intent(view.getContext(), ChActivity.class);
                   startActivityForResult(myIntent, 0);
               }
                if (position==3) {
                    Intent myIntent = new Intent(view.getContext(), EcActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==4){
                    Intent myIntent = new Intent(view.getContext(),EiActivity.class);
                    startActivityForResult(myIntent,0);
                }
                if (position==5) {
                    Intent myIntent = new Intent(view.getContext(), MeActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==6) {
                    Intent myIntent = new Intent(view.getContext(), AgActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==7) {
                    Intent myIntent = new Intent(view.getContext(), AsActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==8){
                    Intent myIntent = new Intent(view.getContext(),MbaActivity.class);
                    startActivityForResult(myIntent,0);
                }
                }
                });
                }
             }

