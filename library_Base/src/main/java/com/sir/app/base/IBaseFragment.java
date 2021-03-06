package com.sir.app.base;

import android.content.Context;
import android.view.View;

/**
 * Fragment接口
 * Created by zhuyinan on 2016/4/25.
 * Contact by 445181052@qq.com
 */
public interface IBaseFragment {
	/**
	 * 绑定渲染视图的布局文件
	 * @return 布局文件资源id
	 */
	public int bindLayout();
	
	/**
	 * 初始化控件
	 */
	public void initView(final View view);
	
	/**
	 * 业务处理操作（onCreateView方法中调用）
	 * @param mContext  当前Activity对象
	 */
	public void doBusiness(Context mContext);

	/**
	 * 懒加载的方式获取数据，仅在满足fragment可见和视图已经准备好的时候调用一次
	 */
	public void lazyFetchData();
	
}
