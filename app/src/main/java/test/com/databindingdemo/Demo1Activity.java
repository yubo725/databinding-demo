package test.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import test.com.databindingdemo.databinding.ActivityDemo1Binding;

public class Demo1Activity extends AppCompatActivity {

    User user;
    PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo1);

        user = new User();
        presenter = new PresenterImpl();
        binding.setUser(user);
        binding.setPresenter(presenter);
    }

    public interface IPresenter {
        void onUserNameChanged(CharSequence s, int start, int before, int count);

        void onUserAgeChanged(CharSequence s, int start, int before, int count);
    }

    public class PresenterImpl implements IPresenter {

        @Override
        public void onUserNameChanged(CharSequence s, int start, int before, int count) {
            user.setName(s.toString());
            user.setUrl("https://upload-images.jianshu.io/upload_images/3722695-5ad19f0c6b812be1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp");
        }

        @Override
        public void onUserAgeChanged(CharSequence s, int start, int before, int count) {
            String ageStr = s.toString();
            try {
                int age = Integer.parseInt(ageStr);
                user.setAge(age);
            } catch (Exception e) {
                Toast.makeText(Demo1Activity.this, "Invalid age", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
