package com.pop.up;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.pop.view.TransparentPanel;

public class PopupWindow extends Activity{
	
	public Animation animShow, animHide;
	void Popup() {

		final TransparentPanel popup = (TransparentPanel) findViewById(R.id.popup_window);

		animShow = AnimationUtils.loadAnimation(this, R.anim.popup_show);
		animHide = AnimationUtils.loadAnimation(this, R.anim.popup_hide);

		final Button showButton = (Button) findViewById(R.id.show_popup_button);
		final Button hideButton = (Button) findViewById(R.id.hide_popup_button);
		showButton.setVisibility(View.GONE);

		//click this button to hide the popup
		hideButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.startAnimation(animHide);
				hideButton.setEnabled(false);
				popup.setVisibility(View.GONE);
			}
		});

		final TextView locationName = (TextView) findViewById(R.id.location_name);
		final TextView locationDescription = (TextView) findViewById(R.id.location_description);

		locationName.setText("Android");
		locationDescription
				.setText("The second Android Developer Challenge has begun! In this contest, real-world users will help review and score applications"						
						+ "and the overall winner will take away $250,000. The deadline for submitting an application to the contest is August 31, 2009.");
	}
}
