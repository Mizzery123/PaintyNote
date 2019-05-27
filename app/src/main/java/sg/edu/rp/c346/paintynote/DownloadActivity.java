package sg.edu.rp.c346.paintynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DownloadActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        wv = findViewById(R.id.wv);

        wv.setWebViewClient(new WebViewClient());

        String strURL = "https://play.google.com/store/apps/details?id=com.werewolfapps.online&hl=en_SG";

        wv.loadUrl(strURL);
    }
}
