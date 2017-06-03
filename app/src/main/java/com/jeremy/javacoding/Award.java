package com.jeremy.javacoding;

import android.widget.ImageView;

/**
 * Created by Jeremy L on 6/3/2017.
 */

class Award {
    private String type;
    private String benefits;
    private ImageView image;

    Award(String type, String benefits, ImageView image) {
        this.type = type;
        this.benefits = benefits;
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
