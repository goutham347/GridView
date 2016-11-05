package com.tt.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by vijay on 10/20/2016.
 */

public class ImageAdapter extends BaseAdapter {
   private Context context;


    public ImageAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if (convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }else{
            imageView= (ImageView) convertView;
        }
        imageView.setImageResource(images[position]);
        return imageView;
    }
  public Integer[] images = {R.drawable.soldier, R.drawable.soldier, R.drawable.soldier, R.drawable.soldier,R.drawable.soldier,R.drawable.soldier,R.drawable.soldier};

}
