package com.example.root.corte3v1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * menu navegacion abajo.
         */
        /*BottomNavigationView btnNV = (BottomNavigationView)findViewById(R.id.menuNavegacion);
        btnNV.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mPerfil:
                        Toast.makeText(MainActivity.this,"Perfil",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mconfig:
                        Toast.makeText(MainActivity.this,"Configuracion",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mcerrar:
                        finish();
                        return true;
                }
                return false;
            }
        });*/

        /**
         * Menu PopUp
         */
        /*final Button btnmpop=(Button)findViewById(R.id.btnMpop);
        btnmpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mpop=new PopupMenu(MainActivity.this,btnmpop);
                mpop.getMenuInflater().inflate(R.menu.mis_menus,mpop.getMenu());
                //hacer cosas
                mpop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.mPerfil:
                                Toast.makeText(MainActivity.this,"Perfil",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent().setClass(MainActivity.this,menuEjemplo.class));
                                return true;
                            case R.id.mconfig:
                                Toast.makeText(MainActivity.this,"Configuracion",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.mcerrar:
                                finish();
                                return true;
                        }
                        return false;
                    }
                });
                mpop.show();

            }
        });*/

        final Button btnMF = (Button) findViewById(R.id.btnMF);
        registerForContextMenu(btnMF);
        btnMF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(btnMF);
            }
        });

    }

    /**
     * Menu Flotante
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mis_menus,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.mPerfil:
                Toast.makeText(MainActivity.this,"Perfil",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mconfig:
                Toast.makeText(MainActivity.this,"Configuracion",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mcerrar:
                finish();
                return true;
        }
        return false;
    }



    /**
     * menu arriba-derecha
     */
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mis_menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mPerfil:
                Toast.makeText(MainActivity.this,"Perfil",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mconfig:
                Toast.makeText(MainActivity.this,"Configuracion",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mcerrar:
                finish();
                return true;
        }
        return false;
    }*/

}
