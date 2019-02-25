package vaisahli.agrawal.order_mini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //EditText Quantity;
    TextView Quantity;
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
        Quantity = findViewById(R.id.textView4);
        Reset = findViewById(R.id.button4);
        Order=findViewById(R.id.button3);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(Quantity.getText().toString().trim());
                Quantity.setText(a+1);
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = Integer.parseInt((Quantity.getText().toString().trim()));
                Quantity.setText(b-1);

            }
        });
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "fdfd", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
