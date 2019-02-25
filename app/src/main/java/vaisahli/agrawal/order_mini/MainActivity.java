package vaisahli.agrawal.order_mini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
    CheckBox whip,choco;
    int  coffee=0;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMinus = findViewById(R.id.button2);
        buttonPlus=findViewById(R.id.button);
        Quantity = findViewById(R.id.textView4);
        Reset = findViewById(R.id.button4);
        Order=findViewById(R.id.button3);
        whip = findViewById(R.id.checkBox);
        choco = findViewById(R.id.checkBox2);

        //int a = Integer.parseInt((Quantity.getText().toString()));
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(coffee>0)
                    coffee--;
                Quantity.setText(String.valueOf(coffee));
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              coffee++;
              Quantity.setText(String.valueOf(coffee));

            }
        });
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=coffee*10;
                if( whip.isChecked() && coffee>0 )
                {
                    total=total+5*coffee;
                }
                if(choco.isChecked()&&coffee>0)
                {
                    total=total+5*coffee;

                }
                if(coffee>0)
                {
                    if(whip.isChecked()&&choco.isChecked())
                    {
                        Toast.makeText(MainActivity.this, " You Have Selected " + String.valueOf(coffee) + " Coffee With Whipped Cream and  Chocolate. Your Bill Is: " + String.valueOf(total), Toast.LENGTH_SHORT).show();
                    }
                    else if(whip.isChecked())
                    {
                        Toast.makeText(MainActivity.this, " You Have Selected " + String.valueOf(coffee) + " Coffee With Whipped Cream. Your Bill Is: " + String.valueOf(total), Toast.LENGTH_SHORT).show();
                    }
                    else if(choco.isChecked())
                    {
                        Toast.makeText(MainActivity.this, " You Have Selected " + String.valueOf(coffee) + " Coffee With Chocolate. Your Bill Is: " + String.valueOf(total), Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "You have selected "+ String.valueOf(coffee) +" with no Toppings.", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(MainActivity.this, "No Cofee selscted.", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=0;
                coffee=0;
                Quantity.setText(String.valueOf(coffee));
                whip.setChecked(false);
                choco.setChecked(false);
            }
        });


    }
}
