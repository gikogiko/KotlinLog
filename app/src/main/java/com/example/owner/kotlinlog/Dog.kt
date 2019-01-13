package com.example.owner.kotlinlog

import android.util.Log

class Dog {
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(){
        this.name = ""
        this.age = 0
    }

    //メソッド
    fun say(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

}