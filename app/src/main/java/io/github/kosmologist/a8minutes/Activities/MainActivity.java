package io.github.kosmologist.a8minutes.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

import io.github.kosmologist.a8minutes.ArmWorkout.ArmInstructionsActivity;
import io.github.kosmologist.a8minutes.ArmWorkout.ListOfArmExerciseActivity;
import io.github.kosmologist.a8minutes.ButtWorkout.ButtInstructionsActivity;
import io.github.kosmologist.a8minutes.ButtWorkout.ListOfButtExerciseActivity;
import io.github.kosmologist.a8minutes.ClassicWorkout.ClassicInstructionsActivity;
import io.github.kosmologist.a8minutes.ClassicWorkout.ListOfExerciseActivity;
import io.github.kosmologist.a8minutes.LegWorkout.LegInstructionsActivity;
import io.github.kosmologist.a8minutes.LegWorkout.ListOfLegExerciseActivity;
import io.github.kosmologist.a8minutes.R;
import io.github.kosmologist.a8minutes.AbsWorkout.AbsInstructionsActivity;
import io.github.kosmologist.a8minutes.AbsWorkout.ListOfAbsExercisesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get().load(R.drawable.workout).into(imageView);

        ImageView absImage =findViewById(R.id.absImg);
        Picasso.get().load(R.drawable.absworkout).into(absImage);


        ImageView armImage =findViewById(R.id.armImg);
        Picasso.get().load(R.drawable.arms).into(armImage);


        ImageView buttImage =findViewById(R.id.ButtImg);
        Picasso.get().load(R.drawable.butts).into(buttImage);

        ImageView LegImage =findViewById(R.id.legImg);
        Picasso.get().load(R.drawable.legsworkout).into(LegImage);

        android.support.v7.widget.Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("8 MINUTES");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));


        Button btnClassicInstructions =findViewById(R.id.btnInstructions);
        btnClassicInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClassicInstructionsActivity.class);
                startActivity(intent);

            }
        });

        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListOfExerciseActivity.class);
                startActivity(intent);
            }
        });

        Button btnAbsInstructions = findViewById(R.id.btnAbsInstructions);
        btnAbsInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AbsInstructionsActivity.class);
                startActivity(intent);
            }
        });

        Button btnAbsStart = findViewById(R.id.btnAbsStart);
        btnAbsStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListOfAbsExercisesActivity.class);
                startActivity(intent);
            }
        });

        Button btnArmStart = findViewById(R.id.btnArmStart);
        btnArmStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListOfArmExerciseActivity.class);
                startActivity(intent);
            }
        });


        Button btnArmInstructions = findViewById(R.id.btnArmInstructions);
        btnArmInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArmInstructionsActivity.class);
                startActivity(intent);
            }
        });

        Button btnButtStart = findViewById(R.id.btnButtStart);
        btnButtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListOfButtExerciseActivity.class);
                startActivity(intent);
            }
        });


        Button btnButtInstructions = findViewById(R.id.btnButtInstructions);
        btnButtInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ButtInstructionsActivity.class);
                startActivity(intent);
            }
        });

        Button btnLegStart = findViewById(R.id.btnLegStart);
        btnLegStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListOfLegExerciseActivity.class);
                startActivity(intent);
            }
        });


        Button btnLegInstructions = findViewById(R.id.btnLegInstructions);
        btnLegInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LegInstructionsActivity.class);
                startActivity(intent);
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menus,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
