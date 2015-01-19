package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void converter(View v){
        EditText etInput = (EditText)findViewById(R.id.etInput);
        TextView tvOutput = (TextView)findViewById(R.id.tvOutput);
        String s = etInput.getText().toString();

        double input = Double.parseDouble(s);


        //double input = Double.parseDouble(s);

        RadioGroup rgFrom = (RadioGroup)findViewById(R.id.rgFrom);
        int selFrom = rgFrom.getCheckedRadioButtonId();
        RadioGroup rgTo = (RadioGroup)findViewById(R.id.rgTo);
        int selTo = rgTo.getCheckedRadioButtonId();

        if (selFrom == R.id.rbFrmC && selTo == R.id.rbToF) { //The user want to convert from celsius
          tvOutput.setText((input*(5/9) + 32)+"");

        }
        if (selFrom == R.id.rbFrmC && selTo == R.id.rbToK) { //The user want to convert from celsius
            tvOutput.setText((input + 273.15)+"");

        }
        if ((selFrom == R.id.rbFrmC && selTo == R.id.rbToC) ||
           (selFrom == R.id.rbFrmF && selTo == R.id.rbToF) ||
           (selFrom == R.id.rbFrmK && selTo == R.id.rbToK)){ //The user want to convert from celsius
            tvOutput.setText((input)+"");

        }
        if (selFrom == R.id.rbFrmF && selTo == R.id.rbToC) { //The user want to convert from celsius
            tvOutput.setText((input-32) *(5/9)+"");

        }
        if (selFrom == R.id.rbFrmF && selTo == R.id.rbToK) { //The user want to convert from celsius
            tvOutput.setText((input+459.67)*(5/9)+"");

        }

        if (selFrom == R.id.rbFrmK && selTo == R.id.rbToC) { //The user want to convert from celsius
            tvOutput.setText((input-273.15)+"");

        }if (selFrom == R.id.rbFrmK && selTo == R.id.rbToF) { //The user want to convert from celsius
            tvOutput.setText((input)*(5/9)-(459.67)+"");

        }







    }



}
