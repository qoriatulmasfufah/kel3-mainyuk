package id.sch.smktelkom_mlg.project.xirpl103122130.mainyuk_mengenalhewan;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class suaraDuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suara_dua);

        ImageView play = (ImageView) findViewById(R.id.play);

        final MediaPlayer mp = MediaPlayer.create(suaraDuaActivity.this, R.raw.gajah);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        findViewById(R.id.iButtonPilihanA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder AlertBox = new AlertDialog.Builder(suaraDuaActivity.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                AlertBox.setTitle("Opss!");
                AlertBox.setMessage("Hewan ini suaranya bukan seperti itu");
                AlertBox.setNeutralButton("OK", null);
                AlertBox.show();
            }
        });

        findViewById(R.id.iButtonPilihanB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder AlertBox = new AlertDialog.Builder(suaraDuaActivity.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                AlertBox.setTitle("Opss!");
                AlertBox.setMessage("Hewan ini suaranya bukan seperti itu");
                AlertBox.setNeutralButton("OK", null);
                AlertBox.show();
            }
        });

        findViewById(R.id.iButtonPilihanC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder AlertBox = new AlertDialog.Builder(suaraDuaActivity.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth);
                AlertBox.setTitle("Tepat Sekali!");
                AlertBox.setMessage("Coba dengarkan suara yang lain");
                AlertBox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        onBackPressed();
                    }
                });
                AlertBox.show();
            }
        });
    }
}