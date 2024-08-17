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
import android.widget.EditText;
import android.widget.RadioButton;
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

        //获取EditText控件，通过其ID引用它
        EditText etName=findViewById(R.id.etName);

        //获取两个RadioButton控件，通过其ID引用它
        RadioButton rbMan=findViewById(R.id.btnMan);
        RadioButton rbWoman=findViewById(R.id.btnWoman);

        //获取四个CheckBox控件，通过其ID引用它
        CheckBox cbMusic = findViewById(R.id.cbMusic);
        CheckBox cbSport = findViewById(R.id.cbSport);
        CheckBox cbSwim = findViewById(R.id.cbSwim);
        CheckBox cbRead = findViewById(R.id.cbRead);

        //获取提交的Button控件，通过其ID引用它
        Button btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            boolean ischeck=false;
            @Override
            public void onClick(View v) {
                if(rbMan.isChecked()){
                    selectedOption1="男";//更新性别按钮显示为男
                }
                if(rbWoman.isChecked()){
                    selectedOption1="女";//更新性别按钮显示为女
                }
                if (cbMusic.isChecked()) {
                    Option1="音乐";//更新点击音乐选项显示内容
                }else{
                    Option1="";
                }
                if (cbSport.isChecked()) {
                    Option2="运动";//更新点击运动选项显示内容
                }else{
                    Option2="";
                }
                if (cbSwim.isChecked()) {
                    Option3="游泳";//更新点击游泳选项显示内容
                }else {
                    Option3="";
                }
                if (cbRead.isChecked()) {
                    Option4="阅读";//更新点击阅读选项显示内容
                }else{
                    Option4="";
                }
                //弹出实验室考核作业要求的Toast
                Toast.makeText(getApplicationContext(), "你好，" + etName.getText() + "\n你的性别是："+selectedOption1+"\n你的个人爱好有："+Option1+","+Option2+","+Option3+","+Option4+"!", Toast.LENGTH_LONG).show();
            }
        });

        //获取取消Button控件，通过其ID引用它
        Button btnCancel=findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 结束当前活动并返回到前一个活动
                finish();
            }
        });
    }
}