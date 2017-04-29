package uk.co.mandilee.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FindMusic extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_music);

        Button btnNowPlaying = (Button) findViewById(R.id.now_playing);

        btnNowPlaying.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextActivity = null;
        switch (v.getId()) {
            case R.id.now_playing:
                nextActivity = new Intent(this, NowPlaying.class);
                break;
        }

        if (nextActivity != null) {
            startActivity(nextActivity);
        }
    }
}
