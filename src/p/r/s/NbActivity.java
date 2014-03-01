package p.r.s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author Reshma Malla
 *
 */
public class NbActivity extends Activity {
    /** Called when the activity is first created. */
    Button org,part;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        org=(Button)findViewById(R.id.organiser);
        org.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NbActivity.this, Organiser.class);
    			startActivity(i);
				startService(i);
			}
        });
	        part=(Button)findViewById(R.id.participant);
	        part.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(NbActivity.this, Participant.class);
	    			startActivity(i);
	    			startService(i);	
				}
        });
  }
}    