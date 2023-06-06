#include "stdio.h"
#include "Demo.h"
#include "Demo.h"
JNIEXPORT void JNICALL Java_Demo_increment(JNIEnv *x, jclass obj, jint i){
    int j = i++ + i++ + i++ ;
    printf("Value of j is : %d \n",j);
    printf("Value of i is : %d \n",i);
}