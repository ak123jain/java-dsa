package Stacks;

public class LargestRectangle {
    public static void main(String[] args) {

    }
}

// largest rectangle in histogram
// give an array of integer height representing  the histogram bar height where the width of each bar is 1 return the largest area of rectangle in the histogram


// 2  1  5  6  2  3      2  1   10  2  3  height of rectangle
// width of all rectangle = 1


// jis rectangle ka area jada hoga vo return karna ha
// how to check area of retangle = eg for 5

// previous smaller elemenet or next smaller elemenet ==> element = rectangle
// 5 height se kam jo bhi previous ma  rectangle hoga or  5 height se kam jo bhi next ma  rectangle hoga usko jod ke area nikal lege

// kyuki agar koi rectangle ki height previous ma 5 se jyada hui to rectangle nahi banega
//
// kyuki agar koi rectangle ki next ma  5 se jyada hui to rectangle nahi banega



// we check next smaller element

// check copy
// next smaller element right to left nikala ha copy ma or previous smaller elmenet left to right
//jinko hmna  next smaller element -1 mana tha unlo ma idx+1 man luga unka rectangle ek dam last tak ban sakta ha
//lekin jinka psm nahi ha unko previous smaller element -1 he mana ge

















