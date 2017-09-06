package com.example.lda.myapplication;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button)findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("没有提示").setTitle("提示");

                builder1.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"确认按钮",Toast.LENGTH_LONG).show();
                    }
                });
                builder1.setNegativeButton("取消",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"取消按钮",Toast.LENGTH_LONG).show();
                    }
                });

                builder1.show();

            }
        });
        Button bt2 =(Button)findViewById(R.id.button2);
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        View view = getLayoutInflater().inflate(R.layout.login,null);
                        final EditText Userid= (EditText)view.findViewById(R.id.Userid);
                        final EditText Password= (EditText)view.findViewById(R.id.Password);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
                        builder2.setView(view)
                                .setTitle("Login")
                                .setPositiveButton("登录",new DialogInterface.OnClickListener(){
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        if(Userid.getText().toString().equals("abc")&&Password.getText().toString().equals("123")){
                                            Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                                        }
                                        else{
                                            Toast.makeText(MainActivity.this,"用户名或密码错误",Toast.LENGTH_LONG).show();
                                        }
                                    }


                                });
                        builder2.show();
                    }
                });



    }
}
