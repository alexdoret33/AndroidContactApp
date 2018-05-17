package com.doret.alex.contacts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.doret.alex.contacts.core.Contact;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
    }


    public View getView(int position, View convertView,  ViewGroup parent) {

        //création de la vue
        if(convertView == null){
            convertView = View.inflate(getContext(), R.layout.item_contact, null);
        }
        //récupération des vues à l'intérieur
        TextView contactAlias = convertView.findViewById(R.id.contactAlias);
        TextView contactName = convertView.findViewById(R.id.contactName);
        TextView contactPhones = convertView.findViewById(R.id.contactPhones);

        //récupération de l'objet à afficher
        Contact contact = getItem(position);

        contactAlias.setText(contact.getAlias());
        contactName.setText(contact.getFullName());
        contactPhones.setText(contact.getPhoneNumbers());


        return convertView;

    }
}
