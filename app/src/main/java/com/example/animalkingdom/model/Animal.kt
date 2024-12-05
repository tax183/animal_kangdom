package com.example.animalkingdom.model

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//This model code is written by Dina Abdulaziz Alnomi
data class Animal(@StringRes val stringResourceId: Int,
                  @DrawableRes val imageResourceId: Int,
                   @StringRes val  detailResourcedId: Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(stringResourceId)
        parcel.writeInt(imageResourceId)
        parcel.writeInt(detailResourcedId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }


}
