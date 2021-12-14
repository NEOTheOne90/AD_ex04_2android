package com.example.project04_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
//1단계: java뷰객체 만들기
    TextView text1, text2;
    //    CheckBox chkAgree;
    Switch swAgree;

    RadioGroup rGroup1;
    RadioButton rdo1, rdo2, rdo3;
    //    Button btnOK;
    ImageView imgAnd;

    Button btnFinish, btnInit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");


        //2단계: xml뷰객체를 java뷰객체에 연결한다(바인딩)
        // 위젯을 변수에 대입
        text1 = (TextView) findViewById(R.id.Text1);
//        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        swAgree = (Switch) findViewById(R.id.swAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdo1 = (RadioButton) findViewById(R.id.Rdo1);
        rdo2 = (RadioButton) findViewById(R.id.Rdo2);
        rdo3 = (RadioButton) findViewById(R.id.Rdo3);

//        btnOK = (Button) findViewById(R.id.BtnOK);
        imgAnd = (ImageView) findViewById(R.id.ImgAnd);

        btnFinish = (Button) findViewById(R.id.btnFinish);
        btnInit = (Button) findViewById(R.id.btnInit);

        //3단계: java뷰객체를 이벤트처리(기능 동작 가능하게 만들기)
        // 동의함 체크박스의 체크가 변경되면
//        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
//                // 체크되면 모두 보이도록 설정
//                if (chkAgree.isChecked() == true) {
//                    text2.setVisibility(android.view.View.VISIBLE);
//                    rGroup1.setVisibility(android.view.View.VISIBLE);
//                    btnOK.setVisibility(android.view.View.VISIBLE);
//                    imgPet.setVisibility(android.view.View.VISIBLE);
//                } else {
//                    text2.setVisibility(android.view.View.INVISIBLE);
//                    rGroup1.setVisibility(android.view.View.INVISIBLE);
//                    btnOK.setVisibility(android.view.View.INVISIBLE);
//                    imgPet.setVisibility(android.view.View.INVISIBLE);
//                }
//            }
//        });
        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (swAgree.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
//                    btnOK.setVisibility(android.view.View.VISIBLE);
                    imgAnd.setVisibility(android.view.View.VISIBLE);
                    btnFinish.setVisibility(android.view.View.VISIBLE);
                    btnInit.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
//                    btnOK.setVisibility(android.view.View.INVISIBLE);
                    imgAnd.setVisibility(android.view.View.INVISIBLE);
                    btnFinish.setVisibility(android.view.View.INVISIBLE);
                    btnInit.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });


        // 선택확인 버튼을 클릭하면
//        btnOK.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//
//                switch (rGroup1.getCheckedRadioButtonId()) {
//                    case R.id.RdoDog:
//                        imgPet.setImageResource(R.drawable.dog);
//                        break;
//                    case R.id.RdoCat:
//                        imgPet.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.RdoRabbit:
//                        imgPet.setImageResource(R.drawable.rabbit);
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT)
//                                .show();
//                }
//            }
//        });

        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.oreo);
            }
        });
        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.pie);
            }
        });
        rdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.qq);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //앱을 종료
                finish();
            }
        });

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(android.view.View.INVISIBLE);
//                    btnOK.setVisibility(android.view.View.INVISIBLE);
                imgAnd.setVisibility(android.view.View.INVISIBLE);
                btnFinish.setVisibility(android.view.View.INVISIBLE);
                btnInit.setVisibility(android.view.View.INVISIBLE);

                //1.스위치 초기화
                swAgree.setChecked(false);
                //2.라디오버튼 초기화
                rGroup1.clearCheck();
                //3.이미지뷰초기화
                imgAnd.setImageResource(0);
            }
        });
    }
}