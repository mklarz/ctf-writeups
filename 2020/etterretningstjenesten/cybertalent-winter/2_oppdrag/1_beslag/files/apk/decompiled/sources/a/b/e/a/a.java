package a.b.e.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f56b;

    public a(Drawable drawable) {
        Drawable drawable2 = this.f56b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f56b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f56b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f56b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f56b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f56b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f56b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f56b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f56b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f56b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f56b.getPadding(rect);
    }

    public int[] getState() {
        return this.f56b.getState();
    }

    public Region getTransparentRegion() {
        return this.f56b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f56b.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f56b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f56b.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f56b.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f56b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f56b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f56b.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f56b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f56b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f56b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f56b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f56b.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f56b.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f56b.setState(iArr);
    }

    public void setTint(int i) {
        this.f56b.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f56b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f56b.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f56b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
