# recyclerView_fastScroller
recyclerView 快速滑动插件
添加依赖：implementation 'com.github.LqTk:recyclerView_fastScroller:1.1.0'
引用方法：
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <androidx.recyclerview.widget.RecyclerView
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
        <com.org.lqtk.fastscroller.RecyclerFastScroller
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="end"/>
    </FrameLayout>
使用时必须添加在framelayout布局中。

fastScroller插件主要解决当recyclerView的数据存在大量时。例如几百，几千条时，recyclerView本身自带的fastScroll
将变的很小，甚至无法触摸。插件中图片生效的前提是数据在大量的情况下生效，这里说的大量是指数据超过500条

提供主要的方法包括：
touchIsDrawable(boolean b);方法设置是否滑块显示为图片，设为true则可实现自定义触摸滑块的图片样式，默认false，不显示图片滑块
setDrawable(Drawable normal, Drawable pressed);方法在touchIsDrawable设置为true时并且有大量数据的时候生效，否则无效
setBarColor(@ColorInt int scrollBarColor);设置滑道的颜色
setMarginLeft(int toLeft);设置scroller距离左边的距离
setmTouchTargetMaxWidth(int maxWidth);设置滑块的最大宽度
setTouchTargetWidth(int touchTargetWidth);设置滑块的宽度
setHidingEnabled(boolean hidingEnabled);设置是否隐藏Scroller
attachRecyclerView(RecyclerView recyclerView);绑定recyclerView
attachAdapter(@Nullable RecyclerView.Adapter adapter);绑定adapter，如果在绑定recyclerView前，recyclerView已经设置了adapter则无需再次调用
setHideDelay(int hideDelay);设置多少时间后隐藏scroller
setHandlePressedColor(@ColorInt int colorPressed);在touchIsDrawable为false时生效，按下的滑块颜色
setHandleNormalColor(@ColorInt int colorNormal);在touchIsDrawable为false时生效，松手的滑块颜色

使用方法：
fastScroller.setHidingEnabled(false);
fastScroller.touchIsDrawable(true);
fastScroller.setTouchTargetWidth(25);
fastScroller.setMarginLeft(10);
fastScroller.setDrawable(getResources().getDrawable(R.drawable.thumb01),getResources().getDrawable(R.drawable.thumb02));


