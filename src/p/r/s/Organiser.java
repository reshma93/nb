package p.r.s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Organiser extends Activity {
	 
	EditText user, pass;
    String user1, pass1;
    Button login;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.organizer_page);
    
    user=(EditText)findViewById(R.id.user_input);
    pass=(EditText)findViewById(R.id.passwd_input);
    
    login=(Button)findViewById(R.id.org_login);
    login.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Intent i=new Intent(Organiser.this, Login_page.class);
			startActivity(i);
			startService(i);
		
			
		user1=user.getText().toString();
		pass1=pass.getText().toString();
		//user.setText(pass1+"");
		//pass.setText(user1+"");
			// TODO Auto-generated method stub
			/*first_operand=Double.parseDouble(firstOperand.getText().toString());
			second_operand=Double.parseDouble(secondOperand.getText().toString());
			answer=first_operand+second_operand;
			finalResult.setText(answer+"");
			*/
		}
	});
         
	}

}