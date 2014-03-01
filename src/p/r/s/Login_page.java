package p.r.s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login_page extends Activity{

	Button create;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        create=(Button)findViewById(R.id.create_event);
        create.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Login_page.this, CreateEvent.class);
    			startActivity(i);
				startService(i);
			}
        });
        
	}

}
