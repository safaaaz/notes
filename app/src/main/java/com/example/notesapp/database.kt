package com.example.notesapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

var databasename="datab"
var datatable="userstable"
var col_name="colname"
var col_pass="colpass"

class databaseh(var context: Context):SQLiteOpenHelper(context, databasename,null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        val creatusers="CREATE TABLE "+ datatable+" ("+
        col_name+" VARCHAR(256), "+
        col_pass+" VARCHAR(256))";

        db?.execSQL(creatusers)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun add(user:user)
    {
        val db=this.writableDatabase
        var cv = ContentValues()
        cv.put(col_name,user.name)
        cv.put(col_pass,user.password)
        print("----------------------------------------------------")
        val c="SELECT * FROM "+datatable;
        print(db.toString())
        print("----------------------------------------------------")

        var result= db.insert(datatable,null,cv)
        if(result==-1.toLong()){
            Toast.makeText(context,"failed",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"success",Toast.LENGTH_LONG).show()

        }
    }

}