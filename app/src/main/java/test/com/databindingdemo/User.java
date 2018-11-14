package test.com.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Locale;

/**
 * Created by yubo on 2018/11/13
 */
public class User extends BaseObservable {
    private String name;
    private int age;
    private String url;

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public String info(String name, int age) {
        return String.format(Locale.SIMPLIFIED_CHINESE, "User: [name: %s, age: %d]", name, age);
    }
}
