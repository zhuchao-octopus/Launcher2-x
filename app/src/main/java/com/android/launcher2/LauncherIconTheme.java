package com.android.launcher2;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.android.launcher.R;

public final class LauncherIconTheme {
    private final static String TAG = "LauncherIconTheme";

    //根据包名、类名获取Bitmap
    public static Bitmap getIconBitmap(Context context, String packageName, String className) {
        Resources resources = context.getResources();
        int iconId = getIconId(packageName, className);
        if (iconId != -1) {
            return BitmapFactory.decodeResource(resources, iconId);
        }
        return null;
    }

    //根据包名、类名获取Drawable   要用到的就是这个方法
    public static Drawable getIconDrawable(Context context, String packageName, String className) {
        Resources resources = context.getResources();
        int iconId = getIconId(packageName, className);
        if (iconId != -1) {
            return resources.getDrawable(iconId,null);
        }
        return null;
    }

    //根据包名、类名获取资源定义的图标资源id
    private static int getIconId(String packageName, String className) {
        if(packageName.equals("com.zoulou.dab") && className.equals("com.zoulou.dab.activity.MainActivity"))
        {
            return R.drawable.ic_dab;
        }

        if(packageName.equals("com.my.bt") && className.equals("com.my.bt.ATBluetoothActivity"))
        {
            return R.drawable.ic_bt;
        }

        if(packageName.equals("com.suding.speedplay") && className.equals("com.suding.speedplay.ui.MainActivity"))
        {
            return R.drawable.ic_carplay;
        }

        if(packageName.equals("com.car.ui") && className.equals("com.my.radio.RadioActivity"))
        {
            return R.drawable.ic_radio;
        }
        if(packageName.equals("com.car.ui") && className.equals("com.my.video.VideoActivity"))
        {
            return R.drawable.ic_video;
        }

        if(packageName.equals("com.car.ui") && className.equals("com.my.audio.MusicActivity"))
        {
            return R.drawable.ic_music;
        }

        if(packageName.equals("com.car.ui") && className.equals("com.my.btmusic.BTMusicActivity"))
        {
            return R.drawable.apps_bt_music;
        }

        if(packageName.equals("com.car.ui") && className.equals("com.my.auxplayer.AUXPlayer"))
        {
            return R.drawable.apps_aux;
        }

        if(packageName.equals("com.car.ui") && className.equals("com.my.frontcamera.FrontCameraActivity"))
        {
            return R.drawable.apps_fcam;
        }

        if(packageName.equals("com.android.settings") && className.equals("com.android.settings.Settings"))
        {
            return R.drawable.apps_setting;
        }
        if(packageName.equals("com.anydesk.anydeskandroid") && className.equals("com.anydesk.anydeskandroid.gui.activity.MainActivity"))
        {
            return R.drawable.apps_anydesk;
        }
        if(packageName.equals("com.my.instructions") && className.equals("com.my.instructions.InstructionsActivity"))
        {
            return R.drawable.apps_manuale;
        }
        if(packageName.equals("com.android.gallery3d") && className.equals("com.android.gallery3d.app.GalleryActivity"))
        {
            return R.drawable.apps_gallery;
        }
        if(packageName.equals("com.SwcApplication") && className.equals("com.SwcApplication.SwcActivity"))
        {
            return R.drawable.apps_swc;
        }

        if(packageName.equals("com.android.deskclock") && className.equals("com.android.deskclock.DeskClock"))
        {
            return R.drawable.apps_clock;
        }

        if(packageName.equals("com.canboxsetting") && className.equals("com.canboxsetting.CanAirControlActivity"))
        {
            return R.drawable.car_acc;
        }

        if(packageName.equals("com.canboxsetting") && className.equals("com.canboxsetting.MainActivity"))
        {
            return R.drawable.car_3;
        }

        if(packageName.equals("com.canboxsetting") && className.equals("com.canboxsetting.CarInfoActivity"))
        {
            return R.drawable.car_1;
        }

        if(packageName.equals("com.canboxsetting") && className.equals("com.canboxsetting.JeepCarCDPlayerActivity"))
        {
            return R.drawable.car_2;
        }

        return -1;
    }

    public static String getTitle(Context context, String packageName, String className) {

        if(packageName.equals("com.zoulou.dab") || className.equals("com.zoulou.dab.activity.MainActivity"))
        {
            //return null;
            return context.getString(R.string.dab);
        }

        else if(packageName.equals("com.my.bt") && className.equals("com.my.bt.ATBluetoothActivity"))
        {
            return null;
        }

        else if(packageName.equals("com.suding.speedplay") && className.equals("com.suding.speedplay.ui.MainActivity"))
        {
            return context.getString(R.string.car_play_connection);
        }

        else if(packageName.equals("com.car.ui") && className.equals("com.my.radio.RadioActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.car.ui") && className.equals("com.my.video.VideoActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.car.ui") && className.equals("com.my.audio.MusicActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.car.ui") && className.equals("com.my.btmusic.BTMusicActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.car.ui") && className.equals("com.my.auxplayer.AUXPlayer"))
        {
            return null;
        }

        else if(packageName.equals("com.car.ui") && className.equals("com.my.frontcamera.FrontCameraActivity"))
        {
            return null;
        }

        else if(packageName.equals("com.android.settings") && className.equals("com.android.settings.Settings"))
        {
            return null;
        }
        else if(packageName.equals("com.anydesk.anydeskandroid") && className.equals("com.anydesk.anydeskandroid.gui.activity.MainActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.my.instructions") && className.equals("com.my.instructions.InstructionsActivity"))
        {
            return context.getString(R.string.manual);
        }
        else if(packageName.equals("com.android.gallery3d") && className.equals("com.android.gallery3d.app.GalleryActivity"))
        {
            return null;
        }
        else if(packageName.equals("com.SwcApplication") && className.equals("com.SwcApplication.SwcActivity"))
        {
            return context.getString(R.string.swcapplication);
        }
        else if(packageName.equals("com.android.deskclock") && className.equals("com.android.deskclock.DeskClock"))
        {
            return null;
        }
        else
        {
            return null;
        }
    }

}