package android.myapplicationdev.com.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15039836 on 16/5/2017.
 */

public class TaskAdapter extends ArrayAdapter<Task> {
    private Context context;
    private ArrayList<Task> task;
    //private ArrayList<DifferentModuleDG> differentModules;
    private TextView tvID, tvDesc, tvDate;


    public TaskAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        task = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDesc = (TextView)rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView)rowView.findViewById(R.id.tvDate);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
//        DailyGrade currentWeek = grades.get(position);
//        // Set the TextView to show the food
//
//        tvGrade.setText(currentWeek.getGrade());
//        tvWeek.append(" "+currentWeek.getWeek());

        Task currentTask = task.get(position);

        tvID.setText(currentTask.getId() + "");
        tvDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());

        return rowView;
    }
}