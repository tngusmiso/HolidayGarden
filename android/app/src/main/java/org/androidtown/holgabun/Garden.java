package org.androidtown.holgabun;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.androidtown.holgabun.R;
=======
import android.graphics.Bitmap;
>>>>>>> 9837d2f... [7/13]feature/가든 상세정보창 구현
=======
import android.graphics.Bitmap;
>>>>>>> 9b40e82... 0716 [feature/android/Main 수정]
=======
import android.graphics.Bitmap;
>>>>>>> d7162a6... 0719 jiyoon
=======
import android.graphics.Bitmap;
>>>>>>> d1dfbf9238f85c1096f89daad4c6cefac028047a

public class Garden {
    String name;
    Bitmap imgno;
    String address;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    final static int imalist[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};
=======
>>>>>>> 9837d2f... [7/13]feature/가든 상세정보창 구현
=======
>>>>>>> 9b40e82... 0716 [feature/android/Main 수정]
=======
>>>>>>> d7162a6... 0719 jiyoon
=======
>>>>>>> d1dfbf9238f85c1096f89daad4c6cefac028047a


    public Garden (String name, Bitmap imgno, String address){
        this.name=name;
        this.imgno = imgno;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Bitmap getImgno(){
        return imgno;
    }

    public void setImgno(Bitmap imgno){
        this.imgno = imgno;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

}