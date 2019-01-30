# ContentProvider
Content Provider and Application initialization

multiprocess is ignored for ContentProvider when app components are hosted in multiple processes.

Android documentation is outdated https://developer.android.com/guide/topics/manifest/provider-element#multi

android:multiprocess
If the app runs in multiple processes, this attribute determines whether multiple instances of the content provider
are created. If true, each of the app's processes has its own content provider object. If false, the app's processes
share only one content provider object. The default value is false. Setting this flag to true may improve performance
by reducing the overhead of interprocess communication, but it also increases the memory footprint of each process.
