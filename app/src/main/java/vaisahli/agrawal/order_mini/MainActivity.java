package vaisahli.agrawal.order_mini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Quantity;
    Button buttonPlus;
    Button Reset;
    Button Order;
    Button buttonMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMinus = findViewById(R.id.button2);
        buttonPlus=findViewById(R.id.button);
        //Quantity = findViewById(R.id.textView4);
        Reset = findViewById(R.id.button4);
        Order=findViewById(R.id.button3)

    }
}
