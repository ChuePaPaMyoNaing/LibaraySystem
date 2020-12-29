package jp.co.cybermissions.com.example.libaraysystem.book

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book (val imageResId: Int,
                 val name: String,
                 val description: String) : Parcelable
