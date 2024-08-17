package com.example.myapplication;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       //获取提示的Button控件，通过其ID引用它，按一下出现提示，再按一下提示消失
        Button btnOne = findViewById(R.id.btnOne);
        TextView txtTwo = findViewById(R.id.txtTwo);
        btnOne.setOnClickListener(new View.OnClickListener() {
            boolean isShow = false;//做一个提示按钮标志，实现点击出现和点击消失
            @Override
            public void onClick(View v) {
                if(isShow){
                    txtTwo.setVisibility(View.GONE);
                    isShow = false;
                }else{
                    txtTwo.setVisibility(View.VISIBLE);
                    isShow = true;
                }
            }
        });

        //获取跳转界面的Button控件，通过其ID引用它，按一下跳转到第二个布局界面
        Button btnTwo = findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 创建 Intent 以启动第二个界面 MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}