package chetan.example.glidesimpledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button mLoadPicassoImageButton;
    Button mLoadGlideImageButton;
    ImageView mGlideImageView;
    ImageView mPicassoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoadGlideImageButton = (Button) findViewById(R.id.loadimageusingglidebutton);
        mLoadPicassoImageButton = (Button) findViewById(R.id.loadimageusingpicassobutton);
        mGlideImageView = (ImageView) findViewById(R.id.glideimageview);
        mPicassoImageView = (ImageView) findViewById(R.id.picassoimageview);
        mLoadPicassoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Picasso.with(MainActivity.this)
                        .load("IMAGE URL HERE")
                        .placeholder(R.drawable.defaultimage)
                        .error(R.drawable.error)
                        .centerCrop()
                        .into(mPicassoImageView);
            }
        });
        mLoadGlideImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(MainActivity.this)
                        .load("IMAGE URL HERE")
                        .placeholder(R.drawable.defaultimage)
                        .error(R.drawable.error)
                        .override(200, 200)
                        .centerCrop()
                        .into(mGlideImageView);

            }
        });
    }
}
