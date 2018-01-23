package example.codeclan.com.listviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> chocolate = new Chocolate().getList();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.chocolate, chocolate);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
    }
}
