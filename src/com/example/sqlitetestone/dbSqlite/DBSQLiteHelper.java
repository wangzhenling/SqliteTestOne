package com.example.sqlitetestone.dbSqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSQLiteHelper extends SQLiteOpenHelper {
	
	//���Ĭ����ں��������캯��
	//���캯�����ĸ�����
	public DBSQLiteHelper(Context context, String name, CursorFactory factory,int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	//���캯������������
	public DBSQLiteHelper(Context context,String name,int version){
		super(context,name,null,version);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		System.out.println("Creating Database......");
		String CreateTableSql="creat table userlogin("
		          +"_id integer primary key autoincrement,"
		          +"username varchar,"
                  +"password varchar"
		          +"loginNum interger,"
		          +"loginDateTime text)";
		db.execSQL(CreateTableSql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}

