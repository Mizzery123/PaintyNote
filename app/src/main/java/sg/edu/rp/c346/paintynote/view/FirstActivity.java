package sg.edu.rp.c346.paintynote.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import sg.edu.rp.c346.paintynote.QuizActivity;
import sg.edu.rp.c346.paintynote.R;

public class FirstActivity extends AppCompatActivity {

    ImageButton btnNote, btnQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnNote = findViewById(R.id.buttonNote);
        btnQuiz = findViewById(R.id.buttonQuiz);

        btnNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);

            }
        });

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), QuizActivity.class);
                startActivity(i);

            }
        });
    }
}
