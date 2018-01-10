package com.codility.recyclerpicasso

import java.io.Serializable

/**
 * Created by Govind on 01/09/2018.
 */

class Version(val imageUrl: String, val name: String) : Serializable {

    companion object {

        fun getAndroidVersionList(versionList: MutableList<Version>): List<Version> {
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/cup_cake.png", "Cup Cake"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/donut.png", "Donut"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/eclair.png", "Eclair"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/Froyo.jpg", "Froyo"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/gingerbread.png", "Ginger Bread"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/honeycomb.png", "Honeycomb"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/Ice-Cream-Sandwitch.png", "Ice-Cream-Sandwitch"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/jellybean.png", "Jellybean"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/kitkat.png", "Kitkat"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/lollipop.png", "Lollipop"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/marshMallow.png", "MarshMallow"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/nougat.png", "Nougat"))
            versionList.add(Version("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/oreo.png", "Oreo"))
            return versionList
        }
    }
}