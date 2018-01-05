package com.pinnainfotech.doctorapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.pinnainfotech.doctorapp.R;

import java.util.ArrayList;


public class FaqAdapters extends BaseAdapter {

    private Context mContext;
    private ArrayList<FaqModel> list;

    public FaqAdapters(Context mContext, ArrayList<FaqModel> list) {
        this.mContext = mContext;
        this.list = list;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posistion, View view, ViewGroup viewGroup) {

        ViewHolders viewHolde=null;

        if(view==null){
            LayoutInflater inflater= (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view= inflater.inflate(R.layout.recycler_list_row,null);
            viewHolde  = new ViewHolders();

            viewHolde.tvBankName= (TextView)view.findViewById(R.id.tv_bankName);

            viewHolde.imageView= (ImageView) view.findViewById(R.id.image_bank);

            view.setTag(viewHolde);
        }else {
            viewHolde = (ViewHolders) view.getTag();

        }

        /////GLis

        viewHolde.tvBankName.setText(list.get(posistion).getTitle());

        Glide.with(mContext).load(/*list.get(posistion).getImagename()*/R.drawable.doctor_one)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(viewHolde.imageView);




        return view;
    }




    public  class  ViewHolders{

        public   TextView tvBankName;
        public   ImageView imageView;
    }

}