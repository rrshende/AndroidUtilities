package com.shende.androidutilities;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		CustomArrayAdapter adapter = new CustomArrayAdapter(this, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_main_actions, menu);

		return super.onCreateOptionsMenu(menu);
	}

}
