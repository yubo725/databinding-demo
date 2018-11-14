package test.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.com.databindingdemo.databinding.ActivityDemo2Binding;

public class Demo2Activity extends AppCompatActivity {

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemo2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_demo2);
        adapter = new MyAdapter();
        binding.setAdapter(adapter);
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.BaseViewHolder> {

        private static final int TYPE_TEXT = 0x0001;
        private static final int TYPE_IMG = 0x0002;

        private LayoutInflater layoutInflater;

        MyAdapter() {
            layoutInflater = LayoutInflater.from(Demo2Activity.this);
        }

        @Override
        public int getItemViewType(int position) {
            if (position % 2 == 0) {
                return TYPE_TEXT;
            }
            return TYPE_IMG;
        }

        @NonNull
        @Override
        public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == TYPE_TEXT) {
                return new TextViewHolder(layoutInflater.inflate(R.layout.recycler_item_text, parent, false));
            }
            return new ImageViewHolder(layoutInflater.inflate(R.layout.recycler_item_img, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i) {
        }

        @Override
        public int getItemCount() {
            return 30;
        }

        class BaseViewHolder extends RecyclerView.ViewHolder {

            BaseViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

        class TextViewHolder extends BaseViewHolder {

            TextViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

        class ImageViewHolder extends BaseViewHolder {

            ImageViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }

}
