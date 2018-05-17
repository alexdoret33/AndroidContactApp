package com.doret.alex.contacts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.doret.alex.contacts.core.Contact;

import java.util.LinkedList;

public class MainActivity extends Activity {

    private ListView contactView;
    private LinkedList<Contact> contactList;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactView = findViewById(R.id.contactView);

        contactList = new LinkedList<>();
        contactList.add(new Contact("Jean", "DUPUIS"));
        contactList.add(new Contact("Maurice"));
        contactList.add(new Contact("Jean Michel"));



        adapter = new ContactAdapter(this, contactList);

        contactView.setAdapter(adapter);
    }
}
