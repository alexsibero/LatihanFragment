package com.alexsibero.latihanfragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    boolean status = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Meletakkan Atas Fragment pada Fragment Container 1
        AtasFragment af = new AtasFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer1, af).commit();

        // Meletakkan Bawah Fragment pada Fragment Container 2
        BawahFragment bf = new BawahFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer2, bf).commit();










        //        textfragment.setArguments(getIntent().getExtras());
//        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, textfragment).commit();
//
//        Button btn = findViewById(R.id.buttonChange);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(findViewById(R.id.fragmentContainer)!=null) {
//
//                }
//
//                TextFragment textfragment = new TextFragment();
//                textfragment.setArguments(getIntent().getExtras());
//
//                ButtonFragment buttonfragment = new ButtonFragment();
//                buttonfragment.setArguments(getIntent().getExtras());
//
//                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//
//                if(status==false) {
//                    trans.replace(R.id.fragmentContainer, buttonfragment);
//                    status=true;
//                } else {
//                    trans.replace(R.id.fragmentContainer, textfragment);
//                    status = false;
//                }
//                trans.commit();
//            }
//        });
    }
}