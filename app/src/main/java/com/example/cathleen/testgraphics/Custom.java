package com.example.cathleen.testgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Cathleen on 2016/9/7.
 */
public class Custom extends View {
    public Custom(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画布颜色
        canvas.drawColor(Color.GREEN);
        //新建画笔
        Paint paint = new Paint();
        //画笔颜色
        paint.setColor(Color.RED);
        //抗锯齿
        paint.setAntiAlias(true);
        //填充类型 STROKE空心 FILL实心 FILL_AND_STROKE
        paint.setStyle(Paint.Style.FILL);
        //画笔宽度
        paint.setStrokeWidth(5);
        //绘制普通矩形,左右边距画布左，上下边距画布上
        canvas.drawRect(10,10,140,100,paint);
        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(20, 110);//多边形起点
        path.lineTo(200, 200);//画向下一个点
        path.lineTo(100, 200);
        path.close();//闭合
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);
        Path path2=new Path();
        path2.moveTo(600, 170);//多边形起点
        path2.lineTo(400, 200);//画向下一个点
        path2.lineTo(100, 200);
        path2.lineTo(150, 400);
        path2.lineTo(600, 350);
        path2.close();//闭合
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path2, paint);
        //绘制文本
         paint.setTextSize(50);
        paint.setColor(Color.BLUE);
        paint.setStrikeThruText(true);
        canvas.drawText("lalala", 50, 300, paint);
        Path pathText=new Path();
        pathText.addCircle(300,700,250, Path.Direction.CCW);
        canvas.drawTextOnPath("hello,my name is yinzixuan",
                pathText,2,5,paint);
    }
}
