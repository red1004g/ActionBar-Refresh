package com.ko.classting.library.refresh.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
class CompatV16 {

    static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

}
