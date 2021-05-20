package com.example.limbe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Basic_info;
    private Button Login;
    private int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Basic_info=(TextView)findViewById(R.id.tvBasic_info);
        Login=(Button)findViewById(R.idbtnLogin);
        Info.setText("No of attempts remaining:3")

        Login.setOnClickListener(new View.OnClickListner()
        {
            @override
            public void onClick(View view)
            {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        }

    };
    private void validate(String userName,String userPassword)
    {
        if((userName=="Eric")&&(userPassword=="embarambamba"))
        {
            Intent intent=new_intent(mainActivity.this,secondActivity.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            Info.setText("no of attempts remaining:"+String.valueOf(counter));
            if(counter==0)
            {
                Login.setEnabled(false);
            }
        }


    }
}

