package net.briangbutterfield.training.yamba;

//NOTE:
//Replaced with Content Provider

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.provider.BaseColumns;
//import android.util.Log;

//public class TimelineHelper extends SQLiteOpenHelper 
//{
//	private static final String TAG = "TimelineHelper";
//
//	private static final String DB_NAME = "timeline.db";
//	private static final int DB_VERSION = 1;
//	
//	public static final String T_TIMELINE = "timeline";
//	public static final String KEY_ID = BaseColumns._ID;  //Primary Key on table. 
//	public static final String KEY_USER = "user";
//	public static final String KEY_MESSAGE = "message";
//	public static final String KEY_CREATED_AT	= "created_at";
//
//	//Create Table Statement.
//	private static final String DB_CREATE
//		= "create table " + T_TIMELINE + " ( "
//		+ KEY_ID + " integer primary key, "
//		+ KEY_USER + " text, "
//		+ KEY_MESSAGE + " text, "
//		+ KEY_CREATED_AT + " integer "
//		+ ");";
//
//	public TimelineHelper(Context context) 
//	{
//		super(context, DB_NAME, null, DB_VERSION);
//	}
//
//	@Override
//	public void onCreate(SQLiteDatabase db) 
//	{
//		Log.d(TAG, "Creating database");
//		
//		//Execute the Create Table statement.
//		db.execSQL(DB_CREATE);
//	}
//
//	@Override
//	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
//	{
//		Log.d(TAG, "Upgrading database from version " + oldVersion + " to version  " + newVersion);
//		db.execSQL("drop table if exists " + T_TIMELINE);
//		onCreate(db);
//	}
//
//}
