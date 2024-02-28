package com.deep.deepcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText;
    TextView editText2;
    private ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText  = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this,"Wait",Toast.LENGTH_SHORT).show();

                editText2.setText("");
                String edit = editText.getText().toString();

                int number = edit.length();


                if (edit.length()>5) {
                    /////////////////////////////////
                    Encode encode = new Encode(number, editText2, edit);
                    ////////////////////////////

                }else {
                    editText2.setText("Error.C.L");
                }


            }
        });

        ////////////copy button///////////////////

        editText2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("copy",editText2.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity2.this,"copy",Toast.LENGTH_SHORT).show();

                return true;
            }
        });





    }
}