package com.tuoren.qqtoletter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String s;
    private String one;
    private String two;
    private String three;
    private String ten;
    private String nine;
    private String eight;
    private String seven;
    private String six;
    private String five;
    private String four;
    private String letterOne;
    private String letterTwo;
    private String letterThree;
    private String letterFour;
    private String letterFive;
    private String letterSix;
    private String letterSeven;
    private String letterEight;
    private String letterNine;
    private String letterTen;

    ComponentName mAdminName;
    DevicePolicyManager mDPM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //锁屏代码

        mAdminName = new ComponentName(this, AdminManageReceiver.class);
        mDPM = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);

        if (!mDPM.isAdminActive(mAdminName)) {
            showAdminManagement(mAdminName);
        }

        EditText qq = findViewById(R.id.accountEdit);
        Button QqToLe = findViewById(R.id.QQToLetter);
        TextView show = (TextView) findViewById(R.id.tv_showLetter);
        Editable text = qq.getText();
        QqToLe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = text.toString();
                int length = s.length();
                Log.d("MainActivity", "onClick: " + length);
//                for (int i = 0; i < length; i++) {
//                    String substring = s.substring(0, length);
//                    Log.d("MainActivity", "onClick: " + substring);
//                }
                if (s.length() > 0) {
                    one = s.substring(0,1);
                }

                if (s.length() > 1) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                }

                if (s.length() > 2) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                }

                if (s.length() > 3) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                }

                if (s.length() > 4) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                }

                if (s.length() > 5) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                    six = s.substring(5,6);
                }

                if (s.length() > 6) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                    six = s.substring(5,6);
                    seven = s.substring(6,7);
                }

                if (s.length() > 7) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                    six = s.substring(5,6);
                    seven = s.substring(6,7);
                    eight = s.substring(7,8);
                }

                if (s.length() > 8) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                    six = s.substring(5,6);
                    seven = s.substring(6,7);
                    eight = s.substring(7,8);
                    nine = s.substring(8,9);
                }

                if (s.length() > 9) {
                    one = s.substring(0,1);
                    two = s.substring(1,2);
                    three = s.substring(2,3);
                    four = s.substring(3,4);
                    five = s.substring(4,5);
                    six = s.substring(5,6);
                    seven = s.substring(6,7);
                    eight = s.substring(7,8);
                    nine = s.substring(8,9);
                    ten = s.substring(9,10);
                }

                if (one != null) {
                    switch (one) {
                        case "0":
                            letterOne = "a";
                            break;
                        case "1":
                            letterOne = "b";
                            break;
                        case "2":
                            letterOne = "c";
                            break;
                        case "3":
                            letterOne = "d";
                            break;
                        case "4":
                            letterOne = "e";
                            break;
                        case "5":
                            letterOne = "f";
                            break;
                        case "6":
                            letterOne = "g";
                            break;
                        case "7":
                            letterOne = "h";
                            break;
                        case "8":
                            letterOne = "i";
                            break;
                        case "9":
                            letterOne = "j";
                            break;
                        default:
                            break;
                    }
                }

                if (two != null) {
                    switch (two) {
                        case "0":
                            letterTwo = "a";
                            break;
                        case "1":
                            letterTwo = "b";
                            break;
                        case "2":
                            letterTwo = "c";
                            break;
                        case "3":
                            letterTwo = "d";
                            break;
                        case "4":
                            letterTwo = "e";
                            break;
                        case "5":
                            letterTwo = "f";
                            break;
                        case "6":
                            letterTwo = "g";
                            break;
                        case "7":
                            letterTwo = "h";
                            break;
                        case "8":
                            letterTwo = "i";
                            break;
                        case "9":
                            letterTwo = "j";
                            break;
                        default:
                            break;
                    }
                }

                if (three != null) {
                    switch (three) {
                        case "0":
                            letterThree = "a";
                            break;
                        case "1":
                            letterThree = "b";
                            break;
                        case "2":
                            letterThree = "c";
                            break;
                        case "3":
                            letterThree = "d";
                            break;
                        case "4":
                            letterThree = "e";
                            break;
                        case "5":
                            letterThree = "f";
                            break;
                        case "6":
                            letterThree = "g";
                            break;
                        case "7":
                            letterThree = "h";
                            break;
                        case "8":
                            letterThree = "i";
                            break;
                        case "9":
                            letterThree = "j";
                            break;
                        default:
                            break;
                    }
                }

                if (four != null) {
                    switch (four) {
                        case "0":
                            letterFour = "k";
                            break;
                        case "1":
                            letterFour = "l";
                            break;
                        case "2":
                            letterFour = "m";
                            break;
                        case "3":
                            letterFour = "n";
                            break;
                        case "4":
                            letterFour = "o";
                            break;
                        case "5":
                            letterFour = "p";
                            break;
                        case "6":
                            letterFour = "q";
                            break;
                        case "7":
                            letterFour = "r";
                            break;
                        case "8":
                            letterFour = "s";
                            break;
                        case "9":
                            letterFour = "t";
                            break;
                        default:
                            break;
                    }
                }

                if (five != null) {
                    switch (five) {
                        case "0":
                            letterFive = "k";
                            break;
                        case "1":
                            letterFive = "l";
                            break;
                        case "2":
                            letterFive = "m";
                            break;
                        case "3":
                            letterFive = "n";
                            break;
                        case "4":
                            letterFive = "o";
                            break;
                        case "5":
                            letterFive = "p";
                            break;
                        case "6":
                            letterFive = "q";
                            break;
                        case "7":
                            letterFive = "r";
                            break;
                        case "8":
                            letterFive = "s";
                            break;
                        case "9":
                            letterFive = "t";
                            break;
                        default:
                            break;
                    }
                }

                if (six != null) {
                    switch (six) {
                        case "0":
                            letterSix = "k";
                            break;
                        case "1":
                            letterSix = "l";
                            break;
                        case "2":
                            letterSix = "m";
                            break;
                        case "3":
                            letterSix = "n";
                            break;
                        case "4":
                            letterSix = "o";
                            break;
                        case "5":
                            letterSix = "p";
                            break;
                        case "6":
                            letterSix = "q";
                            break;
                        case "7":
                            letterSix = "r";
                            break;
                        case "8":
                            letterSix = "s";
                            break;
                        case "9":
                            letterSix = "t";
                            break;
                        default:
                            break;
                    }
                }

                if (seven != null) {
                    switch (seven) {
                        case "0":
                            letterSeven = "u";
                            break;
                        case "1":
                            letterSeven = "v";
                            break;
                        case "2":
                            letterSeven = "w";
                            break;
                        case "3":
                            letterSeven = "x";
                            break;
                        case "4":
                            letterSeven = "y";
                            break;
                        case "5":
                            letterSeven = "z";
                            break;
                        case "6":
                            letterSeven = "a";
                            break;
                        case "7":
                            letterSeven = "b";
                            break;
                        case "8":
                            letterSeven = "c";
                            break;
                        case "9":
                            letterSeven = "d";
                            break;
                        default:
                            break;
                    }
                }

                if (eight != null) {
                    switch (eight) {
                        case "0":
                            letterEight = "u";
                            break;
                        case "1":
                            letterEight = "v";
                            break;
                        case "2":
                            letterEight = "w";
                            break;
                        case "3":
                            letterEight = "x";
                            break;
                        case "4":
                            letterEight = "y";
                            break;
                        case "5":
                            letterEight = "z";
                            break;
                        case "6":
                            letterEight = "a";
                            break;
                        case "7":
                            letterEight = "b";
                            break;
                        case "8":
                            letterEight = "c";
                            break;
                        case "9":
                            letterEight = "d";
                            break;
                        default:
                            break;
                    }
                }

                if (nine != null) {
                    switch (nine) {
                        case "0":
                            letterNine = "u";
                            break;
                        case "1":
                            letterNine = "v";
                            break;
                        case "2":
                            letterNine = "w";
                            break;
                        case "3":
                            letterNine = "x";
                            break;
                        case "4":
                            letterNine = "y";
                            break;
                        case "5":
                            letterNine = "z";
                            break;
                        case "6":
                            letterNine = "a";
                            break;
                        case "7":
                            letterNine = "b";
                            break;
                        case "8":
                            letterNine = "c";
                            break;
                        case "9":
                            letterNine = "d";
                            break;
                        default:
                            break;
                    }
                }

                if (ten != null) {
                    switch (ten) {
                        case "0":
                            letterTen = "e";
                            break;
                        case "1":
                            letterTen = "f";
                            break;
                        case "2":
                            letterTen = "g";
                            break;
                        case "3":
                            letterTen = "h";
                            break;
                        case "4":
                            letterTen = "i";
                            break;
                        case "5":
                            letterTen = "j";
                            break;
                        case "6":
                            letterTen = "k";
                            break;
                        case "7":
                            letterTen = "l";
                            break;
                        case "8":
                            letterTen = "m";
                            break;
                        case "9":
                            letterTen = "n";
                            break;
                        default:
                            break;
                    }
                }

                if (length == 1) {
                    show.setText(letterOne);
                }

                if (length == 2) {
                    show.setText(letterOne + letterTwo);
                }

                if (length == 3) {
                    show.setText(letterOne + letterTwo + letterThree);
                }

                if (length == 4) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour);
                }

                if (length == 5) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive);
                }

                if (length == 6) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive + letterSix);
                }

                if (length == 7) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive + letterSix + letterSeven);
                }

                if (length == 8) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive + letterSix + letterSeven + letterEight);
                }

                if (length == 9) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive + letterSix + letterSeven + letterEight + letterNine);
                }

                if (length == 10) {
                    show.setText(letterOne + letterTwo + letterThree + letterFour +
                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
                }

//                if (one == null) {
//                    letterOne = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (two == null){
//                    letterTwo = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (three == null){
//                    letterThree = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (four == null){
//                    letterFour = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (five == null){
//                    letterFive = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (six == null){
//                    letterSix = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (seven == null){
//                    letterSeven = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (eight == null){
//                    letterEight = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (nine == null){
//                    letterNine = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else if (ten == null){
//                    letterTen = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                }

//                if (ten == null) {
//                    letterTen = "";
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                } else {
//                    show.setText(letterOne + letterTwo + letterThree + letterFour +
//                            letterFive + letterSix + letterSeven + letterEight + letterNine + letterTen);
//                }
            }
        });
    }

    public void lockScreen(View view){
        if (mDPM.isAdminActive(mAdminName)) {
            mDPM.lockNow();
            //mDPM.resetPassword("123456", 0); // 设置锁屏密码
            //devicePolicyManager.wipeData(0);  恢复出厂设置  (建议大家不要在真机上测试) 模拟器不支持该操作
        }
    }

    private void showAdminManagement(ComponentName mAdminName) {
        Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
        intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, mAdminName);
        intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, "activity device");
        startActivityForResult(intent,1);
    }
}