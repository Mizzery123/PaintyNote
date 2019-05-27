package sg.edu.rp.c346.paintynote.view;

/**
 * Created by ravi on 20/02/18.
 */

import android.content.Context;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import sg.edu.rp.c346.paintynote.R;
import sg.edu.rp.c346.paintynote.database.model.Note;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.MyViewHolder>  {


    private Context context;
    private List<Note> notesList;
    private List<Note> titlesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView note;
        public TextView dot;
        public TextView timestamp;
        public ImageButton btnVoice;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            note = view.findViewById(R.id.note);
            dot = view.findViewById(R.id.dot);
            timestamp = view.findViewById(R.id.timestamp);

        }
    }




    public NotesAdapter(Context context, List<Note> titlesList, List<Note> notesList) {
        this.context = context;
        this.titlesList = titlesList;
        this.notesList = notesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Note note = notesList.get(position);
        Note title = titlesList.get(position);

        holder.title.setText(title.getTitle());

        holder.note.setText(note.getNote());

        // Displaying dot from HTML character code
        holder.dot.setText(Html.fromHtml("&#8224;"));

        // Formatting and displaying timestamp
        holder.timestamp.setText(formatDate(note.getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    /**
     * Formatting timestamp to `MMM d` format
     * Input: 2018-02-21 00:15:42
     * Output: Feb 21
     */
    private String formatDate(String dateStr) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = fmt.parse(dateStr);
            SimpleDateFormat fmtOut = new SimpleDateFormat("MMM d");
            return fmtOut.format(date);
        } catch (ParseException e) {

        }

        return "";
    }



}

