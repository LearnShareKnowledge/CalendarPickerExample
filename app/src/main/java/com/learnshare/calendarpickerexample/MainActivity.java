package com.learnshare.calendarpickerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.timessquare.CalendarPickerView;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CalendarPickerView mCalendarPickerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mCalendarPickerView = (CalendarPickerView) findViewById(R.id.calendarPickerView);

        Date today = new Date();

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.YEAR,1);

        Date nextYear = calendar.getTime();

        mCalendarPickerView.init(today,nextYear).inMode(CalendarPickerView.SelectionMode.RANGE);

        Date selecteddate = mCalendarPickerView.getSelectedDate();

        List<Date> selectedDates = mCalendarPickerView.getSelectedDates();

    }
}
