# milad badge view
badge view for android
![Demos](https://github.com/miladheydari/MiladBadgeView/blob/master/capture/device-2016-09-22-174932.png "Demos")&nbsp;
![Demos](https://github.com/miladheydari/MiladBadgeView/blob/master/capture/device-2016-09-22-175029.png "Demos")

***
simple and useful
***
Install
=====

Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
}
```
Add the dependency

```groovy
	dependencies {
	        compile 'com.github.miladheydari:MiladBadgeView:1.1.0'
	}
```
or download https://github.com/miladheydari/MiladBadgeView/blob/master/miladbadgeview/release/MiladBadgeView.jar and copy to libs project folder.
# usage
```Java 
TextView tv=(TextView)findViewById(R.id.tv);
MiladBadgeView mbv=new MiladBadgeView(getActivity());
mbv.setTargetView(tv);
mbv.setText("1");
```

