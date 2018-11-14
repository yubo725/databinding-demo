package test.com.databindingdemo;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by yubo on 2018/11/13
 */
public class ImageUtil {

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(MyApplication.getInstance()).load(url).into(imageView);
        }
    }
}
