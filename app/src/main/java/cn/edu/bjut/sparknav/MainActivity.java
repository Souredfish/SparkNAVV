package cn.edu.bjut.sparknav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityMSG","iMessage");
    }

    public void toNavigate(View view){
        //响应按钮的事件
        EditText from_msg = findViewById(R.id.from);
        String s = from_msg.getText().toString();
        Log.i("message",s);

    }
}
