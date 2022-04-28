package com.example.eecofflinetool;

import static java.util.Objects.requireNonNull;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.eecofflinetool.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(requireNonNull(binding.appBarMain).toolbar);

        /*
       setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

*/

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void vutselapdfopen(View v) {

        Intent i = new Intent(getApplicationContext(),PdfView.class);
        i.putExtra("placeholder1","vutsela.pdf");
  startActivity(i);

}

    public void prepaymentopen(View v) {

        Intent i = new Intent(getApplicationContext(),PdfView.class);
        i.putExtra("placeholder1","paymentMeter_merged.pdf");
        startActivity(i);

    }



    public void howtobuy(View v) {

        Intent i = new Intent(getApplicationContext(),PdfView.class);
        i.putExtra("placeholder1","paymentsmaker_merged.pdf");
        startActivity(i);

    }
    public void safetybookletopen(View v){


        Intent i = new Intent(getApplicationContext(),PdfView.class);
        i.putExtra("placeholder1","safetyboklet.pdf");
        startActivity(i);

    }
    public void purchaseorderT (View v){


        Intent i = new Intent(getApplicationContext(),PdfView.class);
        i.putExtra("placeholder1","purchasetandc.pdf");
        startActivity(i);



    }

}