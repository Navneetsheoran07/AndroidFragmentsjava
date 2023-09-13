package com.sheoran.androidfragmentsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText mEditText
                = findViewById(R.id.editText);
        final Button mButton = findViewById(R.id.button);

        // Declaring fragment manager from making data
        // transactions using the custom fragment
        final androidx.fragment.app
                .FragmentManager mFragmentManager
                = getSupportFragmentManager();
        final androidx.fragment.app
                .FragmentTransaction mFragmentTransaction
                = mFragmentManager.beginTransaction();
        final CustomFragment mFragment
                = new CustomFragment();

        // On button click, a bundle is initialized and the
        // text from the EditText is passed in the custom
        // fragment using this bundle
        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override public void onClick(View v)
                    {
                        Bundle mBundle = new Bundle();
                        mBundle.putString(
                                "mText",
                                mEditText.getText().toString());
                        mFragment.setArguments(mBundle);
                        mFragmentTransaction
                                .add(R.id.frameLayout, mFragment)
                                .commit();
                    }
                });
    }
}