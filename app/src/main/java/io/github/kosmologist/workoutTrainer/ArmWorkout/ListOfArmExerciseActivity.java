package io.github.kosmologist.workoutTrainer.ArmWorkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import io.github.kosmologist.workoutTrainer.AbsWorkout.AbsExerciseActivity;
import io.github.kosmologist.workoutTrainer.AbsWorkout.ListOfAbsExercisesActivity;
import io.github.kosmologist.workoutTrainer.R;

public class ListOfArmExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_arm_exercise);
        final AdView mAdView = findViewById(R.id.adArmView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mAdView.setVisibility(View.VISIBLE);
            }

        });
        Button btnGo = findViewById(R.id.btnArmGO);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfArmExerciseActivity.this,ArmExerciseActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
