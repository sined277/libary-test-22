package com.libarytest22

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = LibaryTest22Module.NAME)
class LibaryTest22Module(reactContext: ReactApplicationContext) :
  NativeLibaryTest22Spec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = "LibaryTest22"
  }
}
