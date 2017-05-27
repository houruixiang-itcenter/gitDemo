# gitDemo
自定义prograssDiaLog 用于定制自定义loading-dialog  ---->android studio
添加依赖 :
    compile 'com.android.support:appcompat-v7:25.2.0'
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:recyclerview-v7:26.0.0-alpha1
自定义dialog的anim
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">
    <rotate
        android:interpolator="@android:anim/linear_interpolator"
        android:pivotX="50%"
        android:pivotY="50%"
        android:fromDegrees="0"
        android:toDegrees="+360"
        android:duration="1500"
        android:startOffset="-1"
        android:repeatMode="restart"
        android:repeatCount="-1"/>
</set>
自定义dialog的style
<style name="CustomDialog" parent="Theme.AppCompat.Dialog">
        <item name="android:backgroundDimEnabled">true</item>
        <item name="android:windowBackground">@android:color/transparent</item>
        <item name="colorAccent">#ffE91E63</item>
    </style>
    
useing...:
点击recyclerView的每一个item 会出现loading-dialog 详看code中的具体实现
