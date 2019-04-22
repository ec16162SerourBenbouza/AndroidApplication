package com.example.angelatheangel.attempt3;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import java.util.List;
import android.net.Uri;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;

import java.io.IOException;
//the following code is written as guided by google.firebase
public class TextDetectorMain extends AppCompatActivity{

    ImageView imagetaken;
    TextView textgiven;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_detector_main);

        imagetaken= findViewById(R.id.ImageTaken);
        textgiven= findViewById(R.id.detectedtext);


    }
    public void detect(View v){     //method call

        if (bitmap==null){          //if nothing on image
            Toast.makeText(getApplicationContext(),"Bitmap Empty",Toast.LENGTH_SHORT).show();
        }
        else    //if there was something in the image and has been converted to bitmap
        {
            final FirebaseVisionImage firebaseVisionImage= FirebaseVisionImage.fromBitmap(bitmap);

            //following section of code was obtained from the online ML Kit guide provided by Google
            FirebaseVisionTextRecognizer firebaseVisionTextDetector = FirebaseVision.getInstance().getOnDeviceTextRecognizer();
            firebaseVisionTextDetector.processImage(firebaseVisionImage)
                    .addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>(){
                        @Override
                        public void onSuccess(FirebaseVisionText firebaseVisionText){
                            process_text(firebaseVisionText);

                        }
                    });
        }
    }
    private void process_text(FirebaseVisionText firebaseVisionText)
    {


        List<FirebaseVisionText.TextBlock> blocks= firebaseVisionText.getTextBlocks();//textblocks
        if (blocks.size()==0)//no text at all
        {
            Toast.makeText(getApplicationContext(),"No Text Detected",Toast.LENGTH_SHORT).show();

        }
        else
        {
            for( FirebaseVisionText.TextBlock block :firebaseVisionText.getTextBlocks())
            {
                String text = block.getText();//text stored in variable called text
                textgiven.setText(text);//detected text output into textview visible to user
            }
        }
    }

    public void pick_your_image(View v)
    {//allow user to select image and pass image with requested code 1 to next method
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intent,1);

    }
    protected void onActivityResult(int requestedCode, int resultCode, Intent data){
        // method which converts image to bitmap
        super.onActivityResult(requestedCode,resultCode,data);
        if (requestedCode==1 && resultCode== RESULT_OK){
            Uri uri = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                imagetaken.setImageBitmap(bitmap);
            }catch (IOException exception)
            {
                exception.printStackTrace();
            }
        }
    }
}
