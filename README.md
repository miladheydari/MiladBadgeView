# milad badge view
badge view for android
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
	        compile 'com.github.miladheydari:MiladBadgeView:1.0.0'
	}
```
or download https://github.com/miladheydari/MiladBadgeView/blob/master/app/release/MiladBadgeView.jar and copy to libs project folder.
# usage
```Java 
TextView tv=(TextView)findViewById(R.id.tv);
MiladBadgeView mbv=new MiladBadgeView(getActivity());
mbv.setTarget(tv);
mbv.setText("1");
```

