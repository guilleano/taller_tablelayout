package com.example.android.tallertabletlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Repot2 extends AppCompatActivity {
      String marca;
      int cap;
      int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repot2);
    }

    public void mostrar(){
        for (int i = 0; i < databaseList().length; i++) {
            if ((marca=="samsumg") && (cap>2 && cap<4)){
               cont++;
            }
            
        }
    }
}
