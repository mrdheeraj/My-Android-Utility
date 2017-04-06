package com.mrdheerajpurohit.utility;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

/**
 * Dheeraj Purohit Permissions utility (Android M and above)
 */

public class PermissionsUtility {

    public static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 123;
    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 124;
    public static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 125;
    public static final int MY_PERMISSIONS_REQUEST_READ_CALENDAR = 126;
    public static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 127;
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 128;
    public static final int MY_PERMISSIONS_REQUEST_MICROPHONE = 129;
    public static final int MY_PERMISSIONS_REQUEST_SENSORS = 130;
    public static final int MY_PERMISSIONS_REQUEST_SMS = 131;
    public static final int MY_PERMISSIONS_All = 132;

    public static final String p1 = Manifest.permission.READ_EXTERNAL_STORAGE, p2 = Manifest.permission.CAMERA,
           p3 = Manifest.permission.READ_PHONE_STATE, p4 = Manifest.permission.READ_CALENDAR,
           p5 = Manifest.permission.READ_CONTACTS, p6 = Manifest.permission.ACCESS_FINE_LOCATION,
           p7 = Manifest.permission.RECORD_AUDIO, p8 = Manifest.permission.BODY_SENSORS,
           p9 = Manifest.permission.SEND_SMS ;

    //put your app name here
    public static final String AppName ="Dheeraj Purohit App";


    //-------------------------------------------------------------//
    //We are calling following method for Requesting permission

    public static boolean checkPermissionSTORAGE(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to Store Data on your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionCAMERA(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.CAMERA)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Camera Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionPHONE(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {

            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_PHONE_STATE)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permissions to read Phone Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_PHONE_STATE}, MY_PERMISSIONS_REQUEST_READ_PHONE_STATE);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_PHONE_STATE}, MY_PERMISSIONS_REQUEST_READ_PHONE_STATE);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionCALENDAR(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {

            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_CALENDAR)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permissions to read Calendar Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_CALENDAR}, MY_PERMISSIONS_REQUEST_READ_CALENDAR);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_CALENDAR}, MY_PERMISSIONS_REQUEST_READ_CALENDAR);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionCONTACTS(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_CONTACTS)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Contact Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_CONTACTS}, MY_PERMISSIONS_REQUEST_READ_CONTACTS);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_CONTACTS}, MY_PERMISSIONS_REQUEST_READ_CONTACTS);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionLOCATION(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.ACCESS_FINE_LOCATION)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Location Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionMICROPHONE(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.RECORD_AUDIO)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Microphone Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.RECORD_AUDIO}, MY_PERMISSIONS_REQUEST_MICROPHONE);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.RECORD_AUDIO}, MY_PERMISSIONS_REQUEST_MICROPHONE);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionSENSORS(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.BODY_SENSORS) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.BODY_SENSORS)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Sensor Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.BODY_SENSORS}, MY_PERMISSIONS_REQUEST_SENSORS);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.BODY_SENSORS}, MY_PERMISSIONS_REQUEST_SENSORS);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionSMS(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.SEND_SMS)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission to read Sms Status of your phone. Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SMS);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SMS);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public static boolean checkPermissionAll(final Context context, final String permission)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>= Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, permission)) {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true);
                    alertBuilder.setTitle("Permission Required");
                    alertBuilder.setMessage(AppName + " requires permission.Please provide the required permissions on the next screen.");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) context, new String[]{permission}, MY_PERMISSIONS_All);
                        }
                    });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();

                } else {


                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{permission}, MY_PERMISSIONS_All);
                    }

                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    //-------------------------------------------------------------//
    //We are calling following method to check the permission status

    public static boolean onlyCheckPermissionSTORAGE(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionCAMERA(final Context context){
        if (Build.VERSION.SDK_INT >= 23) {

        int result = ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA);
        if (result == PackageManager.PERMISSION_GRANTED){

            return true;

        } else {

            return false;

        }
        }
        else
        {
            return  true;

        }

    }
    public static boolean onlyCheckPermissionPHONE(final Context context){
        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE);
            if (result == PackageManager.PERMISSION_GRANTED){

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }

    }
    public static boolean onlyCheckPermissionCALENDAR(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CALENDAR);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionCONTACTS(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CONTACTS);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionLOCATION(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionMICROPHONE(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionSENSORS(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.BODY_SENSORS);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionSMS(final Context context) {

        if (Build.VERSION.SDK_INT >= 23) {

            int result = ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS);
            if (result == PackageManager.PERMISSION_GRANTED) {

                return true;

            } else {

                return false;

            }
        }
        else
        {
            return  true;

        }
    }
    public static boolean onlyCheckPermissionAll(final Context context) {

        if(!PermissionsUtility.onlyCheckPermissionSTORAGE(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionCAMERA(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionPHONE(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionCALENDAR(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionCONTACTS(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionLOCATION(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionMICROPHONE(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionSENSORS(context))
        {
            return false;
        }
        if(!PermissionsUtility.onlyCheckPermissionSMS(context))
        {
            return false;
        }
        return true;
    }

    public static void CheckPermissionAll(final Context context) {

        if(!PermissionsUtility.onlyCheckPermissionSTORAGE(context))
        {
            checkPermissionAll(context,p1);
        }
        else if(!PermissionsUtility.onlyCheckPermissionCAMERA(context))
        {
            checkPermissionAll(context,p2);

        }
        else if(!PermissionsUtility.onlyCheckPermissionPHONE(context))
        {
            checkPermissionAll(context,p3);

        }
        else if(!PermissionsUtility.onlyCheckPermissionCALENDAR(context))
        {
            checkPermissionAll(context,p4);

        }
        else if(!PermissionsUtility.onlyCheckPermissionCONTACTS(context))
        {
            checkPermissionAll(context,p5);

        }
        else if(!PermissionsUtility.onlyCheckPermissionLOCATION(context))
        {
            checkPermissionAll(context,p6);

        }
        else if(!PermissionsUtility.onlyCheckPermissionMICROPHONE(context))
        {
            checkPermissionAll(context,p7);

        }
        else if(!PermissionsUtility.onlyCheckPermissionSENSORS(context))
        {
            checkPermissionAll(context,p8);

        }
        else if (!PermissionsUtility.onlyCheckPermissionSMS(context))
        {
            checkPermissionAll(context,p9);

        }
        else
        {
            Toast.makeText(context, "All permission granted", Toast.LENGTH_SHORT).show();
        }
    }

}

