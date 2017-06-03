package com.jeremy.javacoding;

import android.widget.ImageView;

/**
 * Created by Jeremy L on 6/3/2017.
 */

public class Life {
    private ImageView imageView;
    private Boolean full;
    private Boolean threeFourths;
    private Boolean half;
    private Boolean oneFourth;
    private Boolean none;

    public Life(ImageView imageView, Boolean full, Boolean threeFourths, Boolean half, Boolean oneFourth, Boolean none) {
        this.imageView = imageView;
        this.full = full;
        this.threeFourths = threeFourths;
        this.half = half;
        this.oneFourth = oneFourth;
        this.none = none;
    }

    public Life() {
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setLife(ImageView imageView) {
        this.imageView = imageView;
    }

    public Boolean getNone() {
        return none;
    }

    public void setNone(Boolean none) {
        this.none = none;
    }

    public Boolean getOneFourth() {
        return oneFourth;
    }

    public void setOneFourth(Boolean oneFourth) {
        this.oneFourth = oneFourth;
    }

    public Boolean getHalf() {
        return half;
    }

    public void setHalf(Boolean half) {
        this.half = half;
    }

    public Boolean getThreeFourths() {
        return threeFourths;
    }

    public void setThreeFourths(Boolean threeFourths) {
        this.threeFourths = threeFourths;
    }

    public Boolean getFull() {
        return full;
    }

    public void setFull(Boolean full) {
        this.full = full;
    }
}
