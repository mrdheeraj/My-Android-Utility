# MyAndroidUtility

1) utility classes that implement static methods. In that case you just call them directly using class name

2) utility classes methods that are not static - requires creating and possibly initializing an instance of that class. Then the instance is used to call those methods.

3) utility classes that can be accessed thru Context. then you can call getApplicationContext() and then you can get access to the utility classes
