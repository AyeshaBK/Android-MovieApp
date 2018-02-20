package cogr.example.summerschool.mymovieapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by summerschool on 2018/01/29.
 */

public class ImageAdapter extends BaseAdapter {
    // references to our images
    public Integer[] mThumbIds = {
            R.drawable.ant_man,R.drawable.avatar,
            R.drawable.baby_driver, R.drawable.jumanji,
            R.drawable.star_wars, R.drawable.jaws,
            R.drawable.beauty_and_the_beast,R.drawable.ghost_busters,
            R.drawable.titanic
    };
    private final Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position) {
        return mThumbIds[position];
    }
    public long getItemId(int position) {
        return 0;
    }
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(600, 700));
        imageView.setPadding(4, 4, 4, 4);
        return imageView;
    }
}
