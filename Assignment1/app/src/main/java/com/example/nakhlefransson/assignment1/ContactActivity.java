    package com.example.nakhlefransson.assignment1;

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.provider.ContactsContract;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;


    public class ContactActivity extends Activity implements View.OnClickListener {
        //Skapar variabel
        EditText editName;
        EditText editPhone;
        EditText editEmail;

        Button btnAddContact;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_contact);

          Intent in = getIntent();
            String kim = in.getStringExtra("name");

            editName = (EditText)findViewById(R.id.editName); //Talar om att det är en textfält och hämtar den med id
            editPhone = (EditText)findViewById(R.id.editPhone);
            editEmail = (EditText)findViewById(R.id.editEmail);

            btnAddContact = (Button)findViewById(R.id.btnAddContact);//Talar om att det är en knapp och hämtar den med id
            btnAddContact.setOnClickListener(this); //varje gång man trycker på knappen så körs metoden onClick
        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.contact, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        public void onClick(View view) {
            if (editName.getText().toString().isEmpty()){
                Toast.makeText(this, "Ange namn", Toast.LENGTH_SHORT).show();
            }
            else{
                //This vilket context, sedan vad det ska stå, sedan hur länge. Sedan show för visa

                Intent insertIntent = new Intent(ContactsContract.Intents.Insert.ACTION); // Skapa intent till kontakter
                insertIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE); // Mime typ
                insertIntent.putExtra(ContactsContract.Intents.Insert.NAME, editName.getText().toString()); // Vilka värde vi skicka med till intent
                insertIntent.putExtra(ContactsContract.Intents.Insert.PHONE, editPhone.getText().toString());
                insertIntent.putExtra(ContactsContract.Intents.Insert.EMAIL, editEmail.getText().toString());
                startActivity(insertIntent); // starta min intent
            }

        }
    }
