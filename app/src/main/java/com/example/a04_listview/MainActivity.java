package com.example.a04_listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mainListView;
    private ArrayList<String> dataSource;
    private ArrayAdapter<String> arrayAdapter;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainListView = (ListView) findViewById(R.id.listView);

        dataSource =  new ArrayList<String>();
        dataSource.add("Monday");
        dataSource.add("Tuesday");
        dataSource.add("Wednesday");
        dataSource.add("Thursday");
        dataSource.add("Friday");
        dataSource.add("Saturday");
        dataSource.add("Sunday");

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, dataSource);

        mainListView.setAdapter(arrayAdapter);

        mainListView.setAdapter(arrayAdapter);
        textView = (TextView) findViewById(R.id.textView);
        myOnItemClickListener myOnItemClickListener = new myOnItemClickListener();
        mainListView.setOnItemClickListener(myOnItemClickListener);

    }
    public class myOnItemClickListener implements AdapterView.OnItemClickListener{
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            String selectedItem = (String) parent.getItemAtPosition(position);
            textView.setText(selectedItem);
        }
    }

}