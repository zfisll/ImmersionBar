package com.gyf.immersionbar.activity;

import com.gyf.barlibrary.ImmersionBar;
import com.gyf.immersionbar.R;

/**
 * @author geyifeng
 * @date 2017/6/6
 */
public class ShapeActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shape;
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
        ImmersionBar.with(this).titleBar(R.id.toolbar)
                .navigationBarColor(R.color.shape1)
                .init();
    }
}
