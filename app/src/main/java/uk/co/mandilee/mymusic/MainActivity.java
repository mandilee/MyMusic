package uk.co.mandilee.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArtistInfo = (Button) findViewById(R.id.artist_info);
        Button btnFindMusic = (Button) findViewById(R.id.find_music);
        Button btnNowPlaying = (Button) findViewById(R.id.now_playing);

        btnArtistInfo.setOnClickListener(this);
        btnFindMusic.setOnClickListener(this);
        btnNowPlaying.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextActivity = null;
        switch (v.getId()) {
            case R.id.artist_info:
                nextActivity = new Intent(this, ArtistInfo.class);
                break;

            case R.id.find_music:
                nextActivity = new Intent(this, FindMusic.class);
                break;

            case R.id.now_playing:
                nextActivity = new Intent(this, NowPlaying.class);
                break;
        }

        if (nextActivity != null) {
            startActivity(nextActivity);
        }
    }
}
