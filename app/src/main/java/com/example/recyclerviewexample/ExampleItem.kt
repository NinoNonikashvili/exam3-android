package com.example.recyclerviewexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExampleItem (val name: String, val lastName:String, val email:String
                    ):Parcelable