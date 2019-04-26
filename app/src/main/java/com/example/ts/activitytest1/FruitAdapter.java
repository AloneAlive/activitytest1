//package com.example.ts.activitytest1;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
//
//
//    private List<Fruit> mFruitList;
//
//    static class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView fruitImage;
//        TextView fruitName;
//
//        public ViewHolder(View view) {
//            super(view);
//            fruitImage = view.findViewById(R.id.list_image);
//            fruitName = view.findViewById(R.id.list_name);
//        }
//    }
//
//    public FruitAdapter(List<Fruit> fruitList) {
//        mFruitList = fruitList;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.)
//        return null;
//    }
//
//    private int resourceId;
//
//
//    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
//        super(context, textViewResourceId, objects);
//        resourceId = textViewResourceId;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        Fruit fruit = getItem(position); //获得当前项的Fruit实例
//
//        View view;
//        if (convertView == null) {
//            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
//        } else {
//            view = convertView;
//        }
//
//        //View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
//        ImageView fruitImage = view.findViewById(R.id.list_image);
//        TextView fruitName = view.findViewById(R.id.list_name);
//
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());
//
//        return view;
//    }
//}
