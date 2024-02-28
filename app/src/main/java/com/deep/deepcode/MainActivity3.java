package com.deep.deepcode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {


    EditText editText,editText2;
    ImageView button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);

        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sedit = editText.getText().toString();

                int count = sedit.length();
                int dcount = count/5;
                int loop =0;




                if (count%5 ==0){
                    editText2.setText("");

                    if(sedit.length()>24) {
                        ////////////////Decode Class //////////////////
                        Decode decode = new Decode(loop, dcount, editText2, sedit);
                    }else {
                        editText2.setText("Error.C.L");
                    }

                }else {
                    editText2.setText("error");
                }


            }
        });








    }
}