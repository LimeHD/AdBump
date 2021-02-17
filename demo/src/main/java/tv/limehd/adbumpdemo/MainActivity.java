package tv.limehd.adbumpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import tv.limehd.adbump.AdBump;
import tv.limehd.adbump.AdBumpInterface;

public class MainActivity extends AppCompatActivity {

    AdBump adBump;
    AdBumpInterface adBumpInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adBump = findViewById(R.id.adBump);
        adBumpInterface = adBump.getWebViewInterface();
        adBumpInterface.loadHtmlFile("https://www.google.com/");
        adBumpInterface.setMusicFile(R.raw.music);
        adBumpInterface.playAndShow();
    }

    public void destroyWebView(View view) {
        adBump.destroyWebView();
    }
}