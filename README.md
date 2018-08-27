# EasyAnontion
EasyAnontion是一套便捷式注解框架，利用注解进行xml与界面(Activity,Fragment)的绑定；控件与基本事件的绑定；View模块化(FrameViewGroup)的处理。此框架在注解的基础上集成了一个通用型SimpleBaseAdapter来处理列表问题，让开发者只关注viewHolder的处理，不需要频繁的创建Adapter.(并包含二级列表通用型SimpleExpandableListAdapter以及Recyclerview的通用型RecycleBaseAdapter等)。
## 实现原理
注解的基本实现用到了Java反射(如果对反射的性能比较敏感的就慎用了)，View模块化以及通用型Adapter的实现大量的用到了Java的类的思想(泛型、类的基本属性以及Java的一些API等)。
## 依赖
### Gradle
	compile 'org.chengnuovax:easyanontion-api:1.0.5'
### Maven
	<dependency>
		<groupId>org.chengnuovax</groupId>
		<artifactId>easyanontion-api</artifactId>
		<version>1.0.5</version>
		<type>pom</type>
	</dependency>
## Activity内使用（在使用时.Activity、Fragment需要分别集成FrameActivity跟BaseFragment，当然你也可以根据源码自己实现）
	//绑定界面的布局
	@EActivity(R.layout.activity_main)
	public class MainActivity extends FrameActivity {
		/**
		 * 以下两种绑定View的方式、点击事件同理
		 */
		@ViewById(R.id.mButtonListView)
		Button mButtonListView;//查看ListView界面

		@ViewById
		Button mButtonRecyclerView;//查看RecyclerView界面
		/**
		 * 从intent里边自动获取数据（例：key = data）
		 */
		@Extra
		String data;

		@Click(R.id.mButtonListView)
		void trans() {
			
		}

		@Click
		void mButtonRecyclerView() {
			
		}

	}
## Fragment内使用
	@EFragment(R.layout.fragment_one)
	public class OneFragment extends BaseFragment {
		@ViewById
		TextView mText;
		/**
		 * 从Bundle里边自动获取数据（例：key = data，注data里边的数据在onActivityCreated之后才能取）
		 */
		@EFragmentArg
		String data;

		@Override
		public void onCreate(@Nullable Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		}

		@Override
		public void onActivityCreated(@Nullable Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			Toast.makeText(getActivity(), "接收Activity传输到Fragment的数据:" + data, Toast.LENGTH_LONG).show();
		}


		@Click
		void mText() {
			Toast.makeText(getActivity(), "文字点击", Toast.LENGTH_LONG).show();
		}
	}
## 简单ListView中ViewHolder使用（适用于简单不复杂的ListView列表）
### ViewHolder
	@Layout(R.layout.list_item_item)
	public class ListHolder extends BaseHolder<HolderListen> {
		/**
		* view绑定
		*/
		@ViewById
		ImageView mImage;
		@ViewById
		TextView mText;

		@Override
		protected void setData(Context context, Object obj, Map<Object, Object> map, final int position, int size) {
			super.setData(context, obj, map, position, size);
			String data = (String) obj;
			mText.setText("第" + data + "项");
			mImage.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if (listener != null) {
						listener.OnItem(position);
					}
				}
			});
		}
	}
### ListView或者GridView列表
	BaseAdapter baseAdapter; = new SimpleBaseAdapter<ListHolder, HolderListen>(datas, ListHolder.class, this);
    mList.setAdapter(baseAdapter);
## 模块化View
### 自定义View
	@Layout(R.layout.layout_module)
	public class ModleLayout extends FrameViewGroup {
		@ViewById
		TextView mText;

		public ModleLayout(Context context) {
			super(context);
		}

		public ModleLayout(Context context, @Nullable AttributeSet attrs) {
			super(context, attrs);
		}
	}
### Xml里使用自定义View
	<com.example.android.demo.ModleLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
## 注解方法列举
	@Click//绑定点击事件（暂时只在Activity跟Fragment内使用）
	@EActivity//Activity绑定布局
	@EFragment//Fragment绑定布局
	@EFragmentArg//获取Bundle内数据
	@Extra//获取Intent内数据
	@Layout//模块布局
	@LongClick//长按事件绑定
	@ViewById//控件绑定
	@CheckedChange//选中按钮事件绑定
	@AnimationRes//绑定Animation资源
## 混淆说明（涉及到不是从资源文件获取相应数据，而是从属性或者方法名获取资源的都需要加上混淆）
	-keepclassmembers class **{
    @com.yihubang.frame.simpleannotion.annotion.Extra <fields>;
    @com.yihubang.frame.simpleannotion.annotion.LongClick <methods>;
    @com.yihubang.frame.simpleannotion.annotion.ViewById <fields>;
    @com.yihubang.frame.simpleannotion.annotion.EFragmentArg <fields>;
    @com.yihubang.frame.simpleannotion.annotion.AnimationRes <fields>;
    @com.yihubang.frame.simpleannotion.annotion.CheckedChange <methods>;
    @com.yihubang.frame.simpleannotion.annotion.Click <methods>;
    @com.yihubang.frame.simpleannotion.annotion.AfterViews <methods>;
}