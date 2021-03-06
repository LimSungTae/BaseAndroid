/*
 * Copyright Fobid. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tfc.library.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.tfc.base.R;

/**
 * author @Fobid
 */
public class SwipeableViewPager extends ViewPager {

    private boolean mIsSwipeable;

    public SwipeableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.BaseViewPager);
        mIsSwipeable = a.getBoolean(R.styleable.BaseViewPager_swipeable, true);

        a.recycle();
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return !mIsSwipeable || super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return !mIsSwipeable || super.onInterceptTouchEvent(ev);
    }
}
