# EasyAnntion
EasyAnntion是一套便捷式注解框架，利用注解进行xml与界面(Activity,Fragment)的绑定；控件与基本事件的绑定；View模块化<br>(FrameViewGroup)的处理。此框架在注解的基础上集成了一个通用型SimpleBaseAdapter来处理列表问题，让开发者只关注viewHolder的处理，<br>
不需要频繁的创建Adapter.(并包含二级列表通用型SimpleExpandableListAdapter以及Recyclerview的通用型RecycleBaseAdapter等).
## 实现原理
注解的基本实现用到了Java反射(如果对反射的性能比较敏感的就慎用了)，View模块化以及通用型Adapter的实现大量的用到了Java的一些东西(泛型、类的基本属性以及Java的一些API等)。
## 使用方法
### gradle引入
	compile 'org.chengnuovax:easyanontion-api:1.0.0'