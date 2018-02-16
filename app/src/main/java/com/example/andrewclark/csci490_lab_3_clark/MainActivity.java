package com.example.andrewclark.csci490_lab_3_clark;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Course course;
        ArrayList<Course> courses = new ArrayList();

        course = new Course();
        course.setCourseName("Anthropology");
        course.setCourseNum("101");
        course.setCourseProf("Quirko");
        courses.add(course);

        course = new Course();
        course.setCourseName("CSCI");
        course.setCourseNum("490");
        course.setCourseProf("Briggs");
        courses.add(course);



        final ListView classSched = findViewById(R.id.class_schedule);

        CourseAdapter adapter = new CourseAdapter(this, courses);

        classSched.setAdapter(adapter);


        classSched.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();

            }
        });

        classSched.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), getString(R.string.longclick) + item, Toast.LENGTH_LONG).show();
                return false;
            }
        });




    }



}
