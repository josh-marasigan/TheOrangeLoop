package com.threeamstudios.theorangeloop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* ------- */
/* [Model] */
/* ------- */
public class MainActivity extends Activity {

    // String field for debug purposes.
    private static final String TAG = "OrangeLoop";
	
	// Test Comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        this.setContentView(R.layout.activity_main);

        // Initialize Controls
        // Assign Event Handlers to Controls
        // Establish DataBases and Tables. (Clubs)
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    // Executes with button interaction. Goes to personal user home page
    public void goToHome(View view) {


        Intent transition = new Intent(this, MemberHomePage.class);
        startActivity(transition);
    }

}
