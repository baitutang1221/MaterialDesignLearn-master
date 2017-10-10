package com.example.administrator.materialdesignlearn_master;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.example.administrator.materialdesignlearn_master.ui.masonry.MasonryAdapter;
import com.example.administrator.materialdesignlearn_master.ui.masonry.Product;
import com.example.administrator.materialdesignlearn_master.ui.masonry.RecycleItemClickListener;
import com.example.administrator.materialdesignlearn_master.ui.masonry.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private List<Product> productList;
    private ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        //set a toolbar
        toolbar= (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("首页");
//        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //set recycleview
        recyclerView= (RecyclerView) findViewById(R.id.recycler);

        //三种Manager样式
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));

//        LinearLayoutManager layout = new LinearLayoutManager(this);
//        layout.setStackFromEnd(true);//列表再底部开始展示，反转后由上面开始展示
//        layout.setReverseLayout(true);//列表翻转

        GridLayoutManager layout = new GridLayoutManager(this,3);
        layout.setAutoMeasureEnabled(true); //自适应宽高度
        recyclerView.setLayoutManager(layout);

        initData();
        RecycleItemClickListener itemClickListener=new RecycleItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                Log.e("position","="+position);
//                Toast.makeText(MainActivity.this, productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ProductDetailActivity.class);
                startActivity(intent);
            }
        };
        MasonryAdapter adapter=new MasonryAdapter(productList,itemClickListener);
        recyclerView.setAdapter(adapter);
        SpacesItemDecoration decoration=new SpacesItemDecoration(5);
        recyclerView.addItemDecoration(decoration);
    }


    private void initData() {
        productList=new ArrayList<Product>();
        Product p1=new Product(R.mipmap.image1,"我是照片1");
        productList.add(p1);
        Product p2=new Product(R.mipmap.image2,"我是照片2");
        productList.add(p2);
        Product p3=new Product(R.mipmap.image9,"我是照片3");
        productList.add(p3);
        Product p4=new Product(R.mipmap.image4,"我是照片4");
        productList.add(p4);
        Product p5=new Product(R.mipmap.image5,"我是照片5");
        productList.add(p5);
        Product p6=new Product(R.mipmap.image6,"我是照片6");
        productList.add(p6);
        Product p7=new Product(R.mipmap.image7,"我是照片7");
        productList.add(p7);
        Product p8=new Product(R.mipmap.image8,"我是照片8");
        productList.add(p8);
        Product p9=new Product(R.mipmap.image9,"我是照片9");
        productList.add(p9);
        Product p10=new Product(R.mipmap.image1,"我是照片10");
        productList.add(p10);
        Product p11=new Product(R.mipmap.image2,"我是照片11");
        productList.add(p11);

        Product p12=new Product(R.mipmap.image4,"我是照片12");
        productList.add(p12);
        Product p13=new Product(R.mipmap.image5,"我是照片13");
        productList.add(p13);
        Product p14=new Product(R.mipmap.image6,"我是照片14");
        productList.add(p14);
        Product p15=new Product(R.mipmap.image1,"我是照片15");
        productList.add(p15);
        Product p16=new Product(R.mipmap.image7,"我是照片16");
        productList.add(p16);
        Product p17=new Product(R.mipmap.image8,"我是照片17");
        productList.add(p17);
        Product p18=new Product(R.mipmap.image9,"我是照片18");
        productList.add(p18);
        Product p19=new Product(R.mipmap.image1,"我是照片19");
        productList.add(p19);
        Product p20=new Product(R.mipmap.image2,"我是照片20");
        productList.add(p20);
        Product p21=new Product(R.mipmap.image4,"我是照片21");
        productList.add(p21);
        Product p22=new Product(R.mipmap.image5,"我是照片22");
        productList.add(p22);

    }


}
