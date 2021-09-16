package ru.example.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final static String TEXT = "PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText site = findViewById(R.id.editTextBrowser);
        Button go = findViewById(R.id.buttonGoBrowser);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = site.getText().toString();
                Uri uri = Uri.parse(url);
                Intent browser = new Intent(Intent.ACTION_VIEW, uri);//интент с действием "показать"
                startActivity(browser);
            }
        });
String text2="WASD";
        final EditText text = findViewById(R.id.editText);
        Button runEcho = findViewById(R.id.button);
        runEcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("example://intent");
                Intent runEchoIntent = new Intent(Intent.ACTION_VIEW, uri);
                runEchoIntent.putExtra(TEXT, text2);
                startActivity(runEchoIntent);
            }
        });
    }
}