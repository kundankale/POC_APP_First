package firstapp.com.poc_app_first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by xcaluser on 7/4/17.
 */

public class WebViewAct extends AppCompatActivity {
    WebView webView;
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activityweb);
        webView = (WebView)findViewById(R.id.webView);
        //webView.loadUrl("https://mybot.hellotars.com/conv/ByMLg8");
        webView.setWebViewClient(new MyWebViewClient());
        openURL();

    }
    private void openURL() {
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("https://mybot.hellotars.com/conv/ByMLg8");

        webView.loadUrl("https://k9f8q.app.goo.gl/");
        webView.requestFocus();
    }
}
