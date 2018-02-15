package imagecache.ricebeerinc.com.com;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Bitmap bm;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapse_main);



        /*
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.diskCacheStrategy(DiskCacheStrategy.RESOURCE);


        iv = (ImageView) findViewById(R.id.myImage);
        Glide.with(this).load("http://hanassets.nd.gov/images/product/test.png").apply(requestOptions).into(iv);
        */
    }
}
