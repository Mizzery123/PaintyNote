package sg.edu.rp.c346.paintynote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);
        iv = findViewById(R.id.iv);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizBook.questions.length);

        if (score == 10){
            mGrade.setText("You are a werewolf online master!");
            iv.setImageResource(R.drawable.r1);
        }else if (score == 8 || score == 9){
            mGrade.setText("Awesome! Almost there!");
            iv.setImageResource(R.drawable.r2);
        }else if (score == 7 || score == 6 || score == 5) {
            mGrade.setText("Not bad! Keep it up!");
            iv.setImageResource(R.drawable.r3);
        }else {
            mGrade.setText("You should read the infos again...");
            iv.setImageResource(R.drawable.r4);
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });

    }
}
