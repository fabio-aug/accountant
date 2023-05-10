package ifmg.mobile.accountant;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int countRedBloodCell;
    private TextView textCountRedBloodCell;

    private int countLeukocytes;
    private TextView textCountLeukocytes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textCountLeukocytes = (TextView) findViewById(R.id.text_count_leukocytes);
        this.textCountRedBloodCell = (TextView) findViewById(R.id.text_count_red_blood_cell);
    }

    public void addRedBloodCell() {
        Log.d("CLICK COUNTER", "Red Blood Cell Increment");
        this.countRedBloodCell++;
        if (this.textCountRedBloodCell != null) {
            this.textCountRedBloodCell.setText(String.valueOf(this.countRedBloodCell));
        }
    }

    public void btnScreenRedBloodCell(View view) {
        addRedBloodCell();
    }

    public void addLeukocytes() {
        Log.d("CLICK COUNTER", "Leukocytes Increment");
        this.countLeukocytes++;
        if (this.textCountLeukocytes != null) {
            this.textCountLeukocytes.setText(String.valueOf(this.countLeukocytes));
        }
    }

    public void btnScreenLeukocytes(View view) {
        addLeukocytes();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            addRedBloodCell();
            return true;
        }

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            addLeukocytes();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    public void clearAll(View view) {
        this.countLeukocytes = -1;
        this.countRedBloodCell = -1;

        addLeukocytes();
        addRedBloodCell();
    }
}
