package com.example.andrewclark.csci490_lab_3_clark;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrewclark on 2/15/18.
 */


public class CourseAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Course> mDataSource;

    public CourseAdapter(Context context, ArrayList<Course> courses){
        mContext = context;
        mDataSource = courses;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount(){
        return mDataSource.size();

    }
    @Override
    public Object getItem(int i){
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = mInflater.inflate(android.R.layout.simple_expandable_list_item_2, viewGroup, false);
        TextView courseNumberView = rowView.findViewById(android.R.id.text2);
        TextView courseNameView = rowView.findViewById(android.R.id.text1);
        Course course = (Course) getItem(position);
        courseNameView.setText(course.getCourseName());
        courseNumberView.setText(course.getCourseNum());
        return rowView;
    }


}