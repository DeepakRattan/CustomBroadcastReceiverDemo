package com.example.deepakrattan.custombroadcastreceiverdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSendBradcast;
    private EditText edtMsg;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewByID
       /* btnSendBradcast = (Button) findViewById(R.id.btnSendBroadcast);
        edtMsg = (EditText) findViewById(R.id.msg);


        btnSendBradcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("customBroadcast");

                //Getting data from editText
                msg = edtMsg.getText().toString();
                intent.putExtra("message", msg);
                sendBroadcast(intent);
                edtMsg.setText(" ");
            }
        });*/
    }
}
