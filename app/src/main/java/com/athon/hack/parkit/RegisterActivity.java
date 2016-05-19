package com.athon.hack.parkit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;

public class RegisterActivity extends Activity {
    private static final String[] zone_numbers = {"אזור 1 - מקור ברוך", "אזור 2 - זכרון משה",
        "אזור 3 - כרם אברהם", "אזור 4 - מורשה", "אזור 5 - מרכז העיר", "אזור 6 - מחנה יהודה ונחלת אחים",
        "אזור 7 - רחביה", "אזור 8 - טלביה", "אזור 9 - ימין משה", "אזור 10 - המושבה הגרמנית",
        "אזור 11 - תלפיות", "אזור 12 - בית הכרם", "אזור 13 - גבעת שאול", "אזור 14 - שד' אשכול",
        "אזור 15 - אגן העיר העתיקה", "אזור 16 - המושבה הגרמנית", "אזור 17 - המושבה הגרמנית",
        "אזור 18 - הגבעה הצרפתית", "אזור 19 - רח' זאב חקלאי", "אזור 20 - פסגת זאב",
        "אזור 21 - רח' שטרן", "אזור 22 - דרך הרכבת", "אזור 23 - שד' אשכול"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner dropdown = (Spinner) findViewById(R.id.zones_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, zone_numbers);
        dropdown.setAdapter(adapter);
    }
}
