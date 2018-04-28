package io.github.kosmologist.a8minutes.ClassicExercise;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Locale;

import io.github.kosmologist.a8minutes.R;
import pl.droidsonroids.gif.GifImageView;

public class ClassicExerciseActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    int progress;
    TextToSpeech textToSpeech;
    public String tempSpeech;
    public TextView num;
    public ImageButton skip;
    public TextView ready;
    public TextView exeName;
    public ProgressBar progressBar;
    public int exeRestNum = 0;
    public int exeNum = 0;
    int hash=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_exercise);
        textToSpeech = new TextToSpeech(ClassicExerciseActivity.this, ClassicExerciseActivity.this);
        setUpUI(16000);
    }


    public void setUpUI(final long startTime) {
        exeName = findViewById(R.id.exerciseName);
        num = findViewById(R.id.tvNum);
        ready = findViewById(R.id.ready);
        skip = findViewById(R.id.skip);
        progressBar = findViewById(R.id.progressBar);
        GifImageView gifImageView = findViewById(R.id.gifImageView);
        progressBar.setProgress(0);
        final long time = startTime;
        if (startTime == 16000) {
            if (exeRestNum == 0) {
                ready.setText("Make Yourself Ready !");
                setTempSpeech("Make yourself ready . exercise 1 of 13 Jumping jacks ");
                speek();
            } else if (exeRestNum == 1) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("2/13 WALL SIT");
                gifImageView.setImageResource(R.drawable.wallsit1);
                setTempSpeech("Take Rest Make yourself ready . exercise 2 of 13 wall sit");
                speek();
            } else if (exeRestNum == 2) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("3/13 PUSH UPS");
                gifImageView.setImageResource(R.drawable.pushup);
                setTempSpeech("Take rest Make yourself ready . exercise 3 of 13 push ups");
                speek();
            } else if (exeRestNum == 3) {
                ready.setText("Make Yourself Ready !");
                gifImageView.setImageResource(R.drawable.abdominalescrunch);
                exeName.setText("4/13 Abdominal Crunchs");
                setTempSpeech("Take rest Make yourself ready . exercise 4 of 13 Abdominal Crunchs");
                speek();
            } else if (exeRestNum == 4) {
                ready.setText("Make Yourself Ready !");
                gifImageView.setImageResource(R.drawable.stepup);
                exeName.setText("5/13 STEP UP's");
                setTempSpeech("take rest Make yourself ready . exercise 5 of 13 Step ups you can use chair");
                speek();
            } else if (exeRestNum == 5) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("6/13 SQUATS");
                gifImageView.setImageResource(R.drawable.squats);
                setTempSpeech("take rest Make yourself ready . exercise 6 of 13 squats");
                speek();
            } else if (exeRestNum == 6) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("7/13 TRICEPS DIPS");
                gifImageView.setImageResource(R.drawable.tricepsdips);
                setTempSpeech("take rest Make yourself ready . exercise 7 of 13 triceps dips");
                speek();
            } else if (exeRestNum == 7) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("8/13 PLANK");
                gifImageView.setImageResource(R.drawable.plank);
                setTempSpeech("take rest Make yourself ready . exercise 8 of 13 Plank");
                speek();
            } else if (exeRestNum == 8) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("9/13 HIGH STEPPING");
                gifImageView.setImageResource(R.drawable.highknees);
                setTempSpeech("take rest Make yourself ready . exercise 9 of 13 high stepping");
                speek();
            } else if (exeRestNum == 9) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("10/13 LUNGES");
                gifImageView.setImageResource(R.drawable.lunge);
                setTempSpeech("take rest Make yourself ready . exercise 10 of 13 lunges");
                speek();
            } else if (exeRestNum == 10) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("11/13 PUSH-UP & ROTATION");
                gifImageView.setImageResource(R.drawable.pushuprotaion);
                setTempSpeech("take rest Make yourself ready . exercise 11 of 13 Push ups and rotation");
                speek();
            } else if (exeRestNum == 11) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("12/13 SIDE PLANK RIGHT");
                gifImageView.setImageResource(R.drawable.sideplankright);
                setTempSpeech("Make yourself ready . exercise 12 of 13 Side plank right");
                speek();
            } else if (exeRestNum == 12) {
                ready.setText("Make Yourself Ready !");
                exeName.setText("13/13 SIDE PLANK LEFT");
                gifImageView.setImageResource(R.drawable.sideplank);
                setTempSpeech("Make yourself ready . exercise 13 of 13 side plank left");
                speek();
            } else {
                finish();
            }
        }
        if (startTime == 31000) {
            MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.whistle_sound);
            mp.start();
        }


        CountDownTimer countDownTimer = new CountDownTimer(time, 1000) {
            @Override
            public void onTick(long l) {

                skip.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hash=1;
                    }
                });
                if(hash==1){
                    cancel();
                    onFinish();
                }

                if(hash != 1) {
                    num.setText("" + l / 1000);
                    if (time == 16000) {
                        progress = (int) (progress + 6.7);
                        progressBar.setProgress(progress);
                        if (l / 1000 == 3) {
                            setTempSpeech("3");
                            speek();
                        }
                        if (l / 1000 == 2) {
                            setTempSpeech("2");
                            speek();
                        }
                        if (l / 1000 == 1) {
                            setTempSpeech("1");
                            speek();
                        }
                    } else {

                        if (l / 1000 == 15) {
                            setTempSpeech("half the time");
                            speek();
                        }
                        if (l / 1000 == 3) {
                            setTempSpeech("3");
                            speek();
                        }
                        if (l / 1000 == 2) {
                            setTempSpeech("2");
                            speek();
                        }
                        if (l / 1000 == 1) {
                            setTempSpeech("1");
                            speek();
                        }
                        progress = (int) (progress + 3.5);
                        progressBar.setProgress(progress);
                    }

                }


            }

            @Override
            public void onFinish() {
                  hash=0;
                  if (time == 16000) {
                    ready.setText("Start Exercise");
                    exeRestNum++;
                    num.setText("0");
                    progressBar.setProgress(100);
                    progress = 0;
                    setUpUI(31000);
                }
                if (time == 31000) {
                    ready.setText("Make Yourself Ready !");
                    exeNum++;
                    num.setText("0");
                    progressBar.setProgress(100);
                    progress = 0;
                    setUpUI(16000);
                }
            }
        }.start();

    }

    public void speek() {
        TextToSpeechFunction();
    }

    public void TextToSpeechFunction() {
        String speech = getTempSpeech();
        textToSpeech.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
        speech = "";
    }

    @Override
    public void onDestroy() {
        textToSpeech.shutdown();
        super.onDestroy();
    }

    @Override
    public void onInit(int Text2SpeechCurrentStatus) {
        if (Text2SpeechCurrentStatus == TextToSpeech.SUCCESS) {
            textToSpeech.setLanguage(Locale.US);
            TextToSpeechFunction();
        }

    }

    public String getTempSpeech() {
        return tempSpeech;
    }

    public void setTempSpeech(String tempSpeech1) {
        tempSpeech = tempSpeech1;
    }

}
