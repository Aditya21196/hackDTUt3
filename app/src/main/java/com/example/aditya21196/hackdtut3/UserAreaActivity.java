package com.example.aditya21196.hackdtut3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.example.aditya21196.hackdtut3.MainActivity._Age;
import static com.example.aditya21196.hackdtut3.MainActivity._PhnNo;
import static com.example.aditya21196.hackdtut3.MainActivity._bloodChoice;
import static com.example.aditya21196.hackdtut3.MainActivity._email;
import static com.example.aditya21196.hackdtut3.MainActivity._name;
import static com.example.aditya21196.hackdtut3.MainActivity._rBool;
import static com.example.aditya21196.hackdtut3.MainActivity._sex;
import static com.example.aditya21196.hackdtut3.MainActivity._state;

public class UserAreaActivity extends AppCompatActivity {

    Button bLogout;
    private Firebase mRef;
    String UID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        if(_rBool){
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            if (user != null) {
                //code to store stuff in db and use values here
                UID=user.getUid();
                mRef=new Firebase("https://hackdtut3.firebaseio.com/Users/"+UID);
                addChild("Name",_name);
                addChild("Mail",_email);
                addChild("Age",_Age);
                addChild("Phone",_PhnNo);
                addChild("Sex",_sex);
                addChild("Blood",_bloodChoice);
                addChild("State",_state);

            } else {
                // No user is signed in
            }
        }else{
            //stuff already exists, just read stuff
        }


        Button bLogout = (Button)findViewById(R.id.bLogOut);



        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(UserAreaActivity.this,LoginActivity.class));
            }
        });
    }

    public void addChild(String key,String value){
        Firebase mRefChild = mRef.child(key);
        mRefChild.setValue(value);
    }
}
