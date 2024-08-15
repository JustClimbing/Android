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
        RadioButton rbMan=findViewById(R.id.btnMan);
        RadioButton rbWoman=findViewById(R.id.btnWoman);

        /*RadioGroup radgroup = (RadioGroup) findViewById(R.id.radioGroup);
        //第一种获得单选按钮值的方法
        //为radioGroup设置一个监听器:setOnCheckedChanged()
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = (RadioButton) findViewById(checkedId);
                selectedOption1 = radbtn.getText().toString(); // 更新选中的选项
                //Toast.makeText(getApplicationContext(), "按钮组值发生改变,你选了" + radbtn.getText(), Toast.LENGTH_LONG).show();测试
            }

        });*/
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;*/


        CheckBox cbmusic = findViewById(R.id.cb_music);
        CheckBox cbsport = findViewById(R.id.cb_swim);
        CheckBox cbSwim = findViewById(R.id.cb_swim);
        CheckBox cbRead = findViewById(R.id.cb_read);


        Button submitButton=findViewById(R.id.btn_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbMan.isChecked()){
                    selectedOption1="男";
                }

                if(rbWoman.isChecked()){
                    selectedOption1="女";
                }

                if (cbSwim.isChecked()) {
                    Option3="游泳";//更新点击游泳选项显示内容
                    //Toast.makeText(MainActivity2.this, "游泳已选择", Toast.LENGTH_SHORT).show();//测试
                }
                if (cbmusic.isChecked()) {
                    Option1="音乐";//Option3="游泳";//更新点击游泳选项显示内容
                    //Toast.makeText(MainActivity2.this, "音乐已选择", Toast.LENGTH_SHORT).show();//测试
                }
                if (cbsport.isChecked()) {
                    Option2="运动";//更新点击运动选项显示内容
                    //Toast.makeText(MainActivity2.this, "运动已选择", Toast.LENGTH_SHORT).show();//测试
                }
                if (cbRead.isChecked()) {
                    Option4="阅读";//更新点击阅读选项显示内容
                    //Toast.makeText(MainActivity2.this, "阅读已选择", Toast.LENGTH_SHORT).show();//测试
                }

                Toast.makeText(getApplicationContext(), "你好," + selectedOption1 + "\n你的性别是："+selectedOption1+"\n你的个人爱好有："+Option1+","+Option2+","+Option3+","+Option4+"!", Toast.LENGTH_LONG).show();

            }
        });


    }



}