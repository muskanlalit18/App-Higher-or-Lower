package muskan.myappcompany.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void generateRandom(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void guess(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);
        int enteredNumber = Integer.parseInt(editText.getText().toString());
//        Log.i("Info", "Button pressed!");
//        Log.i("Entered number", Integer.toString(randomNumber));
//        Log.i("Random number", editText.getText().toString());
        String message;
        if (enteredNumber == randomNumber){
            message = "Great! you guessed it! Try again now!";
            generateRandom();

        }
        else if(enteredNumber > randomNumber){
            message = "Lower";

        }
        else if(enteredNumber < randomNumber){
            message = "Higher";
        }
        else{
            message = "Please stay within 1 and 20.";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandom();

    }
}
