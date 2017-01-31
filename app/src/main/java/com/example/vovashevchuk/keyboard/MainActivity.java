package com.example.vovashevchuk.keyboard;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, button11, button12, button13, button14, button21, button22;
    TextView textView;
    Boolean switchDigits = false, switchLanguages = true, switchSymbols = true, switchCases = true;

    String stringNotification = "";
    char firstButton = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                if(switchDigits)
                    encryptionCharacter((char)0);
                else {
                    stringNotification += "0";
                    firstButton = 0;
                }
                break;
            case R.id.button1:
                if(switchDigits)
                    encryptionCharacter((char)1);
                else {
                    if(firstButton == 0)
                        firstButton = 1;
                    else encryptionCharacter((char)1);
                }
                break;
            case R.id.button2:
                if(switchDigits)
                    encryptionCharacter((char)2);
                else {
                    if(firstButton == 0)
                        firstButton = 2;
                    else encryptionCharacter((char)2);
                }
                break;
            case R.id.button3:
                if(switchDigits)
                    encryptionCharacter((char)3);
                else {
                    if(firstButton == 0)
                        firstButton = 3;
                    else encryptionCharacter((char)3);
                }
                break;
            case R.id.button4:
                if(switchDigits)
                    encryptionCharacter((char)4);
                else {
                    if(firstButton == 0)
                        firstButton = 4;
                    else encryptionCharacter((char)4);
                }
                break;
            case R.id.button5:
                if(switchDigits)
                    encryptionCharacter((char)5);
                else {
                    if(firstButton == 0)
                        firstButton = 5;
                    else encryptionCharacter((char)5);
                }
                break;
            case R.id.button6:
                if(switchDigits)
                    encryptionCharacter((char)6);
                else {
                    if(firstButton == 0)
                        firstButton = 6;
                    else encryptionCharacter((char)6);
                }
                break;
            case R.id.button7:
                if(switchDigits)
                    encryptionCharacter((char)7);
                else {
                    if(firstButton == 0)
                        firstButton = 7;
                    else encryptionCharacter((char)7);
                }
                break;
            case R.id.button8:
                if(switchDigits)
                    encryptionCharacter((char)8);
                else {
                    if(firstButton == 0)
                        firstButton = 8;
                    else encryptionCharacter((char)8);
                }
                break;
            case R.id.button9:
                if(switchDigits)
                    encryptionCharacter((char)9);
                else {
                    if(firstButton == 0)
                        firstButton = 9;
                    else encryptionCharacter((char)9);
                }
                break;

            case R.id.button11:   //Кнопка LANGUAGES
                switchDigits = false;
                if (switchLanguages) {
                    Toast.makeText(MainActivity.this, R.string.switch_languages_UKR, Toast.LENGTH_SHORT).show();
                    switchLanguages = false;
                    backgroundButtons();
                }
                else {
                    Toast.makeText(MainActivity.this, R.string.switch_languages_ENG, Toast.LENGTH_SHORT).show();
                    switchLanguages = true;
                    backgroundButtons();
                }
                firstButton = 0;
                break;
            case R.id.button12:   //Кнопка SYMBOLS
                switchDigits = true;
                if(switchSymbols) {
                    Toast.makeText(MainActivity.this, R.string.switch_symbols_DIG, Toast.LENGTH_SHORT).show();
                    switchSymbols = false;
                    backgroundButtons();
                }
                else if(!switchSymbols) {
                    Toast.makeText(MainActivity.this, R.string.switch_symbols_SYM, Toast.LENGTH_SHORT).show();
                    switchSymbols = true;
                    backgroundButtons();
                }
                firstButton = 0;
                break;
            case R.id.button13:   //Кнопка CASES
                if(switchCases) {
                    Toast.makeText(MainActivity.this, R.string.switch_cases_LOW, Toast.LENGTH_SHORT).show();
                    switchCases = false;
                    backgroundButtons();
                }
                else if(!switchCases){
                    Toast.makeText(MainActivity.this, R.string.switch_cases_UPP, Toast.LENGTH_SHORT).show();
                    switchCases = true;
                    backgroundButtons();
                }
                firstButton = 0;
                break;
            case R.id.button14:   //Кнопка SEND
                Toast toast = Toast.makeText(MainActivity.this, R.string.notification_send, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                firstButton = 0;
                break;
            case R.id.button21:   //Кнопка SPACE
                stringNotification += " ";
                firstButton = 0;
                break;
            case R.id.button22:   //Кнопка BACKSPACE
                if(stringNotification.isEmpty())
                    break;
                else stringNotification = stringNotification.substring(0, stringNotification.length()-1);
                firstButton = 0;
                break;
        }
        textView.setText(stringNotification);
    }

    private void startButton() {
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);

        textView = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(MainActivity.this);
        button1.setOnClickListener(MainActivity.this);
        button2.setOnClickListener(MainActivity.this);
        button3.setOnClickListener(MainActivity.this);
        button4.setOnClickListener(MainActivity.this);
        button5.setOnClickListener(MainActivity.this);
        button6.setOnClickListener(MainActivity.this);
        button7.setOnClickListener(MainActivity.this);
        button8.setOnClickListener(MainActivity.this);
        button9.setOnClickListener(MainActivity.this);
        button11.setOnClickListener(MainActivity.this);
        button12.setOnClickListener(MainActivity.this);
        button13.setOnClickListener(MainActivity.this);
        button14.setOnClickListener(MainActivity.this);
        button21.setOnClickListener(MainActivity.this);
        button22.setOnClickListener(MainActivity.this);

        Display display = getWindowManager().getDefaultDisplay();
        int screenWidth = display.getWidth();
        int buttonSize = screenWidth / 4;

        button0.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button1.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button2.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button3.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button4.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button5.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button6.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button7.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button8.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button9.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button11.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button12.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button13.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button14.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button21.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
        button22.setLayoutParams(new LinearLayout.LayoutParams(buttonSize, buttonSize));
    }

    private void backgroundButtons() {
        if(!switchDigits && switchLanguages) {
            button0.setBackgroundResource(R.drawable.ic_digit_0);
            button1.setBackgroundResource(R.drawable.ic_language_eng_1);
            button2.setBackgroundResource(R.drawable.ic_language_eng_2);
            button3.setBackgroundResource(R.drawable.ic_language_eng_3);
            button4.setBackgroundResource(R.drawable.ic_language_eng_4);
            button5.setBackgroundResource(R.drawable.ic_language_eng_5);
            button6.setBackgroundResource(R.drawable.ic_language_eng_6);
            button7.setBackgroundResource(R.drawable.ic_language_eng_7);
            button8.setBackgroundResource(R.drawable.ic_language_eng_8);
            button9.setBackgroundResource(R.drawable.ic_language_eng_9);
        }
        else if(!switchDigits && !switchLanguages) {
            button0.setBackgroundResource(R.drawable.ic_digit_0);
            button1.setBackgroundResource(R.drawable.ic_language_ukr_1);
            button2.setBackgroundResource(R.drawable.ic_language_ukr_2);
            button3.setBackgroundResource(R.drawable.ic_language_ukr_3);
            button4.setBackgroundResource(R.drawable.ic_language_ukr_4);
            button5.setBackgroundResource(R.drawable.ic_language_ukr_5);
            button6.setBackgroundResource(R.drawable.ic_language_ukr_6);
            button7.setBackgroundResource(R.drawable.ic_language_ukr_7);
            button8.setBackgroundResource(R.drawable.ic_language_ukr_8);
            button9.setBackgroundResource(R.drawable.ic_language_ukr_9);
        }
        else if(switchDigits && !switchSymbols) {
            button0.setBackgroundResource(R.drawable.ic_digit_0);
            button1.setBackgroundResource(R.drawable.ic_digit_1);
            button2.setBackgroundResource(R.drawable.ic_digit_2);
            button3.setBackgroundResource(R.drawable.ic_digit_3);
            button4.setBackgroundResource(R.drawable.ic_digit_4);
            button5.setBackgroundResource(R.drawable.ic_digit_5);
            button6.setBackgroundResource(R.drawable.ic_digit_6);
            button7.setBackgroundResource(R.drawable.ic_digit_7);
            button8.setBackgroundResource(R.drawable.ic_digit_8);
            button9.setBackgroundResource(R.drawable.ic_digit_9);
        }
        else if(switchDigits && switchSymbols && switchCases) {
            button0.setBackgroundResource(R.drawable.ic_symbol_00);
            button1.setBackgroundResource(R.drawable.ic_symbol_10);
            button2.setBackgroundResource(R.drawable.ic_symbol_20);
            button3.setBackgroundResource(R.drawable.ic_symbol_30);
            button4.setBackgroundResource(R.drawable.ic_symbol_40);
            button5.setBackgroundResource(R.drawable.ic_symbol_50);
            button6.setBackgroundResource(R.drawable.ic_symbol_60);
            button7.setBackgroundResource(R.drawable.ic_symbol_70);
            button8.setBackgroundResource(R.drawable.ic_symbol_80);
            button9.setBackgroundResource(R.drawable.ic_symbol_90);
        }
        else if(switchDigits && switchSymbols && !switchCases) {
            button0.setBackgroundResource(R.drawable.ic_symbol_01);
            button1.setBackgroundResource(R.drawable.ic_symbol_11);
            button2.setBackgroundResource(R.drawable.ic_symbol_21);
            button3.setBackgroundResource(R.drawable.ic_symbol_31);
            button4.setBackgroundResource(R.drawable.ic_symbol_41);
            button5.setBackgroundResource(R.drawable.ic_symbol_51);
            button6.setBackgroundResource(R.drawable.ic_symbol_61);
            button7.setBackgroundResource(R.drawable.ic_symbol_71);
            button8.setBackgroundResource(R.drawable.ic_symbol_81);
            button9.setBackgroundResource(R.drawable.ic_symbol_91);
        }
    }

    private void encryptionCharacter(char secondButton) {
        if(switchDigits) {   //Переключення з букв на символи/цифри
            if (switchSymbols) {   //Переключення на символи
                switch (secondButton) {
                    case 0:
                        stringNotification += switchCases ? "@" : "=";
                        break;
                    case 1:
                        stringNotification += switchCases ? "." : "_";
                        break;
                    case 2:
                        stringNotification += switchCases ? "(" : "[";
                        break;
                    case 3:
                        stringNotification += switchCases ? ")" : "]";
                        break;
                    case 4:
                        stringNotification += switchCases ? "," : "'";
                        break;
                    case 5:
                        stringNotification += switchCases ? ":" : "/";
                        break;
                    case 6:
                        stringNotification += switchCases ? ";" : "^";
                        break;
                    case 7:
                        stringNotification += switchCases ? "?" : "*";
                        break;
                    case 8:
                        stringNotification += switchCases ? "-" : "+";
                        break;
                    case 9:
                        stringNotification += switchCases ? "!" : "#";
                        break;
                }
            }
            else if (!switchSymbols) {   //Переключення на цифри
                switch (secondButton) {
                    case 0:
                        stringNotification += "0";
                        break;
                    case 1:
                        stringNotification += "1";
                        break;
                    case 2:
                        stringNotification += "2";
                        break;
                    case 3:
                        stringNotification += "3";
                        break;
                    case 4:
                        stringNotification += "4";
                        break;
                    case 5:
                        stringNotification += "5";
                        break;
                    case 6:
                        stringNotification += "6";
                        break;
                    case 7:
                        stringNotification += "7";
                        break;
                    case 8:
                        stringNotification += "8";
                        break;
                    case 9:
                        stringNotification += "9";
                        break;
                }
            }
        }
        else if(!switchDigits) {   //Переключення з символи/цифри на букви
            if(switchLanguages) {   //Вибрана мова англійська
                if(firstButton == 1 && secondButton == 4)
                    stringNotification += switchCases ?"A":"a";
                else if(firstButton == 1 && secondButton == 2)
                    stringNotification += switchCases ?"B":"b";
                else if(firstButton == 2 && secondButton == 1)
                    stringNotification += switchCases ?"C":"c";
                else if(firstButton == 2 && secondButton == 3)
                    stringNotification += switchCases ?"D":"d";
                else if(firstButton == 3 && secondButton == 2)
                    stringNotification += switchCases ?"E":"e";
                else if(firstButton == 3 && secondButton == 6)
                    stringNotification += switchCases ?"F":"f";
                else if(firstButton == 4 && secondButton == 1)
                    stringNotification += switchCases ?"G":"g";
                else if(firstButton == 4 && secondButton == 7)
                    stringNotification += switchCases ?"H":"h";
                else if(firstButton == 4 && secondButton == 5)
                    stringNotification += switchCases ?"I":"i";
                else if(firstButton == 5 && secondButton == 4)
                    stringNotification += switchCases ?"J":"j";
                else if(firstButton == 5 && secondButton == 6)
                    stringNotification += switchCases ?"K":"k";
                else if(firstButton == 5 && secondButton == 1)
                    stringNotification += switchCases ?"L":"l";
                else if(firstButton == 5 && secondButton == 2)
                    stringNotification += switchCases ?"M":"m";
                else if(firstButton == 5 && secondButton == 3)
                    stringNotification += switchCases ?"N":"n";
                else if(firstButton == 5 && secondButton == 7)
                    stringNotification += switchCases ?"O":"o";
                else if(firstButton == 5 && secondButton == 8)
                    stringNotification += switchCases ?"P":"p";
                else if(firstButton == 5 && secondButton == 9)
                    stringNotification += switchCases ?"Q":"q";
                else if(firstButton == 6 && secondButton == 3)
                    stringNotification += switchCases ?"R":"r";
                else if(firstButton == 6 && secondButton == 9)
                    stringNotification += switchCases ?"S":"s";
                else if(firstButton == 6 && secondButton == 5)
                    stringNotification += switchCases ?"T":"t";
                else if(firstButton == 7 && secondButton == 4)
                    stringNotification += switchCases ?"U":"u";
                else if(firstButton == 7 && secondButton == 8)
                    stringNotification += switchCases ?"V":"v";
                else if(firstButton == 8 && secondButton == 7)
                    stringNotification += switchCases ?"W":"w";
                else if(firstButton == 8 && secondButton == 9)
                    stringNotification += switchCases ?"X":"x";
                else if(firstButton == 9 && secondButton == 8)
                    stringNotification += switchCases ?"Y":"y";
                else if(firstButton == 9 && secondButton == 6)
                    stringNotification += switchCases ?"Z":"z";
            }
            else if(!switchLanguages) {   //Вибрана мова українська
                if(firstButton == 1 && secondButton == 4)
                    stringNotification += switchCases ?"А":"а";
                else if(firstButton == 1 && secondButton == 2)
                    stringNotification += switchCases ?"Б":"б";
                else if(firstButton == 1 && secondButton == 5)
                    stringNotification += switchCases ?"В":"в";
                else if(firstButton == 2 && secondButton == 1)
                    stringNotification += switchCases ?"Г":"г";
                else if(firstButton == 2 && secondButton == 3)
                    stringNotification += switchCases ?"Ґ":"ґ";
                else if(firstButton == 2 && secondButton == 4)
                    stringNotification += switchCases ?"Д":"д";
                else if(firstButton == 2 && secondButton == 6)
                    stringNotification += switchCases ?"Е":"е";
                else if(firstButton == 3 && secondButton == 6)
                    stringNotification += switchCases ?"Є":"є";
                else if(firstButton == 3 && secondButton == 2)
                    stringNotification += switchCases ?"Ж":"ж";
                else if(firstButton == 3 && secondButton == 5)
                    stringNotification += switchCases ?"З":"з";
                else if(firstButton == 4 && secondButton == 1)
                    stringNotification += switchCases ?"И":"и";
                else if(firstButton == 4 && secondButton == 7)
                    stringNotification += switchCases ?"І":"і";
                else if(firstButton == 4 && secondButton == 2)
                    stringNotification += switchCases ?"Ї":"ї";
                else if(firstButton == 4 && secondButton == 8)
                    stringNotification += switchCases ?"Й":"й";
                else if(firstButton == 5 && secondButton == 1)
                    stringNotification += switchCases ?"К":"к";
                else if(firstButton == 5 && secondButton == 2)
                    stringNotification += switchCases ?"Л":"л";
                else if(firstButton == 5 && secondButton == 3)
                    stringNotification += switchCases ?"М":"м";
                else if(firstButton == 5 && secondButton == 7)
                    stringNotification += switchCases ?"Н":"н";
                else if(firstButton == 5 && secondButton == 8)
                    stringNotification += switchCases ?"О":"о";
                else if(firstButton == 5 && secondButton == 9)
                    stringNotification += switchCases ?"П":"п";
                else if(firstButton == 6 && secondButton == 3)
                    stringNotification += switchCases ?"Р":"р";
                else if(firstButton == 6 && secondButton == 9)
                    stringNotification += switchCases ?"С":"с";
                else if(firstButton == 6 && secondButton == 2)
                    stringNotification += switchCases ?"Т":"т";
                else if(firstButton == 6 && secondButton == 8)
                    stringNotification += switchCases ?"У":"у";
                else if(firstButton == 7 && secondButton == 4)
                    stringNotification += switchCases ?"Ф":"ф";
                else if(firstButton == 7 && secondButton == 8)
                    stringNotification += switchCases ?"Х":"х";
                else if(firstButton == 7 && secondButton == 5)
                    stringNotification += switchCases ?"Ц":"ц";
                else if(firstButton == 8 && secondButton == 7)
                    stringNotification += switchCases ?"Ч":"ч";
                else if(firstButton == 8 && secondButton == 9)
                    stringNotification += switchCases ?"Ш":"ш";
                else if(firstButton == 8 && secondButton == 4)
                    stringNotification += switchCases ?"Щ":"щ";
                else if(firstButton == 8 && secondButton == 6)
                    stringNotification += switchCases ?"Ь":"ь";
                else if(firstButton == 9 && secondButton == 8)
                    stringNotification += switchCases ?"Ю":"ю";
                else if(firstButton == 9 && secondButton == 6)
                    stringNotification += switchCases ?"Я":"я";
            }
        }

        firstButton = 0;
    }
}