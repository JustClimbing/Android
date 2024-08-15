package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {

    private String selectedOption1 = ""; // 用于记录性别选项中当前选中的选项
    private String Option1="";//代表音乐选项
    private String Option2="";//代表运动选项
    private String Option3="";//代表游泳选项
    private String Option4="";//代表阅读选项
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        //性别按钮群

        RadioGroup radgroup = (RadioGroup) findViewById(R.id.radioGroup);
        //第一种获得单选按钮值的方法
        //为radioGroup设置一个监听器:setOnCheckedChanged()
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = (RadioButton) findViewById(checkedId);
                selectedOption1 = radbtn.getText().toString(); // 更新选中的选项
                Toast.makeText(getApplicationContext(), "按钮组值发生改变,你选了" + radbtn.getText(), Toast.LENGTH_LONG).show();
            }
        });
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;*/


        CheckBox cbmusic = findViewById(R.id.cb_music);
        CheckBox cbsport = findViewById(R.id.cb_swim);
        CheckBox cbSwim = findViewById(R.id.cb_swim);
        CheckBox cbRead = findViewById(R.id.cb_read);

        cbmusic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if (isChecked) {
                    // 处理“游泳”复选框被选中的逻辑

                } else {
                    // 处理“游泳”复选框取消选中的逻辑
                }*/
            }
        });
        cbsport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if (isChecked) {
                    // 处理“游泳”复选框被选中的逻辑
                } else {
                    // 处理“游泳”复选框取消选中的逻辑
                }*/
            }
        });

        cbSwim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if (isChecked) {
                    // 处理“游泳”复选框被选中的逻辑
                } else {
                    // 处理“游泳”复选框取消选中的逻辑
                }*/
            }
        });

        cbRead.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if (isChecked) {
                    // 处理“阅读”复选框被选中的逻辑
                } else {
                    // 处理“阅读”复选框取消选中的逻辑
                }*/
            }
        });
        Button submitButton=findViewById(R.id.btn_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbSwim.isChecked()) {
                    Toast.makeText(MainActivity2.this, "游泳已选择", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity2.this, "游泳未选择", Toast.LENGTH_SHORT).show();
                }
                if (cbmusic.isChecked()) {
                    Toast.makeText(MainActivity2.this, "音乐已选择", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity2.this, "音乐未选择", Toast.LENGTH_SHORT).show();
                }
                if (cbsport.isChecked()) {
                    Toast.makeText(MainActivity2.this, "运动已选择", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity2.this, "运动未选择", Toast.LENGTH_SHORT).show();
                }
                if (cbRead.isChecked()) {
                    Toast.makeText(MainActivity2.this, "阅读已选择", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity2.this, "阅读未选择", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}