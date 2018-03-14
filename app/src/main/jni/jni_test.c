//
// Created by Administrator on 2018/3/13.
//
#include<com_smile_mygeeknews_ui_main_WelcomeActivity.h>

JNIEXPORT jint JNICALL Java_com_smile_mygeeknews_ui_main_WelcomeActivity_calculate
  (JNIEnv *env, jclass cls, jint num){
    return num * num;
  }
