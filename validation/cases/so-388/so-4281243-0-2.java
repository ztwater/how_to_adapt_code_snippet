public class foo {
public void foo(){
PackageManager packageManager = context.getPackageManager();
Intent alarmClockIntent = new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER);

// Verify clock implementation
String clockImpls[][] = {
        {"HTC Alarm Clock", "com.htc.android.worldclock", "com.htc.android.worldclock.WorldClockTabControl" },
        {"Standar Alarm Clock", "com.android.deskclock", "com.android.deskclock.AlarmClock"},
        {"Froyo Nexus Alarm Clock", "com.google.android.deskclock", "com.android.deskclock.DeskClock"},
        {"Moto Blur Alarm Clock", "com.motorola.blur.alarmclock",  "com.motorola.blur.alarmclock.AlarmClock"},
        {"Samsung Galaxy Clock", "com.sec.android.app.clockpackage","com.sec.android.app.clockpackage.ClockPackage"} ,
        {"Sony Ericsson Xperia Z", "com.sonyericsson.organizer", "com.sonyericsson.organizer.Organizer_WorldClock" },
        {"ASUS Tablets", "com.asus.deskclock", "com.asus.deskclock.DeskClock"}

};

boolean foundClockImpl = false;

for(int i=0; i<clockImpls.length; i++) {
    String vendor = clockImpls[i][0];
    String packageName = clockImpls[i][1];
    String className = clockImpls[i][2];
    try {
        ComponentName cn = new ComponentName(packageName, className);
        ActivityInfo aInfo = packageManager.getActivityInfo(cn, PackageManager.GET_META_DATA);
        alarmClockIntent.setComponent(cn);
        debug("Found " + vendor + " --> " + packageName + "/" + className);
        foundClockImpl = true;
    } catch (NameNotFoundException e) {
        debug(vendor + " does not exists");
    }
}

if (foundClockImpl) {
    PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, alarmClockIntent, 0);
        // add pending intent to your component
        // ....
}
}
}